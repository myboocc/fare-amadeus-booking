package com.intlgds.fare.amadeus.booking.client;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

import com.intlgds.amadeus.booking.service.AmadeusBookingService.Client;




public class FarePriceClient {
	
	private static String confFilePath = "config/amadeusBookingClientConf.properties"; 
	private static List<ClientConf> conflist;
	private static Iterator<ClientConf> it;
	private static ClientConf config;
	static {
		try {
			ClientConf conf = new ClientConf(
					PropertiesUtil.getPropertiesContextByKey(confFilePath, "clientip"),
					Integer.parseInt(PropertiesUtil.getPropertiesContextByKey(confFilePath, "clientport")),
					Integer.parseInt(PropertiesUtil.getPropertiesContextByKey(confFilePath, "timeout"))
					);
			conflist.add(conf);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static synchronized Client getThriftClient() throws TTransportException{
		if (it.hasNext()) {
			config = it.next();
		} else {
			it = conflist.iterator();
			config = it.next();
		}
		TTransport transport = new TFramedTransport(new TSocket(config.getClientip(), config.getClientport(), config.getTimeout()));  
		transport.open();
		TProtocol protocol = new TCompactProtocol(transport);  
		return new Client(protocol);  
	}
	
	private static void closeClient(Client client){
		client.getInputProtocol().getTransport().close();
	}
	
	private static Client getclient() throws TException {
		Client client = null;
		try {
			client = getThriftClient();
		} catch (TTransportException e) {
			try {
				client = getThriftClient();
			} catch (TTransportException e2) {
				try {
					client = getThriftClient();
				} catch (TTransportException e3) {
					throw new TException(e);
				}
			}
		}
		return client;
	}
	
//	public static AmadeusBookingResponse amadeusFareSearch(AmadeusBookingRequest request) throws TException {
//		Client client = getclient();
//		try {
//			return client.amadeusFareSearch(request);
//		} finally {
//			closeClient(client);
//		}
//	}
//	
//	public static ShoppingAmadeusIPIBPReply searchIPFromGDS(ShoppingAmadeusIPIBPRequest request) throws TException {
//		Client client = getclient();
//		try {
//			return client.searchIPFromGDS(request);
//		} finally {
//			closeClient(client);
//		}
//	}
	
}
class ClientConf{
	private String clientip;
	private int clientport;
	private int timeout;
	public ClientConf(String clientip, int clientport, int timeout) {
		this.clientip = clientip;
		this.clientport = clientport;
		this.timeout = timeout;
	}
	public String getClientip() {
		return clientip;
	}
	public void setClientip(String clientip) {
		this.clientip = clientip;
	}
	public int getClientport() {
		return clientport;
	}
	public void setClientport(int clientport) {
		this.clientport = clientport;
	}
	public int getTimeout() {
		return timeout;
	}
	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}
}

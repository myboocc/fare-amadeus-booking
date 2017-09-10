package com.intlgds.booking.service.impl;

import java.util.List;

import org.apache.thrift.TException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.intlgds.amadeus.booking.endorse.EndorseRequest;
import com.intlgds.amadeus.booking.endorse.EndorseResponse;
import com.intlgds.amadeus.booking.pnrmonitor.PnrMonitorRequest;
import com.intlgds.amadeus.booking.pnrmonitor.PnrMonitorResponse;
import com.intlgds.amadeus.booking.proto.request.AmadeusBookingRequest;
import com.intlgds.amadeus.booking.proto.request.AmadeusBookingResponse;
import com.intlgds.amadeus.booking.refund.RefundRequest;
import com.intlgds.amadeus.booking.refund.RefundResponse;
import com.intlgds.amadeus.booking.route.Route;
import com.intlgds.amadeus.booking.service.AmadeusBookingService;
import com.intlgds.amadeus.booking.ticketing.TicketingRequest;
import com.intlgds.amadeus.booking.ticketing.TicketingResponse;
import com.intlgds.booking.comvertor.request.AmadeusBookingRequestToAmadeusRequest;

public class AmadeusBookingServiceImpl implements AmadeusBookingService.Iface{
	
	private static Logger logger = LoggerFactory.getLogger(AmadeusBookingServiceImpl.class);

	@Override
	public AmadeusBookingResponse amadeusBookingRequest(AmadeusBookingRequest request) throws TException {
		// 转换成 amadeusBooking请求对象
		logger.info("AmadeusBookingRequest: ", request);
		// 1: 预定座位
//		AmadeusBookingRequestToAmadeusRequest.AmadeusBookingRequest2SellFromRecommendationRequest(request);
		// 2：添加旅客相关信息
		
		// 3：计算价格
		
		// 4：保存价格
		
		// 5：10 封口
		
		
		
		return null;
	}

	@Override
	public PnrMonitorResponse amadeusPNRMonitorRequest(PnrMonitorRequest request) throws TException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TicketingResponse amadeusTicketingRequest(TicketingRequest request) throws TException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RefundResponse amadeusRefundRequest(RefundRequest request) throws TException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EndorseResponse amadeusEndorseRequest(EndorseRequest request) throws TException {
		// TODO Auto-generated method stub
		return null;
	}
	

}

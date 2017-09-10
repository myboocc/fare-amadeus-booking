package com.amadeus.booking.test;

import java.math.BigDecimal;

import javax.xml.ws.Holder;

import com.amadeus.api.AmadeusApi;
import com.amadeus.common.CommonReplyBean;
import com.amadeus.common.CommonRequestBean;
import com.amadeus.common.TransactionStatusCode;
import com.amadeus.wsdl._2010._06.ws.link_v1.TransactionFlowLinkType;
import com.amadeus.xml._2010._06.session_v3.Session;
import com.amadeus.xml.pnracc_14_2_1a.PNRReply;
import com.amadeus.xml.pnradd_14_2_1a.PNRAddMultiElements;
import com.amadeus.xml.tautcq_04_1_1a.TicketCreateTSTFromPricing;
import com.amadeus.xml.tautcr_04_1_1a.TicketCreateTSTFromPricingReply;
import com.intlgds.amadeus.client.AmadeusThriftClient;

public class PNRAddMultiElementsTest {
	
	public static void main(String[] args) {
		AmadeusApi client = AmadeusThriftClient.getAmadeusService();
		PNRAddMultiElements pnrAddMultiElements = getRequestData();
		CommonRequestBean<PNRAddMultiElements> request = new CommonRequestBean<PNRAddMultiElements>(pnrAddMultiElements, new Holder<Session>(), new Holder<TransactionFlowLinkType>());
		try {
			CommonReplyBean<PNRReply> resp = client.pnrAddMultiElements(TransactionStatusCode.START, TransactionStatusCode.NONE, "rpid", request);
			PNRReply pnrReply = resp.getReplay();
			System.out.println("pnr ===》 " + pnrReply.getPnrHeader().get(0).getReservationInfo().getReservation().get(0).getControlNumber());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static PNRAddMultiElements getRequestData() {
		PNRAddMultiElements pnrAddMultiElements = new PNRAddMultiElements();
		PNRAddMultiElements.PnrActions pnrActions = new PNRAddMultiElements.PnrActions();
		pnrActions.getOptionCode().add(new BigDecimal("10"));
		pnrAddMultiElements.setPnrActions(pnrActions);
		return pnrAddMultiElements;
	}
	
}

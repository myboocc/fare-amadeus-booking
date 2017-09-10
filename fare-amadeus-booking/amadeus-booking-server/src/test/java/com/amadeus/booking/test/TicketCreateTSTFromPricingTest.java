package com.amadeus.booking.test;

import java.math.BigDecimal;

import javax.xml.ws.Holder;

import com.amadeus.api.AmadeusApi;
import com.amadeus.common.CommonReplyBean;
import com.amadeus.common.CommonRequestBean;
import com.amadeus.common.TransactionStatusCode;
import com.amadeus.wsdl._2010._06.ws.link_v1.TransactionFlowLinkType;
import com.amadeus.xml._2010._06.session_v3.Session;
import com.amadeus.xml.itareq_05_2_ia.AirSellFromRecommendation;
import com.amadeus.xml.itares_05_2_ia.AirSellFromRecommendationReply;
import com.amadeus.xml.tautcq_04_1_1a.TicketCreateTSTFromPricing;
import com.amadeus.xml.tautcr_04_1_1a.TicketCreateTSTFromPricingReply;
import com.intlgds.amadeus.client.AmadeusThriftClient;

public class TicketCreateTSTFromPricingTest {
	
	public static void main(String[] args) {
		AmadeusApi client = AmadeusThriftClient.getAmadeusService();
		TicketCreateTSTFromPricing airSellFromRecommendation = getRequestData();
		CommonRequestBean<TicketCreateTSTFromPricing> request = new CommonRequestBean<TicketCreateTSTFromPricing>(airSellFromRecommendation, new Holder<Session>(), new Holder<TransactionFlowLinkType>());
		try {
			CommonReplyBean<TicketCreateTSTFromPricingReply> resp = client.ticketCreateTSTFromPricing(TransactionStatusCode.START, TransactionStatusCode.NONE, "rpid", request);
			TicketCreateTSTFromPricingReply ticketCreateTSTFromPricingReply = resp.getReplay();
			System.out.println("TicketCreateTSTFromPricingReply===》 " + ticketCreateTSTFromPricingReply.getTstList().size());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static TicketCreateTSTFromPricing getRequestData() {
		TicketCreateTSTFromPricing ticketCreateTSTFromPricing = new TicketCreateTSTFromPricing();
		TicketCreateTSTFromPricing.PsaList psaList = new TicketCreateTSTFromPricing.PsaList();
		TicketCreateTSTFromPricing.PsaList.ItemReference itemReference = new TicketCreateTSTFromPricing.PsaList.ItemReference();
		itemReference.setReferenceType("TST");
		itemReference.setUniqueReference(new BigDecimal("1"));
		psaList.setItemReference(itemReference);
		ticketCreateTSTFromPricing.getPsaList().add(psaList);
		return ticketCreateTSTFromPricing;
	}
	
}

package com.amadeus.booking.test;

import java.math.BigDecimal;

import javax.xml.ws.Holder;

import com.amadeus.api.AmadeusApi;
import com.amadeus.common.CommonReplyBean;
import com.amadeus.common.CommonRequestBean;
import com.amadeus.common.TransactionStatusCode;
import com.amadeus.xml.itareq_05_2_ia.AirSellFromRecommendation;
import com.amadeus.xml.itareq_05_2_ia.AirSellFromRecommendation.ItineraryDetails;
import com.amadeus.xml.itareq_05_2_ia.AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation.FlightDate;
import com.amadeus.xml.itares_05_2_ia.AirSellFromRecommendationReply;
import com.amadeus.xml.pnracc_14_2_1a.PNRReply;
import com.amadeus.xml.pnradd_14_2_1a.PNRAddMultiElements;
import com.amadeus.xml.tautcq_04_1_1a.TicketCreateTSTFromPricing;
import com.amadeus.xml.tautcr_04_1_1a.TicketCreateTSTFromPricingReply;
import com.amadeus.xml.tpcbrq_14_1_1a.FarePricePNRWithBookingClass;
import com.amadeus.xml.tpcbrr_14_1_1a.FarePricePNRWithBookingClassReply;
import com.amadeus.xml.vlssoq_04_1_1a.SecuritySignOut;
import com.amadeus.xml.vlssor_04_1_1a.SecuritySignOutReply;
import com.google.gson.Gson;
import com.intlgds.amadeus.client.AmadeusThriftClient;
import com.amadeus.wsdl._2010._06.ws.link_v1.TransactionFlowLinkType;
import com.amadeus.xml._2010._06.session_v3.Session;

public class AmadeusBookingSellFromRecommendTest {
	
	public static void main(String[] args) {
		AmadeusApi client = AmadeusThriftClient.getAmadeusService();
		AirSellFromRecommendation airSellFromRecommendation = getRequestData();
		CommonRequestBean<AirSellFromRecommendation> request = new CommonRequestBean<AirSellFromRecommendation>(airSellFromRecommendation, new Holder<Session>(), new Holder<TransactionFlowLinkType>());
		try {
			// 预定座位
			CommonReplyBean<AirSellFromRecommendationReply> resp = client.airSellFromRecommendation(TransactionStatusCode.START, TransactionStatusCode.NONE, "rpid", request);
			AirSellFromRecommendationReply airSellFromRecommendationReply = resp.getReplay();
			System.out.println("airSellFromRecommendation==>" + new Gson().toJson(request));
			System.out.println("airSellFromRecommendationReply===》 " + new Gson().toJson(airSellFromRecommendationReply));
			// 添加旅客信息
			PNRAddMultiElements pnrAddMultiElements = AmadeusBookingAddMultiElement.getAddMultiElementsData();
			CommonRequestBean<PNRAddMultiElements> addMultiRequest = new CommonRequestBean<PNRAddMultiElements>(pnrAddMultiElements, new Holder<Session>(resp.getSession()), new Holder<TransactionFlowLinkType>(resp.getLink()));
			CommonReplyBean<PNRReply> addMultiResp = client.pnrAddMultiElements(TransactionStatusCode.CONTINUE, TransactionStatusCode.NONE, "rpid", addMultiRequest);
			System.out.println("PNRReply===》 " + addMultiResp.getReplay().getTravellerInfo().size());
			//计算价格
			FarePricePNRWithBookingClass bookingClass = AmadeusBookingFarePricePNRWithBookingClass.getBookingClassData();
			CommonRequestBean<FarePricePNRWithBookingClass> bookingClassRequest = new CommonRequestBean<FarePricePNRWithBookingClass>(bookingClass, new Holder<Session>(addMultiResp.getSession()), new Holder<TransactionFlowLinkType>(addMultiResp.getLink()));
			CommonReplyBean<FarePricePNRWithBookingClassReply> bookingClassResp = client.farePricePNRWithBookingClass(TransactionStatusCode.CONTINUE, TransactionStatusCode.NONE, "rpid", bookingClassRequest);
			FarePricePNRWithBookingClassReply farePricePNRWithBookingClassReply = bookingClassResp.getReplay();
			System.out.println("FareListSize===》 " + farePricePNRWithBookingClassReply.getFareList().size());
			//保存价格
			TicketCreateTSTFromPricing ticketCreateTSTFromPricing = TicketCreateTSTFromPricingTest.getRequestData();
			CommonRequestBean<TicketCreateTSTFromPricing> TSTRequest = new CommonRequestBean<TicketCreateTSTFromPricing>(ticketCreateTSTFromPricing, new Holder<Session>(bookingClassResp.getSession()), new Holder<TransactionFlowLinkType>(bookingClassResp.getLink()));
			CommonReplyBean<TicketCreateTSTFromPricingReply> TSTresp = client.ticketCreateTSTFromPricing(TransactionStatusCode.CONTINUE, TransactionStatusCode.NONE, "rpid", TSTRequest);
			TicketCreateTSTFromPricingReply ticketCreateTSTFromPricingReply = TSTresp.getReplay();
			System.out.println("TicketCreateTSTFromPricingReply===》 " + ticketCreateTSTFromPricingReply.getTstList().size());
			//返回 pnr 10
			PNRAddMultiElements pnr = PNRAddMultiElementsTest.getRequestData();
			CommonRequestBean<PNRAddMultiElements> pnrRequest = new CommonRequestBean<PNRAddMultiElements>(pnr, new Holder<Session>(TSTresp.getSession()), new Holder<TransactionFlowLinkType>(TSTresp.getLink()));
			CommonReplyBean<PNRReply> pnrResp = client.pnrAddMultiElements(TransactionStatusCode.CONTINUE, TransactionStatusCode.NONE, "rpid", pnrRequest);
			PNRReply pnrReply = pnrResp.getReplay();
			System.out.println("pnr ===》 " + pnrReply.getPnrHeader().get(0).getReservationInfo().getReservation().get(0).getControlNumber());
			
			//退出
			SecuritySignOut securitySignOut = new SecuritySignOut();
			CommonRequestBean<SecuritySignOut> requestSignOutBean = new CommonRequestBean<SecuritySignOut>(securitySignOut, new Holder<Session>(pnrResp.getSession()), new Holder<TransactionFlowLinkType>(pnrResp.getLink()));
			CommonReplyBean<SecuritySignOutReply> signOutReply = client.securitySignOut(TransactionStatusCode.END, TransactionStatusCode.NONE, "rpid", requestSignOutBean);
			System.out.println("signOut Code===> " + signOutReply.getReplay().getProcessStatus().getStatusCode());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static AirSellFromRecommendation getRequestData() {
		AirSellFromRecommendation airSellFromRecommendation = new AirSellFromRecommendation();
		//set MessageFunctionDetails
		AirSellFromRecommendation.MessageActionDetails messageActionDetails = new AirSellFromRecommendation.MessageActionDetails();
		AirSellFromRecommendation.MessageActionDetails.MessageFunctionDetails messageFunctionDetails = new AirSellFromRecommendation.MessageActionDetails.MessageFunctionDetails();
		messageFunctionDetails.setMessageFunction("183");
		messageFunctionDetails.getAdditionalMessageFunction().add("M1");
		messageActionDetails.setMessageFunctionDetails(messageFunctionDetails);
		airSellFromRecommendation.setMessageActionDetails(messageActionDetails);
		
		//set itineraryDetails
		AirSellFromRecommendation.ItineraryDetails itineraryDetails = new AirSellFromRecommendation.ItineraryDetails();
		//set originDestinationDetails
		AirSellFromRecommendation.ItineraryDetails.OriginDestinationDetails originDestinationDetails = new AirSellFromRecommendation.ItineraryDetails.OriginDestinationDetails();
		originDestinationDetails.setOrigin("SHA");
		originDestinationDetails.setDestination("SHA");
		itineraryDetails.setOriginDestinationDetails(originDestinationDetails);
		
		//set message
		AirSellFromRecommendation.ItineraryDetails.Message message = new AirSellFromRecommendation.ItineraryDetails.Message();
		AirSellFromRecommendation.ItineraryDetails.Message.MessageFunctionDetails messageFunctionDetails2 = new AirSellFromRecommendation.ItineraryDetails.Message.MessageFunctionDetails();
		messageFunctionDetails2.setMessageFunction("183");
		message.setMessageFunctionDetails(messageFunctionDetails2);
		itineraryDetails.setMessage(message);
		
		//set segmentinformation 第一段
		AirSellFromRecommendation.ItineraryDetails.SegmentInformation segmentInformation1 = new AirSellFromRecommendation.ItineraryDetails.SegmentInformation();
		AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation travelProductInformation1 = new AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation();
		AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation.FlightDate flightDate1 = new AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation.FlightDate();
		flightDate1.setDepartureDate("151017");
		travelProductInformation1.setFlightDate(flightDate1);
		AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation.BoardPointDetails boardPointDetails1 = new AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation.BoardPointDetails();
		boardPointDetails1.setTrueLocationId("PVG");
		travelProductInformation1.setBoardPointDetails(boardPointDetails1);
		AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation.OffpointDetails offpointDetails1 = new AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation.OffpointDetails();
		offpointDetails1.setTrueLocationId("HKG");
		travelProductInformation1.setOffpointDetails(offpointDetails1);
		AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation.CompanyDetails companyDetails1 = new AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation.CompanyDetails();
		companyDetails1.setMarketingCompany("HX");
		travelProductInformation1.setCompanyDetails(companyDetails1);
		AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation.FlightIdentification flightIdentification1 = new AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation.FlightIdentification();
		flightIdentification1.setFlightNumber("231");
		flightIdentification1.setBookingClass("Y");
		travelProductInformation1.setFlightIdentification(flightIdentification1);
		AirSellFromRecommendation.ItineraryDetails.SegmentInformation.RelatedproductInformation relatedproductInformation1 = new AirSellFromRecommendation.ItineraryDetails.SegmentInformation.RelatedproductInformation();
		relatedproductInformation1.setQuantity(new BigDecimal("2"));
		relatedproductInformation1.getStatusCode().add("NN");
		segmentInformation1.setRelatedproductInformation(relatedproductInformation1);
		
		//set segmentinformation 第2段
		AirSellFromRecommendation.ItineraryDetails.SegmentInformation segmentInformation2 = new AirSellFromRecommendation.ItineraryDetails.SegmentInformation();
		AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation travelProductInformation2 = new AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation();
		AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation.FlightDate flightDate2 = new AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation.FlightDate();
		flightDate2.setDepartureDate("151017");
		travelProductInformation2.setFlightDate(flightDate2);
		AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation.BoardPointDetails boardPointDetails2 = new AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation.BoardPointDetails();
		boardPointDetails2.setTrueLocationId("HKG");
		travelProductInformation2.setBoardPointDetails(boardPointDetails2);
		AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation.OffpointDetails offpointDetails2 = new AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation.OffpointDetails();
		offpointDetails2.setTrueLocationId("BKK");
		travelProductInformation2.setOffpointDetails(offpointDetails2);
		AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation.CompanyDetails companyDetails2 = new AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation.CompanyDetails();
		companyDetails2.setMarketingCompany("HX");
		travelProductInformation2.setCompanyDetails(companyDetails2);
		AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation.FlightIdentification flightIdentification2 = new AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation.FlightIdentification();
		flightIdentification2.setFlightNumber("775");
		flightIdentification2.setBookingClass("Y");
		travelProductInformation2.setFlightIdentification(flightIdentification2);
		AirSellFromRecommendation.ItineraryDetails.SegmentInformation.RelatedproductInformation relatedproductInformation2 = new AirSellFromRecommendation.ItineraryDetails.SegmentInformation.RelatedproductInformation();
		relatedproductInformation2.setQuantity(new BigDecimal("2"));
		relatedproductInformation2.getStatusCode().add("NN");
		segmentInformation2.setRelatedproductInformation(relatedproductInformation2);
		
		//set segmentinformation 第3段
		AirSellFromRecommendation.ItineraryDetails.SegmentInformation segmentInformation3 = new AirSellFromRecommendation.ItineraryDetails.SegmentInformation();
		AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation travelProductInformation3 = new AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation();
		AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation.FlightDate flightDate3 = new AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation.FlightDate();
		flightDate3.setDepartureDate("201017");
		travelProductInformation3.setFlightDate(flightDate3);
		AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation.BoardPointDetails boardPointDetails3 = new AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation.BoardPointDetails();
		boardPointDetails3.setTrueLocationId("BKK");
		travelProductInformation3.setBoardPointDetails(boardPointDetails3);
		AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation.OffpointDetails offpointDetails3 = new AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation.OffpointDetails();
		offpointDetails3.setTrueLocationId("HKG");
		travelProductInformation3.setOffpointDetails(offpointDetails3);
		AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation.CompanyDetails companyDetails3 = new AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation.CompanyDetails();
		companyDetails3.setMarketingCompany("HX");
		travelProductInformation3.setCompanyDetails(companyDetails3);
		AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation.FlightIdentification flightIdentification3 = new AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation.FlightIdentification();
		flightIdentification3.setFlightNumber("776");
		flightIdentification3.setBookingClass("Y");
		travelProductInformation3.setFlightIdentification(flightIdentification3);
		AirSellFromRecommendation.ItineraryDetails.SegmentInformation.RelatedproductInformation relatedproductInformation3 = new AirSellFromRecommendation.ItineraryDetails.SegmentInformation.RelatedproductInformation();
		relatedproductInformation3.setQuantity(new BigDecimal("2"));
		relatedproductInformation3.getStatusCode().add("NN");
		segmentInformation3.setRelatedproductInformation(relatedproductInformation3);
		
		//set segmentinformation 第4段
		AirSellFromRecommendation.ItineraryDetails.SegmentInformation segmentInformation4 = new AirSellFromRecommendation.ItineraryDetails.SegmentInformation();
		AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation travelProductInformation4 = new AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation();
		AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation.FlightDate flightDate4 = new AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation.FlightDate();
		flightDate4.setDepartureDate("201017");
		travelProductInformation4.setFlightDate(flightDate4);
		AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation.BoardPointDetails boardPointDetails4 = new AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation.BoardPointDetails();
		boardPointDetails4.setTrueLocationId("HKG");
		travelProductInformation4.setBoardPointDetails(boardPointDetails4);
		AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation.OffpointDetails offpointDetails4 = new AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation.OffpointDetails();
		offpointDetails4.setTrueLocationId("PVG");
		travelProductInformation4.setOffpointDetails(offpointDetails4);
		AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation.CompanyDetails companyDetails4 = new AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation.CompanyDetails();
		companyDetails4.setMarketingCompany("HX");
		travelProductInformation4.setCompanyDetails(companyDetails4);
		AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation.FlightIdentification flightIdentification4 = new AirSellFromRecommendation.ItineraryDetails.SegmentInformation.TravelProductInformation.FlightIdentification();
		flightIdentification4.setFlightNumber("234");
		flightIdentification4.setBookingClass("Y");
		travelProductInformation4.setFlightIdentification(flightIdentification4);
		AirSellFromRecommendation.ItineraryDetails.SegmentInformation.RelatedproductInformation relatedproductInformation4 = new AirSellFromRecommendation.ItineraryDetails.SegmentInformation.RelatedproductInformation();
		relatedproductInformation4.setQuantity(new BigDecimal("2"));
		relatedproductInformation4.getStatusCode().add("NN");
		segmentInformation4.setRelatedproductInformation(relatedproductInformation4);
		
		segmentInformation1.setTravelProductInformation(travelProductInformation1);
		segmentInformation2.setTravelProductInformation(travelProductInformation2);
		segmentInformation3.setTravelProductInformation(travelProductInformation3);
		segmentInformation4.setTravelProductInformation(travelProductInformation4);
		
		itineraryDetails.getSegmentInformation().add(segmentInformation1);
		itineraryDetails.getSegmentInformation().add(segmentInformation2);
		itineraryDetails.getSegmentInformation().add(segmentInformation3);
		itineraryDetails.getSegmentInformation().add(segmentInformation4);
		
        
        airSellFromRecommendation.getItineraryDetails().add(itineraryDetails);
		return airSellFromRecommendation;
	}

}

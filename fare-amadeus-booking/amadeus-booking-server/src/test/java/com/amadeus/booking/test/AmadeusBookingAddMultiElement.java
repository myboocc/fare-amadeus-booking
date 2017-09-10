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
import com.amadeus.xml.pnracc_14_2_1a.PNRReply;
import com.amadeus.xml.pnradd_14_2_1a.PNRAddMultiElements;
import com.amadeus.xml.pnradd_14_2_1a.PNRAddMultiElements.DataElementsMaster.Marker1;
import com.amadeus.xml.pnradd_14_2_1a.PNRAddMultiElements.TravellerInfo.ElementManagementPassenger.Reference;
import com.intlgds.amadeus.client.AmadeusThriftClient;

public class AmadeusBookingAddMultiElement {
	
	public static void main(String[] args) {
		AmadeusApi client = AmadeusThriftClient.getAmadeusService();
		PNRAddMultiElements pnrAddMultiElements = getAddMultiElementsData();
		CommonRequestBean<PNRAddMultiElements> request = new CommonRequestBean<PNRAddMultiElements>(pnrAddMultiElements, new Holder<Session>(), new Holder<TransactionFlowLinkType>());
		try {
			CommonReplyBean<PNRReply> resp = client.pnrAddMultiElements(TransactionStatusCode.CONTINUE, TransactionStatusCode.NONE, "rpid", request);
			PNRReply airSellFromRecommendationReply = resp.getReplay();
			System.out.println("PNRReply===》 " + airSellFromRecommendationReply.getTravellerInfo().size());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static PNRAddMultiElements getAddMultiElementsData() {
		PNRAddMultiElements pnrAddMultiElements = new PNRAddMultiElements();
		// pnr actions
		PNRAddMultiElements.PnrActions pnrActions = new PNRAddMultiElements.PnrActions();
		pnrActions.getOptionCode().add(new BigDecimal("0"));
		pnrAddMultiElements.setPnrActions(pnrActions);
		//travellerInfo
		PNRAddMultiElements.TravellerInfo travellerInfo = new PNRAddMultiElements.TravellerInfo();
		PNRAddMultiElements.TravellerInfo.ElementManagementPassenger elementManagementPassenger = new PNRAddMultiElements.TravellerInfo.ElementManagementPassenger();
		PNRAddMultiElements.TravellerInfo.ElementManagementPassenger.Reference reference = new PNRAddMultiElements.TravellerInfo.ElementManagementPassenger.Reference();
		reference.setQualifier("PR");
		reference.setNumber("1");
		elementManagementPassenger.setReference(reference);
		elementManagementPassenger.setSegmentName("NM");
		travellerInfo.setElementManagementPassenger(elementManagementPassenger);
		// passengerData
		PNRAddMultiElements.TravellerInfo.PassengerData passengerData = new PNRAddMultiElements.TravellerInfo.PassengerData();
		PNRAddMultiElements.TravellerInfo.PassengerData.TravellerInformation travellerInformation1 = new PNRAddMultiElements.TravellerInfo.PassengerData.TravellerInformation();
		PNRAddMultiElements.TravellerInfo.PassengerData.TravellerInformation.Traveller traveller1 = new PNRAddMultiElements.TravellerInfo.PassengerData.TravellerInformation.Traveller();
		traveller1.setSurname("SUN");
		traveller1.setQuantity(new BigDecimal("1"));
		travellerInformation1.setTraveller(traveller1);
		PNRAddMultiElements.TravellerInfo.PassengerData.TravellerInformation.Passenger passenger1 = new PNRAddMultiElements.TravellerInfo.PassengerData.TravellerInformation.Passenger();
		passenger1.setFirstName("LIZHANG MR");
		passenger1.setType("ADT");
		travellerInformation1.getPassenger().add(passenger1);
		passengerData.setTravellerInformation(travellerInformation1);
		travellerInfo.getPassengerData().add(passengerData);
		pnrAddMultiElements.getTravellerInfo().add(travellerInfo);
		
		// travellerInfo yongxin
		PNRAddMultiElements.TravellerInfo travellerInfo2 = new PNRAddMultiElements.TravellerInfo();
		PNRAddMultiElements.TravellerInfo.ElementManagementPassenger elementManagementPassenger2 = new PNRAddMultiElements.TravellerInfo.ElementManagementPassenger();
		PNRAddMultiElements.TravellerInfo.ElementManagementPassenger.Reference reference2 = new PNRAddMultiElements.TravellerInfo.ElementManagementPassenger.Reference();
		reference2.setQualifier("PR");
		reference2.setNumber("2");
		elementManagementPassenger2.setReference(reference2);
		elementManagementPassenger2.setSegmentName("NM");
		travellerInfo2.setElementManagementPassenger(elementManagementPassenger2);
		// passengerData
		PNRAddMultiElements.TravellerInfo.PassengerData passengerData2 = new PNRAddMultiElements.TravellerInfo.PassengerData();
		PNRAddMultiElements.TravellerInfo.PassengerData.TravellerInformation travellerInformation2 = new PNRAddMultiElements.TravellerInfo.PassengerData.TravellerInformation();
		PNRAddMultiElements.TravellerInfo.PassengerData.TravellerInformation.Traveller traveller2 = new PNRAddMultiElements.TravellerInfo.PassengerData.TravellerInformation.Traveller();
		traveller2.setSurname("Zhong");
		traveller2.setQuantity(new BigDecimal("1"));
		travellerInformation2.setTraveller(traveller2);
		PNRAddMultiElements.TravellerInfo.PassengerData.TravellerInformation.Passenger passenger2 = new PNRAddMultiElements.TravellerInfo.PassengerData.TravellerInformation.Passenger();
		passenger2.setFirstName("Yongxin MR");
		passenger2.setType("ADT");
		travellerInformation2.getPassenger().add(passenger2);
		passengerData2.setTravellerInformation(travellerInformation2);
		travellerInfo2.getPassengerData().add(passengerData2);
		pnrAddMultiElements.getTravellerInfo().add(travellerInfo2);
		
		//set dataelementsMaster
		PNRAddMultiElements.DataElementsMaster dataElementsMaster = new PNRAddMultiElements.DataElementsMaster();
		dataElementsMaster.setMarker1(new Marker1());
		
		// dataelementsIndivSun ot 1 sun 联系方式
		PNRAddMultiElements.DataElementsMaster.DataElementsIndiv dataElementsIndivOtSun = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv();
		PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ElementManagementData elementManagementDataOtSun = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ElementManagementData();
		PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ElementManagementData.Reference referenceOtSun = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ElementManagementData.Reference();
		referenceOtSun.setQualifier("OT");
		referenceOtSun.setNumber("1");
		elementManagementDataOtSun.setReference(referenceOtSun);
		elementManagementDataOtSun.setSegmentName("AP");
		dataElementsIndivOtSun.setElementManagementData(elementManagementDataOtSun);
		// sun free text data
		PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.FreetextData freetextDataOtSun = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.FreetextData();
		PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.FreetextData.FreetextDetail freetextDetailOtSun = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.FreetextData.FreetextDetail();
		freetextDetailOtSun.setSubjectQualifier("3");
		freetextDetailOtSun.setType("5");
		freetextDataOtSun.setFreetextDetail(freetextDetailOtSun);
		freetextDataOtSun.setLongFreetext("8613466789844-H");
		dataElementsIndivOtSun.setFreetextData(freetextDataOtSun);
		dataElementsMaster.getDataElementsIndiv().add(dataElementsIndivOtSun);
		
		// dataelementsIndivZhong ot 2 Zhong 联系方式
		PNRAddMultiElements.DataElementsMaster.DataElementsIndiv dataElementsIndivOtZhong = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv();
		PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ElementManagementData elementManagementDataOtZhong = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ElementManagementData();
		PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ElementManagementData.Reference referenceOtZhong = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ElementManagementData.Reference();
		referenceOtZhong.setQualifier("OT");
		referenceOtZhong.setNumber("2");
		elementManagementDataOtZhong.setReference(referenceOtZhong);
		elementManagementDataOtZhong.setSegmentName("AP");
		dataElementsIndivOtZhong.setElementManagementData(elementManagementDataOtZhong);
		// Zhong free text data
		PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.FreetextData freetextDataOtZhong = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.FreetextData();
		PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.FreetextData.FreetextDetail freetextDetailOtZhong = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.FreetextData.FreetextDetail();
		freetextDetailOtZhong.setSubjectQualifier("3");
		freetextDetailOtZhong.setType("7");
		freetextDataOtZhong.setFreetextDetail(freetextDetailOtZhong);
		freetextDataOtZhong.setLongFreetext("8613466789844");
		dataElementsIndivOtZhong.setFreetextData(freetextDataOtZhong);
		dataElementsMaster.getDataElementsIndiv().add(dataElementsIndivOtZhong);
		
		// 接收信息
		PNRAddMultiElements.DataElementsMaster.DataElementsIndiv rFDataElementsIndiv = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv();
		PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ElementManagementData rFElementManagementData = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ElementManagementData();
		PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ElementManagementData.Reference rFReference = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ElementManagementData.Reference();
		rFReference.setQualifier("OT");
		rFReference.setNumber("3");
		rFElementManagementData.setReference(rFReference);
		rFElementManagementData.setSegmentName("RF");
		rFDataElementsIndiv.setElementManagementData(rFElementManagementData);
		// free text data
		PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.FreetextData rfFreetextData = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.FreetextData();
		PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.FreetextData.FreetextDetail rfFreetextDetail = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.FreetextData.FreetextDetail();
		rfFreetextDetail.setSubjectQualifier("3");
		rfFreetextDetail.setType("P22");
		rfFreetextData.setFreetextDetail(rfFreetextDetail);
		rfFreetextData.setLongFreetext("by Trave Zen");
		rFDataElementsIndiv.setFreetextData(rfFreetextData);
		dataElementsMaster.getDataElementsIndiv().add(rFDataElementsIndiv);
		
		// 机票信息
		PNRAddMultiElements.DataElementsMaster.DataElementsIndiv tkDataElementsIndiv = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv();
		PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ElementManagementData tkElementManagementData = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ElementManagementData();
		PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ElementManagementData.Reference tkReference = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ElementManagementData.Reference();
		tkReference.setQualifier("OT");
		tkReference.setNumber("4");
		tkElementManagementData.setReference(tkReference);
		tkElementManagementData.setSegmentName("TK");
		tkDataElementsIndiv.setElementManagementData(tkElementManagementData);
		// tk element
		PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.TicketElement tkTicketElement = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.TicketElement();
		PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.TicketElement.Ticket tkTicket = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.TicketElement.Ticket();
		tkTicket.setIndicator("XL");
		tkTicket.setDate("090917");
		tkTicket.setTime("1905");
		tkTicketElement.setTicket(tkTicket);
		tkDataElementsIndiv.setTicketElement(tkTicketElement);
		dataElementsMaster.getDataElementsIndiv().add(tkDataElementsIndiv);
		
		// dataelementsIndivSun  证件信息
		PNRAddMultiElements.DataElementsMaster.DataElementsIndiv dataElementsIndivSun = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv();
		PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ElementManagementData elementManagementDataSun = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ElementManagementData();
		PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ElementManagementData.Reference referenceSun = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ElementManagementData.Reference();
		referenceSun.setQualifier("OT");
		referenceSun.setNumber("5");
		elementManagementDataSun.setReference(referenceSun);
		elementManagementDataSun.setSegmentName("SSR");
		dataElementsIndivSun.setElementManagementData(elementManagementDataSun);
		
		PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ServiceRequest serviceRequestSun = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ServiceRequest();
		PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ServiceRequest.Ssr ssrSun = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ServiceRequest.Ssr();
		ssrSun.setType("DOCS");
		ssrSun.setStatus("HK");
		ssrSun.setQuantity(new BigDecimal("1"));
		ssrSun.setCompanyId("YY");
		ssrSun.getFreetext().add("P-CN-23424324-CN-23JAN80-M-11MAY21-SUN-LIZHANG--H");
		serviceRequestSun.setSsr(ssrSun);
		dataElementsIndivSun.setServiceRequest(serviceRequestSun);
		
		PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ReferenceForDataElement referenceForDataElementSun = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ReferenceForDataElement();
		PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ReferenceForDataElement.Reference ssrReferenceSun = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ReferenceForDataElement.Reference();
		ssrReferenceSun.setQualifier("PR");
		ssrReferenceSun.setNumber("1");
		referenceForDataElementSun.getReference().add(ssrReferenceSun);
		dataElementsIndivSun.setReferenceForDataElement(referenceForDataElementSun);
		dataElementsMaster.getDataElementsIndiv().add(dataElementsIndivSun);
		
		// dataelementsIndiv Zhong  证件信息
		PNRAddMultiElements.DataElementsMaster.DataElementsIndiv dataElementsIndivZhong = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv();
		PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ElementManagementData elementManagementDataZhong = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ElementManagementData();
		PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ElementManagementData.Reference referenceZhong = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ElementManagementData.Reference();
		referenceZhong.setQualifier("OT");
		referenceZhong.setNumber("6");
		elementManagementDataZhong.setReference(referenceZhong);
		elementManagementDataZhong.setSegmentName("SSR");
		dataElementsIndivZhong.setElementManagementData(elementManagementDataZhong);
		
		PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ServiceRequest serviceRequestZhong = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ServiceRequest();
		PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ServiceRequest.Ssr ssrZhong = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ServiceRequest.Ssr();
		ssrZhong.setType("DOCS");
		ssrZhong.setStatus("HK");
		ssrZhong.setQuantity(new BigDecimal("1"));
		ssrZhong.setCompanyId("YY");
		ssrZhong.getFreetext().add("P-CN-23424325-CN-23JAN81-M-11MAY21-Zhong-Yongxin--H");
		serviceRequestZhong.setSsr(ssrZhong);
		dataElementsIndivZhong.setServiceRequest(serviceRequestZhong);
		
		PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ReferenceForDataElement referenceForDataElementZhong = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ReferenceForDataElement();
		PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ReferenceForDataElement.Reference ssrReferenceZhong = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ReferenceForDataElement.Reference();
		ssrReferenceZhong.setQualifier("PR");
		ssrReferenceZhong.setNumber("2");
		referenceForDataElementZhong.getReference().add(ssrReferenceZhong);
		dataElementsIndivZhong.setReferenceForDataElement(referenceForDataElementZhong);
		dataElementsMaster.getDataElementsIndiv().add(dataElementsIndivZhong);
		
		// 预留 手机号 联系 CTCM 手机号 CTCE 邮箱
		PNRAddMultiElements.DataElementsMaster.DataElementsIndiv ctceDataElementsIndiv = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv();
		PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ElementManagementData ctceElementManagementData = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ElementManagementData();
		PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ElementManagementData.Reference ctceReference = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ElementManagementData.Reference();
		ctceReference.setQualifier("OT");
		ctceReference.setNumber("7");
		ctceElementManagementData.setReference(ctceReference);
		ctceElementManagementData.setSegmentName("SSR");
		ctceDataElementsIndiv.setElementManagementData(ctceElementManagementData);
		// serviceRequest
		PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ServiceRequest ctceServiceRequestZhong = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ServiceRequest();
		PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ServiceRequest.Ssr ctceSsr = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ServiceRequest.Ssr();
		ctceSsr.setType("CTCE");
		ctceSsr.setStatus("HK");
		ctceSsr.setQuantity(new BigDecimal("2"));
		ctceSsr.setCompanyId("YY");
		ctceSsr.getFreetext().add("dianmu629//163.com/EN");
		ctceServiceRequestZhong.setSsr(ctceSsr);
		ctceDataElementsIndiv.setServiceRequest(ctceServiceRequestZhong);
		dataElementsMaster.getDataElementsIndiv().add(ctceDataElementsIndiv);
		
		// 预留 手机号 联系 CTCM 手机号 CTCE 邮箱
		PNRAddMultiElements.DataElementsMaster.DataElementsIndiv ctcmDataElementsIndiv = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv();
		PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ElementManagementData ctcmElementManagementData = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ElementManagementData();
		PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ElementManagementData.Reference ctcmReference = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ElementManagementData.Reference();
		ctcmReference.setQualifier("OT");
		ctcmReference.setNumber("7");
		ctcmElementManagementData.setReference(ctcmReference);
		ctcmElementManagementData.setSegmentName("SSR");
		ctcmDataElementsIndiv.setElementManagementData(ctcmElementManagementData);
		// serviceRequest
		PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ServiceRequest ctcmServiceRequestZhong = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ServiceRequest();
		PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ServiceRequest.Ssr ctcmSsr = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv.ServiceRequest.Ssr();
		ctcmSsr.setType("CTCM");
		ctcmSsr.setStatus("HK");
		ctcmSsr.setQuantity(new BigDecimal("2"));
		ctcmSsr.setCompanyId("YY");
		ctcmSsr.getFreetext().add("8613466789844/EN");
		ctcmServiceRequestZhong.setSsr(ctcmSsr);
		ctcmDataElementsIndiv.setServiceRequest(ctcmServiceRequestZhong);
		dataElementsMaster.getDataElementsIndiv().add(ctcmDataElementsIndiv);
		
		pnrAddMultiElements.setDataElementsMaster(dataElementsMaster);
		return pnrAddMultiElements;
	}

}

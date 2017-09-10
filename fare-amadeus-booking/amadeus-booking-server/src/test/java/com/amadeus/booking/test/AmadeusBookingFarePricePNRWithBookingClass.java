package com.amadeus.booking.test;

import javax.xml.ws.Holder;

import com.amadeus.api.AmadeusApi;
import com.amadeus.common.CommonReplyBean;
import com.amadeus.common.CommonRequestBean;
import com.amadeus.common.TransactionStatusCode;
import com.amadeus.wsdl._2010._06.ws.link_v1.TransactionFlowLinkType;
import com.amadeus.xml._2010._06.session_v3.Session;
import com.amadeus.xml.pnracc_14_2_1a.PNRReply;
import com.amadeus.xml.pnradd_14_2_1a.PNRAddMultiElements;
import com.amadeus.xml.tpcbrq_14_1_1a.FarePricePNRWithBookingClass;
import com.amadeus.xml.tpcbrr_14_1_1a.FarePricePNRWithBookingClassReply;
import com.intlgds.amadeus.client.AmadeusThriftClient;

public class AmadeusBookingFarePricePNRWithBookingClass {
	
	public static void main(String[] args) {
		AmadeusApi client = AmadeusThriftClient.getAmadeusService();
		FarePricePNRWithBookingClass bookingClass = getBookingClassData();
		CommonRequestBean<FarePricePNRWithBookingClass> request = new CommonRequestBean<FarePricePNRWithBookingClass>(bookingClass, new Holder<Session>(), new Holder<TransactionFlowLinkType>());
		try {
			CommonReplyBean<FarePricePNRWithBookingClassReply> resp = client.farePricePNRWithBookingClass(TransactionStatusCode.CONTINUE, TransactionStatusCode.NONE, "rpid", request);
			FarePricePNRWithBookingClassReply farePricePNRWithBookingClassReply = resp.getReplay();
			System.out.println("farePricePNRWithBookingClassReply===》 " + farePricePNRWithBookingClassReply.getFareList().size());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static FarePricePNRWithBookingClass getBookingClassData() {
		FarePricePNRWithBookingClass farePricePNRWithBookingClass = new FarePricePNRWithBookingClass();
		FarePricePNRWithBookingClass.PricingOptionGroup pricingOptionGroup1 = new FarePricePNRWithBookingClass.PricingOptionGroup();
		FarePricePNRWithBookingClass.PricingOptionGroup.PricingOptionKey pricingOptionKey1 = new FarePricePNRWithBookingClass.PricingOptionGroup.PricingOptionKey();
		pricingOptionKey1.setPricingOptionKey("RLO");
		pricingOptionGroup1.setPricingOptionKey(pricingOptionKey1);
		
		FarePricePNRWithBookingClass.PricingOptionGroup pricingOptionGroup2 = new FarePricePNRWithBookingClass.PricingOptionGroup();
		FarePricePNRWithBookingClass.PricingOptionGroup.PricingOptionKey pricingOptionKey2 = new FarePricePNRWithBookingClass.PricingOptionGroup.PricingOptionKey();
		pricingOptionKey2.setPricingOptionKey("RU");
		pricingOptionGroup2.setPricingOptionKey(pricingOptionKey2);
		
		FarePricePNRWithBookingClass.PricingOptionGroup pricingOptionGroup3 = new FarePricePNRWithBookingClass.PricingOptionGroup();
		FarePricePNRWithBookingClass.PricingOptionGroup.PricingOptionKey pricingOptionKey3 = new FarePricePNRWithBookingClass.PricingOptionGroup.PricingOptionKey();
		pricingOptionKey3.setPricingOptionKey("RP");
		pricingOptionGroup3.setPricingOptionKey(pricingOptionKey3);
		
		FarePricePNRWithBookingClass.PricingOptionGroup pricingOptionGroup4 = new FarePricePNRWithBookingClass.PricingOptionGroup();
		FarePricePNRWithBookingClass.PricingOptionGroup.PricingOptionKey pricingOptionKey4 = new FarePricePNRWithBookingClass.PricingOptionGroup.PricingOptionKey();
		pricingOptionKey4.setPricingOptionKey("VC");
		FarePricePNRWithBookingClass.PricingOptionGroup.CarrierInformation carrierInformation = new FarePricePNRWithBookingClass.PricingOptionGroup.CarrierInformation();
		FarePricePNRWithBookingClass.PricingOptionGroup.CarrierInformation.CompanyIdentification companyIdentification = new FarePricePNRWithBookingClass.PricingOptionGroup.CarrierInformation.CompanyIdentification();
		companyIdentification.setOtherCompany("HX");
		carrierInformation.setCompanyIdentification(companyIdentification);
		pricingOptionGroup4.setPricingOptionKey(pricingOptionKey4);
		pricingOptionGroup4.setCarrierInformation(carrierInformation);
		
		farePricePNRWithBookingClass.getPricingOptionGroup().add(pricingOptionGroup1);
		farePricePNRWithBookingClass.getPricingOptionGroup().add(pricingOptionGroup2);
		farePricePNRWithBookingClass.getPricingOptionGroup().add(pricingOptionGroup3);
		farePricePNRWithBookingClass.getPricingOptionGroup().add(pricingOptionGroup4);
		
		return farePricePNRWithBookingClass;
		
	}
	
}

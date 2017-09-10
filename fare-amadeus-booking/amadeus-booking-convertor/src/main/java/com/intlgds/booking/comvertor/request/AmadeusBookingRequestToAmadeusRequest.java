package com.intlgds.booking.comvertor.request;

import com.amadeus.xml.itareq_05_2_ia.AirSellFromRecommendation;
import com.intlgds.amadeus.booking.proto.request.AmadeusBookingRequest;

public class AmadeusBookingRequestToAmadeusRequest {
	
	public static void AmadeusBookingRequest2SellFromRecommendationRequest(AmadeusBookingRequest request) throws Exception {
		if(request.getRouteSize() == 0) {
			throw new Exception("requset route size must Greater than 0");
		}
		AirSellFromRecommendation sellFromRecommendation = new AirSellFromRecommendation();
		
	}

}


namespace java com.intlgds.amadeus.booking.service

include "AmadeusBookingPNRMonitor.thrift"

include "AmadeusBookingTicketing.thrift"

include "AmadeusBookingRefund.thrift"

include "AmadeusBookingRequestResponse.thrift"

include "AmadeusBookingEndorse.thrift"

service AmadeusBookingService {

  AmadeusBookingRequestResponse.AmadeusBookingResponse amadeusBookingRequest(1:AmadeusBookingRequestResponse.AmadeusBookingRequest request);

  AmadeusBookingPNRMonitor.PnrMonitorResponse amadeusPNRMonitorRequest(1:AmadeusBookingPNRMonitor.PnrMonitorRequest request);
  
  AmadeusBookingTicketing.TicketingResponse amadeusTicketingRequest(1:AmadeusBookingTicketing.TicketingRequest request);

  AmadeusBookingRefund.RefundResponse amadeusRefundRequest(1:AmadeusBookingRefund.RefundRequest request);
  
  AmadeusBookingEndorse.EndorseResponse amadeusEndorseRequest(1:AmadeusBookingEndorse.EndorseRequest request);

}

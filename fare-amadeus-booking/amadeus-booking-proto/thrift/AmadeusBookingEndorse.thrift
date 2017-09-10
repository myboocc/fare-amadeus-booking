namespace java com.intlgds.amadeus.booking.endorse

include "AmadeusBookingError.thrift"

struct EndorseFlightSegment {
	1:required string flightNo,        // 改签航班号    
    2:required string origflightNo,    // 原航班号
    3:required string cabin,           // 改签舱位：B
    4:required string depAirport,      // 改签航班出发机场   机场三字码
    5:required string depDate,         // 改签航班出发日期（YYYY-MM-DD）
    6:required string depTime,         // 出发时间  时间戳(使用HH:MM:SS格式转换 )
    7:required string arrAirport,      // 到达机场
    8:required string arrDate,         // 到达日期（YYYY-MM-DD）
    9:required string arrTime,         // 到达时间 时间戳(使用HH:MM:SS格式转换 )
}

struct EndorseTicket {
	1:required string name,           // 乘机人姓名
    2:required string passengerType,  // 乘客类型 
    3:required string cardNo,         // 证件号码，
}

struct EndorseRequest {
	1:required string orderNo,                        // 供应商原订单号
    2:required string customerOrderNo,                // 用户原订单号
    3:required string endorseCsOrderNo,               // 用户改签订单号
    4:required list<EndorseFlightSegment> endorseFlightSegments,          // 改签航段信息
    5:required list<EndorseTicket> endorseTickets,                 // 改签客票信息
    6:optional string endorseCallBackUrl,             // 改签通知URL
    7:optional string remark,                         // 备注
}


struct EndorseResponse {
	1:required string orderNo,           // 供应商原订单号 
    2:required string customerOrderNo,   // 用户原订单号 
    3:required string endorseCsOrderNo,  // 用户改签订单号 
    4:required string endorseOrderNo,    // 供应商改签订单号 
    5:optional AmadeusBookingError.AmadeusBookingErrorTable error;	//错误信息
}

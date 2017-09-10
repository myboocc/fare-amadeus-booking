namespace java com.intlgds.amadeus.booking.refund



struct RefundDetail {
	1:required string name,           // 乘机人姓名 
    2:required string passengerType,  // 乘客类型   
    3:required string cardNo,         // 证件号码，
    4:required string tktNo,          // 票号
}


struct RefundSegement {
	1:required string flightNo,       // 航班号（市场方航班号） 如MU5407
    2:required string cabin,          // 舱位：B
    3:required string depAirport,     // 出发机场   机场三字码
    4:required string depDate,        // 出发日期（YYYY-MM-DD）
    5:required string depTime,        // 出发时间  时间戳(使用HH:MM:SS格式转换 )
    6:required string arrAirport,     // 到达机场
    7:optional string arrDate,        // 到达日期（YYYY-MM-DD）
    8:optional string arrTime,        // 到达时间 时间戳(使用HH:MM:SS格式转换 )
}


struct RefundRequest {
	1:required string orderNo,                   // 原供应商订单号
    2:required string customerOrderNo,           // 原用户订单号
    3:required string refundCsOrderNo,           // 用户退票订单号
    4:required string reason,                    // 退票原因
    5:required list<RefundSegement> refundSegements, // 航程，多个航程用“|”分隔 SHA-PEK|PEK-SHA  
    6:required list<RefundDetail> refundDetails,  // 需退的乘机人列表
    7:optional string refundCallBackUrl,         // 退票通知URL
    8:optional string remark                   // 备注
}



struct RefundResponse {
	1:required string status,            // 0000成功   0071退票提交失败 
    2:optional string msg,               // 
    3:required string orderNo,           // 原供应商订单号 
    4:required string customerOrderNo,   // 原用户订单号 
    5:required string refundCsOrderNo,   // 用户退票订单号 
    6:required string refundOrderNo,     // 供应商退票订单号 
}

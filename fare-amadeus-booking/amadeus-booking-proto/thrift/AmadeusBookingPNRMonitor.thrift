namespace java com.intlgds.amadeus.booking.pnrmonitor

struct PnrMonitorRequest {
	1:required string orderNo,          //供应商订单号（封装方订单号）
	2:required string customerOrderNo,  //用户订单号（天地行订单号）
	3:required string pnr,              //订座编码
}

struct PnrMonitorResponse {
	1:required string status, // 0000成功，0040 验证不通过
	2:optional string msg,    // 详细信息
}


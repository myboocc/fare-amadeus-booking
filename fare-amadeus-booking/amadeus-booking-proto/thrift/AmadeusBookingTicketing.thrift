namespace java com.intlgds.amadeus.booking.ticketing

struct TicketingRequest {
	1:required string orderNo,             //供应商订单号
	2:required string customerOrderNo,     //用户订单号
	3:required i32 payType,                //支付类型  0代扣，1授信 ---类型视实际情况待定（预留字段，固定传1） 
}                                            

struct TicketingResponse {
	1:required string status,                // 0000成功，0050PNR状态有误，0051价格变动，0052出票失败，0053出票延时。
    2:optional string msg,                   // 详细信息
    3:required string orderNo,               // 供应商订单号
    4:required string customerOrderNo,       // 用户订单号
    5:required string pnr,                   // 订座编码
    6:optional string afterPayURL,           // 支付后通知地址（预留字段）
}  





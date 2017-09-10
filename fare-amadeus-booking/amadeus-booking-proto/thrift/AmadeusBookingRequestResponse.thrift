namespace java com.intlgds.amadeus.booking.proto.request

include "AmadeusBookingRoute.thrift"

include "AmadeusBookingError.thrift"

struct PassengerPrice {                                
	1:required string passengerType,    //乘客类型
	2:optional i32 passgerIdentity,     //乘客身份
	3:required i32 basePrice,           //票面价（不含税）
	4:required string commission,       //返点， 两位小数  建议选择性给出
	5:required string rewardMoney,      //返佣金额   选择性给出
	6:optional double salePrice,        //销售价（不含税） 两位小数
	7:optional i32 taxAmount,           //税费合计
}

struct Contact {
	1:required string name,      //联系人姓名，张三或 zhangsan
	2:optional string address,   //联系人地址
	3:optional string postCode,  //邮政编码
	4:required string mobile,    //联系电话
	5:optional string email,     //邮箱
}

struct Passenger {
	1:required string passengerType,     // 乘客类型  如ADT，CHD
	2:required string name,              // 乘客姓名  如zhang/sanfeng  LastName/FirstName MiddleName
	3:required string sex,               // 性别，如F/M
	4:required string birthday,          // 出生日期，1980-07-07
	5:required string nationality,       // 国籍  国家IATA二字码
	6:required string cardType,          // 证件类型，护照PP 支持类型待定
	7:required string cardNo,            // 证件号码，
	8:required string cardIssuePlace,    // 签发地  国家IATA二字码
	9:required string cardExpired,       // 证件有效期，如2020-08-08
	10:required string phone,            // 乘客电话
}

struct AmadeusBookingRequest {
	1:required list<AmadeusBookingRoute.Route> route,  //航程信息 传入Verify接口返回的航程信息对象
	2:optional string fareType,                        //Verify接口返回的运价GDS关键字 预留字段
	3:required string key,                             //Verify接口返回的报价关键字
	4:required string ticketingCarrier,                //出票航司
	5:optional string otherTktCarrier,                 //备用出票航司
	6:required list<PassengerPrice> passengerPrices,   //Verify接口返回的乘客价格信息 仅传需要生单的旅客类型和对应价格 取Verify的结果
	7:required list<Contact> contacts,                  //联系人信息
	8:required list<Passenger> passengers,             //乘客信息
	9:required string customerOrderNo,                 //用户订单号
	10:optional string afterTicketURL,                 //出票后通知地址
	11:optional string afterPayURL,                    //支付后通知地址（预留字段）
}                                                      
                                                       

struct AmadeusBookingResponse {
	1:required string status,             //0000成功，0030预定失败
	2:optional string msg,                //错误信息
	3:required string pnr,                //订座编码
	4:optional string pnrLargeCode,       //航司大编码，多个”,”隔开
	5:required string orderNo,            //供应商订单号
	6:required string pnrLimit,           //订单保留时限
	7:optional AmadeusBookingError.AmadeusBookingErrorTable error;	//错误信息
}                         
                                         
                                         
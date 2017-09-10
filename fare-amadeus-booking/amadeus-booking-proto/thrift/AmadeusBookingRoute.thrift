namespace java com.intlgds.amadeus.booking.route

struct StopOver {
	1:required string stopAirport,  //经停机场
	2:required string groundTimes,  //停留时间  如1:15
	3:required string arrDate,      //到达日期（YYYY-MM-DD）
	4:required string arrTime,      //到达时间 时间戳(HH:MM:SS格式转换 )
	5:required string depDate,	    //出发日期（YYYY-MM-DD）
	6:required string depTime,      //出发时间  时间戳(HH:MM:SS格式转换 )
}


struct Segement {
	1:required i32 id,					//航段序号  0开始
	2:required string flightNo,			//航班号（市场方航班号） 如MU5407
    3:optional string carrierFlightNo,  //实际承运航班号  如CZ123 非代码共享时返回为空
    4:required string cabin,			//舱位：B
    5:required string cabinRank,		//舱位等级 （Y）经济舱Economy，（C）商务舱Business，（F）头等舱First。（没有超级经济舱-超经记做经济舱）
    6:required string depAirport,		//出发机场   机场三字码
    7:optional string depTerminal,		//出发航站楼
    8:required string depDate,			//出发日期（YYYY-MM-DD）
    9:required string depTime,          //出发时间  时间戳(使用HH:MM:SS格式转换
    10:required string arrAirport,		//到达机场
    11:optional string arrTerminal,		//到达航站楼
    12:required string arrDate,			//到达日期（YYYY-MM-DD）
    13:required string arrTime,         //到达时间 时间戳(使用HH:MM:SS格式转换 )
    14:optional list<StopOver> stopOver,//经停信息  无经停信息时返回空
    15:required string codeShare,       //是否代码共享
    16:required string flightDuration,  //飞行时长  如2:30
    17:optional i32 tpm,                //里程
    18:required string planeType,       //机型
    19:optional string mealType,        //餐食类型
}

struct Route {
	1:required i32 id,                        // 航程序号  0开始，单程只有1个，往返有2个，多程就有多个。     
	2:required list<Segement> segements,      // 航段组合     
	3:required string duration,               // 行程总时长  如5:20     
}



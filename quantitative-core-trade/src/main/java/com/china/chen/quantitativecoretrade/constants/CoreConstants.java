package com.china.chen.quantitativecoretrade.constants;

public class CoreConstants {
    /**web socket连接的服务器地址*/
    public static final String URL = "wss://api.huobi.pro" ;
    /**基础币种的默认精度*/
    public static final Integer DEFAULT_BASE_COIN_PRECISION = 2 ;
    /**交易币种的默认精度*/
    public static final Integer DEFAULT_TRADE_COIN_PRECISION = 6 ;
    /**钉钉报警的webhook*/
    public static final String HOOK = "https://oapi.dingtalk.com/robot/send?access_token=e93d3076f9b6a981c15603ecb8328278d0831b9b3b34ca94d6da89105ac65332" ;
    /**币世界爬虫初始地址*/
    public static final String BI_SHI_JIE_URL = "https://www.bishijie.com/kuaixun" ;

    /**币世界跟目录*/
    public static final String BI_SHI_JIE_ROOT_URL = "https://www.bishijie.com" ;
}

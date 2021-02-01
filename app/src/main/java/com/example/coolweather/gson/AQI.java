package com.example.coolweather.gson;

/**
 * Author zhangdongwei
 */
public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}

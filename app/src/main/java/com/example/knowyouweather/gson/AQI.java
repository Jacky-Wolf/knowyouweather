package com.example.knowyouweather.gson;

import com.solidfire.gson.annotations.SerializedName;

public class AQI {
    public AQIcity city;

    public class AQIcity {
        @SerializedName("aqi")
        public String aqi;
        public String pm25;
    }
}

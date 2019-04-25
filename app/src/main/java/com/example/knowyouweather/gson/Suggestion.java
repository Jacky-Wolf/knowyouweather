package com.example.knowyouweather.gson;

import com.solidfire.gson.annotations.SerializedName;

public class Suggestion {
    @SerializedName("comf")
    public Comfortable comfort;
    @SerializedName("cw")
    public CarWash carWash;
    @SerializedName("sport")
    public Sport sport;

    public  class Comfortable {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}

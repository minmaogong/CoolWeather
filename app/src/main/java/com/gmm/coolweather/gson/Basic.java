package com.gmm.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    //由于JSON 中的一些字段可能不太适合直接作为Java字段来命名，使用@SerializedName注解的方式来让JSON字段与Java字段之间建立映射关系
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherID;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}

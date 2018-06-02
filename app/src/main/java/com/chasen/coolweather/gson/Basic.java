package com.chasen.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dayicklp.
 *
 * Gson解析的basic类
 */

public class Basic {

    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update  {
        @SerializedName("loc")
        public String updateTime;
    }

}

package com.example.izajul.weatherpro.WeatherMainSources;

import retrofit2.Call;
import retrofit2.http.*;

public interface WeatherApi {
    @GET
    Call<WeatherMain>getWeatherData(@Url String url);
}

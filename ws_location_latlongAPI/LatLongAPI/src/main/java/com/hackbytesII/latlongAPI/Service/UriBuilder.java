package com.hackbytesII.latlongAPI.Service;

import com.hackbytesII.latlongAPI.DAO.LocationData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;


public class UriBuilder {

    @Value("${api_key}")
    private String apiKey;
    RestTemplate restTemplate = new RestTemplate();
    LocationData locationData = new LocationData();
    private final String baseURL = "http://api.weatherapi.com/v1/current.json?key=";
    public String build(){
        return this.baseURL + apiKey +"&q=" + locationData.getCity()+"&aqi=no";
    }
}

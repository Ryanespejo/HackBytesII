package com.hackbytesII.latlongAPI.DAO;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hackbytesII.latlongAPI.Service.UriBuilder;
import org.springframework.web.client.RestTemplate;

public class JsonParse {
    UriBuilder builder = new UriBuilder();
    RestTemplate restTemplate = new RestTemplate();
    public JsonNode parseJson(String dataToParse) throws JsonProcessingException {
        String uri = builder.build();
        restTemplate.getForObject(uri, String.class);
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readTree(dataToParse);
    }
}

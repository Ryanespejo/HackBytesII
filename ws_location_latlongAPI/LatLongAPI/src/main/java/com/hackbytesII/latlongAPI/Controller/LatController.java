package com.hackbytesII.latlongAPI.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.hackbytesII.latlongAPI.DAO.JsonParse;
import com.hackbytesII.latlongAPI.DAO.LocationData;
import com.hackbytesII.latlongAPI.DTO.LatLongDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class LatController {
    @Value("${api_key}")
    private String apiKey;
    LocationData locationData = new LocationData();
    JsonParse parser = new JsonParse();
    LatLongDTO dto = new LatLongDTO();

    RestTemplate restTemplate = new RestTemplate();

    @PostMapping("/lat")
    private String latData() throws JsonProcessingException {
        JsonNode jsonNode = parser.parseJson(result);
        dto.setLatData(String.valueOf(jsonNode.get("location").get("lat")));
        return dto.getLatData();
    }
}


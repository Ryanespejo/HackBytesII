package com.hackbytesII.latlongAPI.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.hackbytesII.latlongAPI.DAO.JsonParse;
import com.hackbytesII.latlongAPI.DTO.LatLongDTO;
public class LatDataService {
    JsonParse parser = new JsonParse();
    LatLongDTO dto = new LatLongDTO();
    UriBuilder builder = new UriBuilder();
    String result = builder.build();
}

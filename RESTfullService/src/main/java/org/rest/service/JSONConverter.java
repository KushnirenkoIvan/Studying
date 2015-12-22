package org.rest.service;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.rest.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JSONConverter {

    @Autowired
    private ObjectMapper mapper;

    public String toJson(User user) throws JsonProcessingException {
        return mapper.writeValueAsString(user);
    }

}

package org.rest.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private ObjectMapper objectMapper;
//
//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public String main() {
//        return "index";
//    }


}

package org.rest.controller;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.rest.entities.Data;
import org.rest.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TestController {

    @Autowired
    private ObjectMapper objectMapper;

    @RequestMapping(value = "getInfo", method = RequestMethod.GET)
    public ObjectNode testGET() {
        objectMapper = new ObjectMapper();
        User user = new User(2135434, "user", 22);
        Data data = new Data(122, 2135434, "Some_data", new Date());


        ObjectNode nodeUser = objectMapper.valueToTree(user);
        ObjectNode nodeData = objectMapper.valueToTree(data);

        nodeUser.setAll(nodeData);

        JsonNode result = objectMapper.createObjectNode().set("user", nodeUser);

        System.out.println(result);

        ObjectNode objectNode = objectMapper.createObjectNode();
        return objectNode;
    }

    public static void main(String[] args) {
        new TestController().testGET();
    }

}

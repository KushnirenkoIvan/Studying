package org.rest.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.entities.User;
import org.rest.service.JSONConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @Autowired
    JSONConverter jsonConverter;

    @Autowired
    ObjectMapper objectMapper;

    @RequestMapping(value = "getUser", method = RequestMethod.GET)
    public ObjectNode restGet() {
        return jsonConverter.toJson(new User(1234, "user", 23));
    }

    @RequestMapping(value = "putData", method = RequestMethod.PUT)
    public ObjectNode restPut(@RequestBody User inputuser) {
        ObjectNode node = objectMapper.createObjectNode();
        node.put("200", "Success");
        return node;
    }

    @RequestMapping(value = "postData", method = RequestMethod.POST)
    public ObjectNode restPost(@RequestBody User inputuser) {
        ObjectNode node = objectMapper.createObjectNode();
        node.put("200", "Success");
        return node;
    }

    @RequestMapping(value = "deleteData/{data}", method = RequestMethod.DELETE)
    public ObjectNode restDeleted(@PathVariable String data) {
        ObjectNode node = objectMapper.createObjectNode();
        node.put("200", "Success");
        return node;
    }

}

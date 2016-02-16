package ua.kushnirenko.rest.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.*;
import ua.kushnirenko.entity.Data;
import ua.kushnirenko.entity.User;

@RestController
public class MainControllerImpl implements MainController {

    private final Logger log = Logger.getLogger(MainController.class);


    @RequestMapping(value = "getUser", method = RequestMethod.GET)
    @Override
    public User restGet() {
        return new User(1234, "user", 23);
    }

    @RequestMapping(value = "putData", method = RequestMethod.PUT)
    @Override
    public Data restPut(@RequestBody User user) {
        if (user == null) log.warn("Received data is null.");
        return new Data(200, "Success");
    }

    @RequestMapping(value = "postData", method = RequestMethod.POST)
    @Override
    public Data restPost(@RequestBody User user) {
        if (user == null) log.warn("Received data is null.");
        return new Data(200, "Success");
    }

    @RequestMapping(value = "deleteData/{data}", method = RequestMethod.DELETE)
    @Override
    public Data restDeleted(@PathVariable String data) {
        if (data == null) log.warn("Received data is null.");
        return new Data(200, "Success");
    }

}

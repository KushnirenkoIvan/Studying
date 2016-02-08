package ua.kushnirenko.rest.controller;


import org.springframework.web.bind.annotation.*;
import ua.kushnirenko.entities.Data;
import ua.kushnirenko.entities.User;

@RestController
public class MainController {

    @RequestMapping(value = "getUser", method = RequestMethod.GET)
    public User restGet() {
        return new User(1234, "user", 23);
    }

    @RequestMapping(value = "putData", method = RequestMethod.PUT)
    public Data restPut(@RequestBody User inputuser) {
        return new Data(200, "Success");
    }

    @RequestMapping(value = "postData", method = RequestMethod.POST)
    public Data restPost(@RequestBody User inputuser) {
        return new Data(200, "Success");
    }

    @RequestMapping(value = "deleteData/{data}", method = RequestMethod.DELETE)
    public Data restDeleted(@PathVariable String data) {
        return new Data(200, "Success");
    }

}

package ua.kushnirenko.rest.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ua.kushnirenko.entity.Data;


@RestController
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping(value = "/findByName/{login}/pwd/{pwd}", method = RequestMethod.GET)
    public Data getByLoginAndPassword(@PathVariable String login,
                                      @PathVariable String pwd) {

        System.out.println("Received user with name: " + login + ", password: " + pwd);

        return new Data(200, "Successfully Logged in!");
    }
}

package org.rest.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class StartController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getStartPage() {
        return "hello";
    }

}

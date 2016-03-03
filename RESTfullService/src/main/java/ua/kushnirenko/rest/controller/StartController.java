package ua.kushnirenko.rest.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping("/jsp")
public class StartController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getStartPage() {
        return "redirect:/html/login.html";
    }

}

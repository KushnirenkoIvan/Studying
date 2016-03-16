package ua.kushnirenko.rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import ua.kushnirenko.entity.User;


public interface MainController {

    User restGet();

    ResponseEntity restPut(@RequestBody User user);

    ResponseEntity restPost(@RequestBody User user);

    ResponseEntity restDeleted(@PathVariable String data);
}

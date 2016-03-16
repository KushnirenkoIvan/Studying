package ua.kushnirenko.rest.controller;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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
    public ResponseEntity restPut(@RequestBody User user) {

        ResponseEntity response = null;

        if (user == null) {
            log.warn("Received data is null.");
            response = new ResponseEntity(null, HttpStatus.BAD_REQUEST);
        }

        response = new ResponseEntity(null, HttpStatus.CREATED);

        return response;
    }

    @RequestMapping(value = "postData", method = RequestMethod.POST)
    @Override
    public ResponseEntity restPost(@RequestBody User user) {

        ResponseEntity response = null;

        if (user == null) {
            log.warn("Received data is null.");
            response = new ResponseEntity(null, HttpStatus.BAD_REQUEST);

        }

        response = new ResponseEntity(null, HttpStatus.ACCEPTED);

        return response;
    }

    @RequestMapping(value = "deleteData/{data}", method = RequestMethod.DELETE)
    @Override
    public ResponseEntity restDeleted(@PathVariable String data) {
        ResponseEntity response = null;

        if (data == null) {
            log.warn("Received data is null.");
            response = new ResponseEntity(null, HttpStatus.BAD_REQUEST);

        }

        response = new ResponseEntity(null, HttpStatus.ACCEPTED);

        return response;
    }

}

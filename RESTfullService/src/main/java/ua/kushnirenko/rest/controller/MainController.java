package ua.kushnirenko.rest.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import ua.kushnirenko.entity.Data;
import ua.kushnirenko.entity.User;

/**
 * author: ivan kushnirenko
 * <p/>
 * date: 10.02.16
 */
public interface MainController {

    User restGet();

    Data restPut(@RequestBody User user);

    Data restPost(@RequestBody User user);

    Data restDeleted(@PathVariable String data);
}

package com.example;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Created by mark on 16-2-4.
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ArrayList<User> getUserList() {
        ArrayList<User> users = new ArrayList<User>();
        return users;
    }
}

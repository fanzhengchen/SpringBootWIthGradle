package com.example;

import com.sun.xml.internal.fastinfoset.util.StringArray;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 * Created by mark on 16-2-4.
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ArrayList<User> getUserList() {
        ArrayList<User> users = new ArrayList<User>();
        Random random = new Random();
        random.setSeed(11222l);
        for (int i = 0; i < 10; ++i) {
            String a = randomNum(random);
            String b = randomNum(random);
            users.add(new User(a, b));
        }
        return users;
    }




    private String randomNum(Random random) {
        return Long.toString(random.nextLong());
    }
}

package com.example.Controllers;

import com.example.models.User;
import com.example.models.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.script.ScriptTemplateConfig;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by mark on 16-2-4.
 */
@RestController
public class UserController {


    @Autowired
    private UserDao userDao;

    @RequestMapping("/create")
    @ResponseBody
    public String create(String email, String name) {
        String userId = "";
        try {

            User user = new User(email, name);
            userDao.save(user);
            userId = String.valueOf(user.getId());
        } catch (Exception ex) {
            return "Error creating the user: " + ex.toString();
        }
        return "User succesfully created with id = " + userId;
    }

    @RequestMapping("/get-by-email")
    @ResponseBody
    public String getByEmail(String email) {
        String userId = "";
        try{
            User user = userDao.findByEmail(userId);
            userId = String.valueOf(user.getId());
        }catch (Exception ex){
            return "User not found";
        }
        return "The user id is: " + userId;
    }
}

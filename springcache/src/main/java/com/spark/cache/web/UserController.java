package com.spark.cache.web;

import com.spark.cache.model.User;
import com.spark.cache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by tyd on 2017-11-3.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    @ResponseBody
    public List<User> list() {
        return userService.getUserList();
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public User update(User user) {
        int result = userService.updateUser(user);
        if (result > 1) {
            return user;
        }
        return null;
    }
}

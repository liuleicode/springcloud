package com.springcloud.server.controller;

import com.springcloud.server.model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liulei on 2017/4/22.
 */
@RestController
//@RequestMapping("/user")
public class UserController {
    @RequestMapping("/{id}")
    @ResponseBody
    public User findUser(@PathVariable Long id) {
        User u = new User(1L, 8, "hello", "m");
        return u;

    }
}

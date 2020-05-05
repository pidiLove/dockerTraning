package com.train.docker.controller;

import com.train.docker.model.User;
import com.train.docker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangpei
 * @date 2020/5/4 08:12
 * @description
 */
@RestController
@RequestMapping("docker/train/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(User user) {
        return userService.login(user);
    }


    @RequestMapping(value = "/login/redis",method = RequestMethod.POST)
    public String loginRedis(User user) {
        return userService.loginRedis(user);
    }



}

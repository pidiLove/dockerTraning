package com.train.docker.service;

import com.train.docker.Utils.RedisUtils;
import com.train.docker.dao.UserMapper;
import com.train.docker.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author wangpei
 * @date 2020/5/4 08:10
 * @description
 */
@Service
public class UserService {

    @Autowired
    UserMapper userDao;

    @Autowired
    RedisUtils redisUtils;

    public String login(User user) {
        if (redisUtils.hasKey(user.getUserName())) {
            return "login success";
        } else {
            if (userDao.getByUserNameAndPassword(user) == 1) {
                redisUtils.set(user.getUserName(), true);
                return "login success";
            } else {
                return "userName or password not corret!";
            }
        }

    }
    public String loginRedis(User user) {
        if (redisUtils.hasKey(user.getUserName())) {
            return "login success";
        } else {
            return "userName or password not corret!";
        }

    }


}

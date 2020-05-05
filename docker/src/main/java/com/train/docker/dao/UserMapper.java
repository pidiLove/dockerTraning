package com.train.docker.dao;

import com.train.docker.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author wangpei
 * @date 2020/5/4 08:08
 * @description
 */
@Mapper
public interface UserMapper {
    @Select("SELECT count(1) FROM user WHERE user_name = #{userName} and password=#{password}")
    int getByUserNameAndPassword(User user);
}

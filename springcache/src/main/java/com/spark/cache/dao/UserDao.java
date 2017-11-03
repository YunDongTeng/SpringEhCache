package com.spark.cache.dao;

import com.spark.cache.model.User;

import java.util.List;

/**
 * Created by tyd on 2017-11-3.
 */
public interface UserDao {

    List<User> getUserList();

    int updateUser(User user);

}

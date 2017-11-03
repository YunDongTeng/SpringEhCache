package com.spark.cache.service;

import com.spark.cache.model.User;

import java.util.List;

/**
 * Created by tyd on 2017-11-3.
 */
public interface UserService {

    List<User> getUserList();

    int updateUser(User user);
}

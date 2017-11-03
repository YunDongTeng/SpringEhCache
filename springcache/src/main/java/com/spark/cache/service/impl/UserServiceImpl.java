package com.spark.cache.service.impl;

import com.spark.cache.dao.UserDao;
import com.spark.cache.model.User;
import com.spark.cache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by tyd on 2017-11-3.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Cacheable(value = "userListCache")
    @Override
    public List<User> getUserList() {
        return userDao.getUserList();
    }

    @CacheEvict(value = "userListCache")
    @Override
    public int updateUser(User user) {
        return userDao.updateUser(user);
    }
}

package com.tw.core.service;


import com.tw.core.dao.UserDao;
import com.tw.core.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> all() {

        return userDao.all();
    }

    public void add(User user) {
        userDao.add(user);
    }
}
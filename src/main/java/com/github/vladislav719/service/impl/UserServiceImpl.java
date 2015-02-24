package com.github.vladislav719.service.impl;

import com.github.vladislav719.model.dao.UserDAO;
import com.github.vladislav719.model.vo.User;
import com.github.vladislav719.service.UserService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Владислав on 28.11.2014.
 */
public class UserServiceImpl implements UserService{

    private UserDAO userDAO;



    @Override
    @Transactional
    public List<User> getUserList() {
        return this.userDAO.getAllUsers();
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
}

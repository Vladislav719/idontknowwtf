package com.github.vladislav719.model.dao;

import com.github.vladislav719.model.vo.User;

import java.util.List;

/**
 * Created by Владислав on 28.11.2014.
 */
public interface UserDAO {
    public List<User> getAllUsers();
}

package com.github.vladislav719.model.dao.impl;

import com.github.vladislav719.model.dao.UserDAO;
import com.github.vladislav719.model.vo.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by Владислав on 28.11.2014.
 */
public class UserDAOImpl extends BaseDAO implements UserDAO {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }



    @SuppressWarnings("unchecked")
    @Override
    public List<User> getAllUsers() {
        Session session = this.sessionFactory.getCurrentSession();
        return session.createQuery("from User").list();
    }


}

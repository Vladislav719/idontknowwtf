package com.github.vladislav719.model.dao.impl;

import org.hibernate.SessionFactory;

/**
 * Created by Владислав on 02.12.2014.
 */
public class BaseDAO {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

}

package com.github.vladislav719.model.dao.impl;

import com.github.vladislav719.model.dao.STaskDAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by Владислав on 07.12.2014.
 */
public class STaskDAOImpl implements STaskDAO {


    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory session) {
        this.sessionFactory = session;
    }

    @Override
    public List getIt() {
        return null;
    }

//    @Override
//    public List getIt() {
//        Session session = this.sessionFactory.getCurrentSession();
//        session.createQuery("SELECT building_id, kadastr, storey, rooms, date_doc,square_flat, SUM (square_flat), max (date_doc) from flat, documents, building, owners group by n_passport, kadastr");
//    }
}

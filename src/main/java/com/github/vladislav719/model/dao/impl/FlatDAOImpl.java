package com.github.vladislav719.model.dao.impl;

import com.github.vladislav719.model.dao.FlatDAO;
import com.github.vladislav719.model.vo.Flat;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import java.util.List;

/**
 * Created by Владислав on 02.12.2014.
 */
public class FlatDAOImpl  implements FlatDAO {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public List firstTask() {
        Session session = this.sessionFactory.getCurrentSession();
        return session.createQuery("SELECT n_passport, KADASTR, max(DATE_DOC) as max_date, sum(SQUARE_FLAT) as square_flat\n" +
                "  from FLAT LEFT JOIN BUILDING on KADASTR = FLAT.BUILDING_ID, OWNER, DOCUMENTS\n" +
                "    GROUP BY  N_PASSPORT, KADASTR").list();

    }

    @Override
    @SuppressWarnings("unchecked")
    public List getAllFlats(Double wear, String district) {
        Session session = this.sessionFactory.getCurrentSession();
//        Query query = session.createQuery("from Flat inner join Building  as building left join flat on building.kadastr = flat.building_id AND flat.balcony = 0 where building.wear > :wear AND building.district = :district");
        Query query = session.createQuery("SELECT storey, rooms, dwell, height from Flat inner join Building on kadastr = building_id where (wear > ? and district = ?)");

//SELECT town, hotel, startdate, stopdate FROM datep INNER JOIN route on routeid = routeid_town WHERE( country = ? and period > ?
        query.setParameter("wear", wear);
        query.setParameter("district", district);
        List list = query.list();

//        List<Flat> flats = session.createCriteria(Flat.class).add(Restrictions.gt("ID", 3))
////                .add(Restrictions.eq("balcony", 0))
////                .createAlias("building", "building")
////                .add(Restrictions.and(Restrictions.eq("district", district), Restrictions.gt("wear", wear)))
//                .list();
        System.out.println("WOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOORK");
//        session.getTransaction().commit();
//        session.getTransaction().rollback();
        System.out.println(list.size());
        return list;
    }

}

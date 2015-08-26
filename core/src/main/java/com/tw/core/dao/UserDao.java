package com.tw.core.dao;

import com.tw.core.entity.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ksu on 7/13/15.
 */

@Repository
public class UserDao {

    private static SessionFactory sessionFactory ;
    static {
        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        sessionFactory = configuration.buildSessionFactory(builder.build());
    }

    public List<User> all() {
        Session session = sessionFactory.openSession();

        Query query = session.createQuery("from User");
        List<User> users = query.list();
        session.close();

        return users;
    }

    public void add(User user) {
        Session session = sessionFactory.openSession();
        session.save(user);
        session.close();
    }
}

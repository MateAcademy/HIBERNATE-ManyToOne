package com.itvdn;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

class HibernateUtil {

    public static SessionFactory getSessionFactory() {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        return factory;
    }
}
package com.itvdn;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

class HibernateUtil {

    private static SessionFactory factory;

    public static SessionFactory getSessionFactory() {
        factory = new Configuration().configure().buildSessionFactory();
        return factory;
    }

    public static void closeSessionFactory() {
        factory.close();
    }
}
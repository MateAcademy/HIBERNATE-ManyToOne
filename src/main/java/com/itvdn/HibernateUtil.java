package com.itvdn;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

class HibernateUtil {

    private static SessionFactory factory;

    public static SessionFactory getSessionFactory() throws HibernateException {
        factory = new Configuration().configure().buildSessionFactory();
        return factory;
    }

    public static void closeSessionFactory() throws HibernateException {
        factory.close();
    }
}
package com.library;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * @author Sergey Klunniy
 */
public class HibernateUtil {

    private static SessionFactory factory;

    static {
        try {
            factory = new AnnotationConfiguration()
                    .configure("library.cfg.xml")
                    .buildSessionFactory();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

    public static SessionFactory getSessionFactory () {
        return factory;
    }
}

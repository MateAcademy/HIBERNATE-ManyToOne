package com.homework.hibernate;

import com.homework.hibernate.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;


/**
 * @author Sergey Klunniy
 */
public class MainStudent {
    public static void main(String[] args) {
        Student sergey = new Student("Sergey", "0501430700");
        Student sergey2 = new Student("Sergey2", "22222222");

        SessionFactory factory = new AnnotationConfiguration()
                .configure()
                .buildSessionFactory();

//        Session session = factory.openSession();
//        session.beginTransaction();
//        session.save(sergey);
//        session.getTransaction().commit();
//        session.close();


        Session session =factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(sergey);
        session.save(sergey2);
        transaction.commit();

        if (session.isOpen())
        session.close();

        if (!factory.isClosed())
        factory.close();
    }
}

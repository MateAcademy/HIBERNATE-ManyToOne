package com.itvdn;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Created by Asus on 22.04.2018.
 */
public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setAge(10);
        animal.setName("Mursik");
        animal.setTail(true);

        SessionFactory factory = new Configuration().configure()
                .buildSessionFactory();

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(animal);
        transaction.commit();
        session.close();
        //transaction.rollback();
    }
}

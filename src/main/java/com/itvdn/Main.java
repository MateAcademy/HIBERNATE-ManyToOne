package com.itvdn;



/**
 * Created by Asus on 22.04.2018.
 */
public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setAge(10);
        animal.setName("Mursik");
        animal.setTail(true);

        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(animal);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null)
                transaction.rollback();
        }
    }
}

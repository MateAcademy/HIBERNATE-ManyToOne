package com.ex_002_hibernate_intro;

import org.apache.log4j.BasicConfigurator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

/**
 * @author Sergey Klunniy
 */
public class Main {

//    private final static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();
//        logger.error("Info log message");

        ClientsDetails details = new ClientsDetails();
        details.setAge(20);
       // details.setId(1);
        details.setName("Vasiliy");
        details.setPhone("+38095750703");

//        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        SessionFactory factory = new AnnotationConfiguration()
                .configure()
                .buildSessionFactory();

        Session session = factory.openSession();
        session.beginTransaction();
        session.save(details);
        session.getTransaction().commit();
        session.close();

    }

}

package com.library_hibernate;

import com.library_hibernate.entity.Author;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * @author Sergey Klunniy
 */
public class AuthorHelper {

    private SessionFactory sessionFactory;

    public AuthorHelper() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    public List<Author> getAuthorList() {
        //Отктыть сессию - для манипуляции с персист обьектами
        Session session = sessionFactory.openSession();

//        //этап подготовки запроса
//
//        //обьект-конструктор запросов для Crteria API
//        CriteriaBuilder cb = session.getCriteriaBuilder(); //не использовать session.createCriteria, т.к. deprecated
//        CriteriaQuery cq = cb.createQuery(Author.class);
//        Root<Author> root = cq.from(Author.class); //первостепенный, корневой entity (в aql запросе - from)
//        cq.select(root); // необязательный оператор если нужно получит все значения
//
//        //Этап выполнения запроса
//        Query query = session.createQuery(cq);
//
//        List<Author> authorList = query.getResultList();
//
//        session.close();


        Criteria cb = session.createCriteria(Author.class);
        List<Author> authorList = cb.list();
        session.close();
        return authorList;
    }

    public List<Author> getListAuthorByName(String name) {
        Session session = sessionFactory.openSession();
        SQLQuery sqlQuery = session.createSQLQuery("select a from Author a where a.name like ?");
        sqlQuery.setParameter(0, name);
       // List<User> users = (List<User>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From User").list();
        List<Author> authorList = (List<Author>)sqlQuery.uniqueResult();
        return authorList;
    }

    public Author getAuthorByID(long id) {
        Session session = sessionFactory.openSession();
        Author author = (Author) session.get(Author.class, id);
        session.close();
        return author;
    }

    public Author addAuthor(Author author) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(author);
        session.getTransaction().commit();
        session.close();
        return author;
    }
}

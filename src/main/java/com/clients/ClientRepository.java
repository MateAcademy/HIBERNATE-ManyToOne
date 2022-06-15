package com.clients;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

/**
 * @author Sergey Klunniy
 */
public class ClientRepository {

    EntityManagerFactory emf;
    EntityManager em;

    public ClientRepository() {
        this.emf = Persistence.createEntityManagerFactory("mohr");
        this.em = emf.createEntityManager();
    }

    public Client getByID(int id) {
        em.getTransaction().begin();
        Client client = em.find(Client.class, id);
        em.getTransaction().commit();
        emf.close();
        return client;
    }

    public void add(Client c) {
        em.getTransaction().begin();
        em.merge(c);
        em.getTransaction().commit();
        emf.close();
    }

    public void remove(Client c) {
        em.getTransaction().begin();
        em.remove(c);
        em.getTransaction().commit();
        emf.close();
    }

    public List<Client> getAll() {
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT clients FROM Client clients");
        List<Client> clients = query.getResultList();
        em.getTransaction().commit();
        emf.close();
        return clients;
    }
}

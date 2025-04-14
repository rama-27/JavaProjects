package dev.rama27.Learn.DB.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class ContactDAO {
    private final SessionFactory sessionFactory;
    
    public ContactDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    public void save(Contact contact) {
        sessionFactory.inTransaction(session -> {
            session.persist(contact);
        });
    }
    
    public Contact findById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Contact.class, id);
        }
    }
    
    public List<Contact> findAll() {
        try (Session session = sessionFactory.openSession()) {
            return session.createSelectionQuery("FROM Contact", Contact.class).getResultList();
        }
    }
    
    public void update(Contact contact) {
        sessionFactory.inTransaction(session -> {
            session.merge(contact);
        });
    }
    
    public void delete(Long id) {
        sessionFactory.inTransaction(session -> {
            Contact contact = session.get(Contact.class, id);
            if (contact != null) {
                session.remove(contact);
            }
        });
    }
}

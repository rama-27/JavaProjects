package dev.rama27.Learn.DB.hibernate;


import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.time.LocalDateTime;


public class HibernateDriverCode {
    public SessionFactory sessionFactory;

    public void setUp(){
        final StandardServiceRegistry registry= new StandardServiceRegistryBuilder().build();
        try{
            sessionFactory=new MetadataSources(registry)
                    .addAnnotatedClass(Event.class)
                    .addAnnotatedClass(Contact.class)
                    .buildMetadata().buildSessionFactory();
        }
        catch (Exception e){
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }

    public void tearDown(){
        if(sessionFactory!=null){
            sessionFactory.close();
        }
    }

    public void inUse(){
        sessionFactory.inTransaction(session -> {
            session.persist(new Event("our very first event", LocalDateTime.now()));
            session.persist(new Event("a follow up event", LocalDateTime.now().plusMinutes(4)));
        });

        sessionFactory.inTransaction(session -> {
            session.createSelectionQuery("from Event", Event.class).getResultList()
                    .forEach(event -> System.out.println("Event (" + event.getDate() + ") : " + event.getTitle()));
        });
    }
    
    public void runContactCLI() {
        ContactDAO contactDAO = new ContactDAO(sessionFactory);
        ContactCLI cli = new ContactCLI(contactDAO);
        cli.start();
    }
    
    public static void main(String[] args){
        HibernateDriverCode driver = new HibernateDriverCode();
        try {
            // Initialize Hibernate
            driver.setUp();
            
            // Run Contact CLI application
            driver.runContactCLI();
            
            System.out.println("Hibernate operations completed successfully");
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Clean up resources
            driver.tearDown();
        }
    }
}

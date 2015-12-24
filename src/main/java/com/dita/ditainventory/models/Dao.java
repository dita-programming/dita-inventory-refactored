package com.dita.ditainventory.models;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Dao
{
    SessionFactory factory;
    public Dao()
    {
        try
        {
            factory = new Configuration()
                    .addPackage("com.dita.ditainventory.models")
                    .addAnnotatedClass(Team.class)
                    .configure().buildSessionFactory();
        }
        catch(Exception ex)
        {
            System.err.println(ex.getMessage());
        }
    }
    
    public void save()
    {
        Session session = factory.openSession();
        session.saveOrUpdate(this);
        session.close();
    }
    
    public void delete()
    {
        try (Session session = factory.openSession())
        {
            session.delete(this);
        }
    }
}

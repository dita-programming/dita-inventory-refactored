package com.dita.ditainventory.models;

import java.util.HashMap;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;


public class Dao
{
    private static SessionFactory factory;
    
    static {
        factory = new Configuration()
                    .addPackage("com.dita.ditainventory.models")
                    .addAnnotatedClass(Team.class)
                    .configure().buildSessionFactory();
    }
    
    public static List read()
    {
        Session session = factory.openSession();
        Criteria criteria = session.createCriteria(Dao.class);
        List result = criteria.list();
        return result;
    }
    
    public static List read(HashMap dict)
    {
        if(!dict.isEmpty())
        {
            Session session = factory.openSession();
            Criteria criteria = session.createCriteria(Dao.class);
            for(Object key: dict.keySet())
            {
                criteria.add(Restrictions.eq((String) key, dict.get(key)));
            }
            List result = criteria.list();
            return result;
        }
        else
        {
            return Dao.read();
        }
    }
    
    public void save()
    {
        Session session = factory.openSession();
        Transaction trans = session.beginTransaction();
        session.saveOrUpdate(this);
        trans.commit();
        session.close();
    }
    
    public void delete()
    {
        Session session = factory.openSession();
        session.delete(this);
        session.flush();
        session.close();
    }
    
    public static void close()
    {
        factory.close();
    }
}

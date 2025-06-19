package com.read;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.College;

public class ReadData {
    public static void main(String args[]) {
        
        Configuration conf = new Configuration();
        conf.configure("hibernate.cfg.xml");
        SessionFactory factory = conf.buildSessionFactory();
        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        int collegeId = 12; 
        College college = session.get(College.class, collegeId);
        
        if (college == null) {
            College clg = new College(collegeId, "COEP", 9);
            session.save(clg);
            System.out.println("New Data Added In the College Database: " + clg);
        } else {
            System.out.println("Data With ID " + collegeId + " Already Exists in the Database: " + college);
        }
        
        tx.commit();        
        session.close();
        factory.close();
    }
}

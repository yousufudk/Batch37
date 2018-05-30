package com.yousuf.maven.Fir;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    //github
    {
    	Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Employees e1 = new Employees(1,"Yousuf", 12345);
		Employees e2 = new Employees(2,"sufiyan", 12345);
		Employees e3 = new Employees(3,"ramesh", 12345);
		
		session.save(e1);
		session.save(e2);
		session.save(e3);
		tx.commit();
		session.close();
    }
}

package com.wfd.schoolmgt.schoolMgmt.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		Configuration config = new Configuration().addAnnotatedClass(Laptop.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		
		session.beginTransaction();
		Laptop lap = session.get(Laptop.class, 6);
		
		session.getTransaction().commit();

	}

}

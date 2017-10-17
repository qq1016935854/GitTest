package com.itqf.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	
	private static SessionFactory factory = null;
	static{
		Configuration configuration = new Configuration();
		configuration.configure();
		factory = configuration.buildSessionFactory();
	}
	
	public static Session getSession(){
		
		return factory.openSession();
		
	}
	
	public static Session currentSession(){
		return factory.getCurrentSession();
	}
}

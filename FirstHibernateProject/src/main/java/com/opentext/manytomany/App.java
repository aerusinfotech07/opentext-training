package com.opentext.manytomany;

import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App {
	public static void main(String[] args) {
		
        System.out.println("Hibernate many to many (Annotation)");
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.getSessionFactory().openSession();
	session.beginTransaction();


	Stock stock = new Stock();
        stock.setStockCode("7054");
        stock.setStockName("TCS1");
 
        Category category1 = new Category("CONSUME1", "CONSUMER COMPA1");
        Category category2 = new Category("INVESTMEN1", "INVESTMENT COMPA1");
    
        Set<Category> categories = new HashSet<Category>();
        categories.add(category1);
        categories.add(category2);
        
        stock.setCategories(categories);
        
        session.save(stock);
    
	session.getTransaction().commit();
	System.out.println("Done");
	}
}
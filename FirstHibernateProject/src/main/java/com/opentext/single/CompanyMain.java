package com.opentext.single;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.opentext.UserEntity;
public class CompanyMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Company company = new Company("Opentext", "Aqulia", 500000, 20000, "Hyd");
		Transaction tx = session.beginTransaction();
		session.save(company);
		tx.commit();
		session.close();
	}
}

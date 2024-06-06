package com.opentext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserMain2 {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();		
		UserEntity eUserEntity=new UserEntity(101, "Sita", "Rama", "6767567657", "Sita@gmail.com");
		
		Transaction tx=session.beginTransaction();
		session.save(eUserEntity);
		
		tx.commit();
		session.close();

	}

}

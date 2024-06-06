package com.opentext;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class UserMain {

	public static void main(String[] args) {
		List<String> names=new ArrayList<>();
		names.add("Ramesh");
		names.add("Rakesh");
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();		
		Criteria criteria=session.createCriteria(UserEntity.class);
		criteria.addOrder(Order.asc("firstName"));
		criteria.add(Restrictions.in("firstName", names));
		
		criteria.setMaxResults(10);
		criteria.setFirstResult(10);
		
		
		List<UserEntity> userList=criteria.list();
		userList.forEach(user->System.out.println(user));	
		
		
		
		session.close();

	}

}

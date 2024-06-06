package com.opentext.onetoone;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class App {
	public static void main(String[] args) {
		System.out.println("Hibernate one to one (Annotation)");
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.getSessionFactory().openSession();

		session.beginTransaction();

		Stock stock = new Stock();

		stock.setStockCode("7052");
		stock.setStockName("EV");

		StockDetail stockDetail = new StockDetail();
		stockDetail.setCompName("TCS");
		stockDetail.setCompDesc("Tata Consultancy");
		stockDetail.setRemark("EV Stock");
		stockDetail.setListedDate(new Date());

		stock.setStockDetail(stockDetail);
		stockDetail.setStock(stock);

		session.save(stock);
		session.getTransaction().commit();

		System.out.println("Done");
	}
}

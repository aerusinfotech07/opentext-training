package com.opentext.single;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
public class CompanyListMainUsingJava8 {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Company.class);
		List<Company> companyList = criteria.list();
		//1)List of all companies
		companyList.forEach(company->System.out.println(company));
		//List of all companies whose revenue is greater than 50Lakhs
		companyList.stream().filter(company->company.getCompanyRevenue()>5000000).forEach(company->System.out.println(company));
		//3)List of all companies belongs to location of Hyd
		companyList.stream().filter(company->company.getLocation().equals("Hyd")).forEach(company->System.out.println(company));
		//Total revenue of all companies belongs to Hyd
		double revenueOfHyd=companyList.stream().filter(company->company.getLocation().equals("Hyd")).collect(Collectors.summingDouble(Company::getCompanyRevenue));
		System.out.println("Revenue of Hyd="+revenueOfHyd);
		//5)Location wise Revenue
		Map<String,Double> revenueOfAllWithGroupBY=companyList.stream().collect(Collectors.groupingBy(Company::getLocation,Collectors.summingDouble(Company::getCompanyRevenue)));
		System.out.println("Revenue of Hyd="+revenueOfAllWithGroupBY);	
		

		
		
	}
}


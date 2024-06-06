package com.opentext.single;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.query.Query;
public class CompanyListMainUsingCriteria {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Company.class);
		List<Company> companyList = criteria.list();
		
		//1)List of all companies		
		companyList.forEach(company->System.out.println(company));
		//List of all companies whose revenue is greater than 50Lakhs
		criteria.add(Restrictions.gt("companyRevenue", 5000000));
		
		//3)List of all companies belongs to location of Hyd
		criteria.add(Restrictions.eq("location", "Hyd"));
		
		//Total revenue of all companies belongs to Hyd

		//using Projections for sum, min, max aggregation functions
		double revenueOfHyd = (Double) session.createCriteria(Company.class)
					.setProjection(Projections.sum("companyRevenue"))
					.uniqueResult();				
		System.out.println("Revenue of Hyd="+revenueOfHyd);
		//5)Location wise Revenue
		Map<String,Double> revenueOfAllWithGroupBY=companyList.stream().collect(Collectors.groupingBy(Company::getLocation,Collectors.summingDouble(Company::getCompanyRevenue)));
		groupByCriteria();

		
		
	}
	
	
	public static void groupByCriteria(){
	    try (Session session = new Configuration().configure().buildSessionFactory().openSession()) {

	        CriteriaBuilder builder = session.getCriteriaBuilder();

	        CriteriaQuery<Object[]> criteriaQuery = builder.createQuery(Object[].class);
	        Root<Company> root = criteriaQuery.from(Company.class);
	        criteriaQuery.multiselect(root.get("location"),builder.sum(root.get("CompanyRevenue")));
	        criteriaQuery.groupBy(root.get("location"));
	        Query<Object[]> query = session.createQuery(criteriaQuery);

	        List<Object[]> resultList = query.getResultList();
	        resultList.forEach(item-> System.out.println("Location : "+item[0]+"\t count : "+item[1]));

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}


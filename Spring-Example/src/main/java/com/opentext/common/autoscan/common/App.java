package com.opentext.common.autoscan.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opentext.common.autoscan.customer.services.CustomerService;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = 
    		new ClassPathXmlApplicationContext(new String[] {"Spring-AutoScan.xml"});

    	CustomerService cust = (CustomerService)context.getBean("customerService");
    	System.out.println(cust);
    	
    }
}



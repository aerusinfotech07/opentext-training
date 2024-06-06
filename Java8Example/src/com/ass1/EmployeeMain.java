package com.ass1;

public class EmployeeMain {

	public static void main(String[] args) {
		/*Employee emp1=new Employee(101,"Ramesh","Sharma","ramesh@gmail.com","54654654654",50000,"Comp");
		System.out.println(emp1.toString());
		System.out.println(emp1.getSal());
		
		System.out.println(emp1.getSal());
		*/
		//Polymorphic
		Manager m1=new Manager(101,"Sita","sdsad","ramesh@gmail.com","54654654654",50000,"Comp",34455);
		System.out.println(m1.toString());
		System.out.println(m1.getSal());
		m1.draw();
		Printable.staticMethod();
		
		
		
		
		
		/*Printable mobileCover=new Printable() {			
			@Override
			public void print() {
				System.out.println("Printed Mobile Cover ");				
			}
		};
		
		mobileCover.print();
		
		
		Printable laptopCover=()->System.out.println("Printed Mobile Cover ");
		
		laptopCover.print();
		*/
		
		
		
		//Less Coding
		//Lambda Syntex
		//3 Components 1)Arguments List 2)Arrow Token -> 3)Body
		/*
		 * No Parameter Syntax
		()->{
			
		}
		*/
		
		/*
		 * one Parameter Syntax
		(p1)->{
			System.out.println(p1);
		}
		*/
		
		/*
		 * one Parameter Syntax
		(p1,p2)->{
			System.out.println(p1+p2);
		}
		*/
		
		
		
	}

}

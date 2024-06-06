package com.ass1;


public interface Printable {
	int MAX=100;
	void print();
	default void draw()
	{
		System.out.println("Default");
	}
	public static void staticMethod()
	{
		System.out.println("Default");
	}
	
	

}

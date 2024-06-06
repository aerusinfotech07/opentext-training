package com.ass1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LambdaExpression {

	public static void main(String[] args) {
		
		Drawable d2=new Drawable() {
			
			@Override
			public String draw(String parameter) {
				// TODO Auto-generated method stub
				return "Shape Can Draw with "+parameter;
			}
		};
		
		
		
		
		Drawable d1=(p1)->"Shape Can Draw "+p1;
		
		String res=d1.draw("Rectangle");
		System.out.println(res);
		
		
		Addition add1=(x,y)->x+y;
		System.out.println(add1.add(34,45));
		
		
		List<String> countries=new ArrayList<>();
		countries.add("Mumbai");
		countries.add("Pune");
		countries.add("Indore");
		countries.add("Dehli");
		
		Iterator<String> it=countries.iterator();
		System.out.println("Using Iterator");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("Enhanced For Loop");
		for(String data:countries)
		{
			System.out.println(data);
		}
		
		countries.forEach(data->{
			System.out.println(data);
		});
		
		
		

	}

}

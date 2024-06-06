package com.ass1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaExpression2 {

	public static void main(String[] args) {
		
		List<Product> products=new ArrayList<>();
		products.add(new Product(101,"Laptop",45000));
		products.add(new Product(104,"Mouse",450));
		products.add(new Product(103,"Keyboard",500));
		products.add(new Product(102,"Pen",45));
		products.add(new Product(107,"Pen",45));
		products.add(new Product(100,"Mobile",15000));
		
		
		
		Collections.sort(products,(p1,p2)->{
			return p1.getName().compareTo(p2.getName());
		});
		
		Stream<Product> stream=products.stream().filter(product->product.getPrice()>=500);
		//stream.forEach(data->System.out.println(data));
		
		List<Float> priceList=products.stream().map(product->product.getPrice()).collect(Collectors.toList());
		System.out.println(priceList);
		
		Set<String> nameList=products.stream().map(product->product.getName()).collect(Collectors.toSet());
		System.out.println(nameList);
		
		Double sumOfProductPrice=products.stream().collect(Collectors.summingDouble(product->product.getPrice()));
		System.out.println("Total Sum "+sumOfProductPrice);
		
		long count=products.stream().collect(Collectors.counting());
		System.out.println("No Of Records "+count);
		
		
		/*for(Product product:products)
		{
			if(product.getPrice()>=500)
				System.out.println(product);
		}*/
		
		//products.forEach(data->System.out.println(data));
		
		
		
		

	}

}

package com.ass1;

import java.util.Optional;

public class OptionalExample {
	
	public static void main(String args[])
	{
		String[] str=new String[10];
		str[0]="Mumbai";
		str[1]="Mumbai";
		Optional<String> checkNull=Optional.ofNullable(str[1]);	
		
		
		if(checkNull.isPresent())
			System.out.println(str[1].toLowerCase());
		else
			System.out.println("Empty Value");
	}

}

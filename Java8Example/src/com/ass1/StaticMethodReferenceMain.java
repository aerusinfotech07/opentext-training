package com.ass1;

import java.util.Optional;

public class StaticMethodReferenceMain {

	public static void main(String[] args) {
		
		Callable call=()->{
			System.out.println("Self learning");
		};
		
		
		Callable callable=StaticMethodReference::display;
		callable.call();
		
		callable=StaticMethodReference::display;
		callable.call();
		
		StaticMethodReferenceNonStaicManager obj=new StaticMethodReferenceNonStaicManager();
		Callable callableManager=StaticMethodReferenceNonStaicManager::new;
		callableManager.call();
		
		
		
		
		
		
	}

}

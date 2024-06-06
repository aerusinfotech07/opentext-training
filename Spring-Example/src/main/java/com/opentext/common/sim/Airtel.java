package com.opentext.common.sim;

public class Airtel implements Sim {

	@Override
	public void calling() {
		System.out.println("Calling Through Airtel Sim");

	}

	@Override
	public void data() {
		System.out.println("Surfing Data Through Airtel Sim");

	}

}

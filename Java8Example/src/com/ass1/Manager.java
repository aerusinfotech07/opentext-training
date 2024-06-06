package com.ass1;

public class Manager extends Employee implements Printable,Cloneable{
	
	private double comm;

	public double getComm() {
		return comm;
	}

	public void setComm(double comm) {
		this.comm = comm;
	}
	
	public double getSal() {
		return super.getSal()+comm;
	}

	public Manager(double comm) {
		super();
		this.comm = comm;
	}

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Manager(int id, String firstName, String lastName, String emailId, String mobileNumber, double sal,
			String dept,double comm) {
		super(id, firstName, lastName, emailId, mobileNumber, sal, dept);
		this.comm=comm;
	}

	@Override
	public String toString() {
		return  super.toString()+  "Manager [comm=" + comm +"]";
	}

	@Override
	public void print() {
		System.out.println("Manager Can Print");
		
	}
	
	
		
	

}

package com.opentext.single;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", length = 100, nullable = false)
	private int id;
	
	@Column(name = "companyName", length = 100, nullable = false)
	private String companyName;
	
	@Column(name = "companyAddress", length = 100, nullable = false)
	private String companyAddress;
	
	@Column(name = "companyRevenue", length = 100, nullable = false)
	private double companyRevenue;
	
	@Column(name = "numberOfEmp", length = 100, nullable = false)
	private int numberOfEmp;
	
	@Column(name = "location", length = 100, nullable = false)
	private String location;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public double getCompanyRevenue() {
		return companyRevenue;
	}

	public void setCompanyRevenue(double companyRevenue) {
		this.companyRevenue = companyRevenue;
	}

	public int getNumberOfEmp() {
		return numberOfEmp;
	}

	public void setNumberOfEmp(int numberOfEmp) {
		this.numberOfEmp = numberOfEmp;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Company(String companyName, String companyAddress, double companyRevenue, int numberOfEmp,
			String location) {
		super();
		this.companyName = companyName;
		this.companyAddress = companyAddress;
		this.companyRevenue = companyRevenue;
		this.numberOfEmp = numberOfEmp;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", companyName=" + companyName + ", companyAddress=" + companyAddress
				+ ", companyRevenue=" + companyRevenue + ", numberOfEmp=" + numberOfEmp + ", location=" + location
				+ "]";
	}
	
	
	
}


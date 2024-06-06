package com.opentext;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "AREA",length = 100,nullable = false)
	private String area;
	
	@Column(name = "PIN_CODE",length = 100,nullable = false)
	private String pincode;
	
	@Column(name = "CITY",length = 100,nullable = false)
	private String city;
	
	@Column(name = "STATE",length = 100,nullable = false)
	private String state;
	
	@Column(name = "COUNTRY",length = 100,nullable = false)
	private String country;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", area=" + area + ", pincode=" + pincode + ", city=" + city + ", state=" + state
				+ ", country=" + country + "]";
	}

	public Address(int id, String area, String pincode, String city, String state, String country) {
		super();
		this.id = id;
		this.area = area;
		this.pincode = pincode;
		this.city = city;
		this.state = state;
		this.country = country;
		
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
	

}

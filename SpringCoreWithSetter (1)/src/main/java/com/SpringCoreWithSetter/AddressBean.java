package com.SpringCoreWithSetter;

public class AddressBean {
	
	private String street;
	private String city;
	private String contry;
	
	
	public String getStreet() {
		return street;
	}
   public void setStreet(String street) {
		this.street = street;
	}
   public String getCity() {
		return city;
	}
   public void setCity(String city) {
		this.city = city;
	}
   public String getContry() {
		return contry;
	}

   public void setContry(String contry) {
		this.contry = contry;
	}


  @Override
	public String toString() {
		return "AddressBean [street=" + street + ", city=" + city + ", contry=" + contry + "]";
	}
	
	
	

}

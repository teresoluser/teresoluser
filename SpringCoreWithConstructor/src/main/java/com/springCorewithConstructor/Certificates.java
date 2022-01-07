package com.springCorewithConstructor;

public class Certificates {
	
	String name;


	public Certificates(String name){
		super();
		
		this.name=name;
	}


	@Override
	public String toString() {
		return this.name;
	}


//	public String getName() {
//		return name;
//	}
//
//
//	public void setName(String name) {
//		this.name = name;
//	}


}

package com.springCorewithConstructor;

import java.util.Iterator;
import java.util.List;

public class Person {
	
	private String name;
	private int id;
	private Certificates certificates;
	private List<String> list;
	
	
	
	public Person(String name, int id, Certificates certificates) {
		this.name = name;
		this.id = id;
		this.certificates=certificates;
		//this.list=list;
	}
	
	
	
	 
   public String getName() {
		return name;
	}
   public void setName(String name) {
		this.name = name;
	}
   public int getId() {
		return id;
	}
   public void setId(int id) {
		this.id = id;
	}
    public Certificates getCertificates() {
		return certificates;
	}
   public void setCertificates(Certificates certificates) {
		this.certificates = certificates;
	}

   public List<String> getList() {
		return list;
	}

    public void setList(List<String> list) {
		this.list = list;
	}


    @Override
	public String toString() {
		return this.name+ "   :  " +this.id+"{"+this.certificates.name+"}";
	}

	
	
	public void displayInfo(){  
	    System.out.println(id+" "+name);  
	    System.out.println("answers are:");  
	    Iterator<String> itr=list.iterator();  
	    while(itr.hasNext()){  
	        System.out.println(itr.next());  
	    }  
	}  
	

}

//package com.example.demo.model;
//
//import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.List.*;
//
//import javax.persistence.CascadeType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//
//public class DepartmentEntity implements Serializable {
//	
//	 private static final long serialVersionUID = 1L;
//     
//	    @Id
//	    @GeneratedValue
//	    private Integer id;
//	    private String name;
//	      
//	    public DepartmentEntity(){
//	    }
//	  
//	    public DepartmentEntity(String name) {
//	        super();
//	        this.name = name;
//	    }
//	      
//	    @OneToMany(mappedBy="DepartmentEntity",cascade=CascadeType.PERSIST)
//	    private List<Student> employees = new ArrayList<Student>();
//	      
//	    //Setters and Getters
//	     
//	     @Override
//	    public String toString() {
//	        return "DepartmentVO [id=" + id + ", name=" + name + "]";
//	    }
//
//}

//package com.example.demo.model;
//
//import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.NamedNativeQueries;
//import javax.persistence.NamedNativeQuery;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//
//
//
//@Entity(name="EmployeeEntity")
//@Table (name="student")
//
//@NamedNativeQueries({
//    @NamedNativeQuery(
//            name    =   "getAllEmployees",
//            query   =   "SELECT id, firstName, lastName, email, department.id, department.name " +
//                        "FROM employee, department",
//                        resultClass=Student.class
//    ),
//    @NamedNativeQuery(
//            name    =   "getAllEmployeesByDeptId",
//            query   =   "SELECT id, firstName, lastName, email, department.id, department.name " +
//                        "FROM employee, department " + 
//                        "WHERE department.id = ?",
//                        resultClass=Student.class
//    )
//})
//
//public class Student implements Serializable {
//	
//	   private static final long serialVersionUID = 1L;
//	 @Id
//	    @GeneratedValue
//	    private Integer id;
//	      
//	    private String firstName;
//	    private String lastName;
//	    private String email;
//	    
//	    Student(){}
//	    
//	    
//		public Student(Integer id, String firstName, String lastName, String email) {
//			super();
//			this.id = id;
//			this.firstName = firstName;
//			this.lastName = lastName;
//			this.email = email;
//		}
//		
//	    @OneToMany(mappedBy="Student",cascade=CascadeType.PERSIST)
//	    private List<Student> employees = new ArrayList<Student>();
//	      
//
//		@Override
//		public String toString() {
//			return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
//					+ "]";
//		}
//	
//	    
//	    
//
//}

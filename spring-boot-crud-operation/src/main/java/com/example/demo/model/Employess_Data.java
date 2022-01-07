package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity  
//defining class name as Table name  
@Table  
public class Employess_Data {

	 
	//Defining book id as primary key  
	@Id  
	@Column  
	private int empId;  
	@Column  
	private String empName;  
	@Column  
	private String empDept; 
	@Column  
	private String empPhone; 
	@Column  
	private int empSallary; 
	@Column  
	private String empAddress;
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public String getEmpPhone() {
		return empPhone;
	}
	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}
	public int getEmpSallary() {
		return empSallary;
	}
	public void setEmpSallary(int empSallary) {
		this.empSallary = empSallary;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	} 
	
	
	
	
}

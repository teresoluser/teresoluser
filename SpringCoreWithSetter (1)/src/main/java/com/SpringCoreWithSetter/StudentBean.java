package com.SpringCoreWithSetter;

public class StudentBean {
	
	
	private int stuId;
	private String stuName;
	private String  address;
	
	
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "StudentBean [stuId=" + stuId + ", stuName=" + stuName + ", address=" + address + "]";
	}

	
	
	
}

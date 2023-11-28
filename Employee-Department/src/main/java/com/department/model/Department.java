package com.department.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("collection = departments")
public class Department {
	
	private int departmentId;
    private String departmentName;
    
    
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName
				+ ", getDepartmentId()=" + getDepartmentId() + ", getDepartmentName()=" + getDepartmentName()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	public Department(int departmentId, String departmentName) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	
	
    

}

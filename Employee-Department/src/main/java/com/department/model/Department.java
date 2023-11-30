package com.department.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("collection = departments")
public class Department {
	
	// Attributes of the Department class
		private int departmentId;
	    private String departmentName;
	    
	    // Getter and setter methods for departmentId
		public int getDepartmentId() {
			return departmentId;
		}
		public void setDepartmentId(int departmentId) {
			this.departmentId = departmentId;
		}
		
		// Getter and setter methods for departmentName
		public String getDepartmentName() {
			return departmentName;
		}
		public void setDepartmentName(String departmentName) {
			this.departmentName = departmentName;
		}
		
		// Overridden toString method for representing Department object details
		@Override
		public String toString() {
			return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName
					+ ", getDepartmentId()=" + getDepartmentId() + ", getDepartmentName()=" + getDepartmentName()
					+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
					+ "]";
		}
		
		// Parameterized constructor for Department class
		public Department(int departmentId, String departmentName) {
			super();
			this.departmentId = departmentId;
			this.departmentName = departmentName;
		}
		
		// Default constructor for Department class
		public Department() {
			super();
			// TODO Auto-generated constructor stub
		}
	}

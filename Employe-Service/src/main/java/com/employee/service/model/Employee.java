package com.employee.service.model;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Employee entity representing an employee in the system.
 * Annotated with @Document to specify the collection name in MongoDB.
 */
@Document("collection = ems")
public class Employee {
	
	private int emp_id;
	private String emp_first_name;
	private String emp_last_name;
	private String emp_email;
	private int emp_contact;
	
	//Setter & Getters
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_first_name() {
		return emp_first_name;
	}
	public void setEmp_first_name(String emp_first_name) {
		this.emp_first_name = emp_first_name;
	}
	public String getEmp_last_name() {
		return emp_last_name;
	}
	public void setEmp_last_name(String emp_last_name) {
		this.emp_last_name = emp_last_name;
	}
	public String getEmp_email() {
		return emp_email;
	}
	public void setEmp_email(String emp_email) {
		this.emp_email = emp_email;
	}
	public int getEmp_contact() {
		return emp_contact;
	}
	public void setEmp_contact(int emp_contact) {
		this.emp_contact = emp_contact;
	}
	
	/**
	 * Returns the string representation of the Employee object.
	 */	
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_first_name=" + emp_first_name + ", emp_last_name=" + emp_last_name
				+ ", emp_email=" + emp_email + ", emp_contact=" + emp_contact + ", getEmp_id()=" + getEmp_id()
				+ ", getEmp_first_name()=" + getEmp_first_name() + ", getEmp_last_name()=" + getEmp_last_name()
				+ ", getEmp_email()=" + getEmp_email() + ", getEmp_contact()=" + getEmp_contact() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	/**
	 * Constructor to initialize an Employee object with specified values.
	 */
	
	public Employee(int emp_id, String emp_first_name, String emp_last_name, String emp_email, int emp_contact) {
		super();
		this.emp_id = emp_id;
		this.emp_first_name = emp_first_name;
		this.emp_last_name = emp_last_name;
		this.emp_email = emp_email;
		this.emp_contact = emp_contact;
	}
	
	
	/**
	 * Default constructor.
	 */
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}

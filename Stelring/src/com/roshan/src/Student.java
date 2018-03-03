package com.roshan.src;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Student {

	private int empNo;
	private String name;
	private List<String> emailId;
	private Employee Employee;



	public Student() {
		
	}

	

	public Student(int empNo, String name, List<String> emailId, Employee employee) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.emailId = emailId;
		this.Employee = employee;
	}



	public int getEmpNo() {
		return empNo;
	}

	@XmlAttribute
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	
	public String getName() {
		return name;
	}

	@XmlAttribute
	public void setName(String name) {
		this.name = name;
	}

	
	public List<String> getEmailId() {
		return emailId;
	}

	@XmlElement
	public void setEmailId(List<String> emailId) {
		this.emailId = emailId;
	}

	public Employee getEmployee() {
		return Employee;
	}
	@XmlElement
	public void setEmployee(Employee employee) {
		this.Employee = employee;
	}

	
}

package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.core.convert.Property;

public class Employee {
	private String name;
	private List<String> phones;
	private Set<String> addresses;
	private Map<String, String> courses;
	private Properties cprop;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Properties getCprop() {
		return cprop;
	}
	public void setCprop(Properties cprop) {
		this.cprop = cprop;
	}
	
	public Employee(String name, List<String> phones, Set<String> addresses, Map<String, String> courses,
			Properties cprop) {
		super();
		this.name = name;
		this.phones = phones;
		this.addresses = addresses;
		this.courses = courses;
		this.cprop = cprop;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", phones=" + phones + ", addresses=" + addresses + ", courses=" + courses
				+ ", cprop=" + cprop + "]";
	}
	
	
	
 }

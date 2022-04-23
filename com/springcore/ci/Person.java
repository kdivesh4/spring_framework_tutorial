package com.springcore.ci;

import java.util.List;

public class Person {
	
	private int personId;
	private String name;
	private Certi certi;
	private List<String> courses;
	
	public Person(int personId, String name, Certi certi, List<String> courses) {
		this.personId = personId;
		this.name = name;
		this.certi = certi;
		this.courses = courses;
	}
	
	@Override
	public String toString() {
		return "Person ID	: "+this.personId+"\n"+ 
			   "Person Name	: "+this.name+"\n"+
			   "Certification	: "+this.certi.name+"\n"+
			   "Other Courses	: "+this.courses;
	}
}

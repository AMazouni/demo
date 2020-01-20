package com.example.demo.model;

import java.util.UUID;

public class Student {

	private final UUID id;
	private final Integer age;
	private final String firstName;
  	private final String LastName;
  	private final String course; 
  	
	public Student(UUID id,
			       Integer age,
			       String firstName,
			       String lastName,
			       String course) {
		super();
		this.id = id;
		this.age = age;
		this.firstName = firstName;
		LastName = lastName;
		this.course = course;
	}
	public UUID getId() {
		return id;
	}
	public Integer getAge() {
		return age;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public String getCourse() {
		return course;
	} 
  	
	
}
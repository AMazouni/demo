package com.example.demo.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {

	private final UUID id;
	private final Integer age;
	private final String firstName;
  	private final String LastName;
  	private final String course; 
  	
	public Student(
			       
			       @JsonProperty("age") Integer age,
			       @JsonProperty("firstName") String firstName,
			       @JsonProperty("lastName") String lastName,
			       @JsonProperty("course") String course) {
		super();
		this.id = UUID.randomUUID();
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
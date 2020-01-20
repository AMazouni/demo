package com.example.demo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.StudentService;
import com.example.demo.model.*;

@RestController
@RequestMapping("api/v1/students")
public class StudentResource {

	private final StudentService studentService;
		
	@Autowired
	public StudentResource(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

   @RequestMapping(
		   method= RequestMethod.GET,
		   produces = MediaType.APPLICATION_JSON_VALUE
		   )
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	
}

package com.example.demo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.StudentService;
import com.example.demo.model.*;

@RestController

public class StudentResource {

	private final StudentService studentService;
		
	@Autowired
	public StudentResource(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

   @RequestMapping(
		   value="api/v1/students/all",
		   method= RequestMethod.GET,
		   produces = MediaType.APPLICATION_JSON_VALUE
		   )
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
   @RequestMapping(
		   value="api/v1/students/add",
		   method= RequestMethod.POST,
		   consumes = MediaType.APPLICATION_JSON_VALUE
		   )
   public void insertNewStudent(@RequestBody Student student) {
	   studentService.persistNewStudent(student);
	   
   }
	
}

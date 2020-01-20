package com.example.demo.service;


import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.example.demo.dao.StudentDao;
import com.example.demo.model.Student;

public class StudentService {

	private final StudentDao studentDao;
	
	
	@Autowired
	public StudentService(@Qualifier("FakeDao") StudentDao studentDao) {
		super();
		this.studentDao = studentDao;
	}

	public int persistNewStudent(Student student) {
		UUID studentId= UUID.randomUUID();
		return studentDao.insertNewStudent(studentId, student) ;
		
	}
	
	public Student getStudentById(UUID studentId) {
		return studentDao.selectStudentById(studentId);
		
	}
	
	public List<Student> getAllStudents(){
		return studentDao.selectAllStudents();
		
	}
	
	public int updateStudentById(UUID studentId,Student newStudent) {
		return studentDao.updateStudentById(studentId, newStudent);
		
	}
	public int deleteStudentById(UUID studentId) {
		Student rmStudent = this.getStudentById(studentId);
	
		return studentDao.deleteStudentById(studentId);
	
	}


	
}

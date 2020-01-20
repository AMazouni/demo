package com.example.demo.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.example.demo.model.Student;

public class FakeStudentDaoImpl implements StudentDao {

	private final Map<UUID, Student> database;
	
	public FakeStudentDaoImpl() {
		super();
		database = new HashMap<>();
		
	}

	@Override
	public int insertNewStudent(UUID studentId, Student student) {
		database.put(studentId, student);
		return 0;
	}

	@Override
	public Student selectStudentById(UUID studentId) {
		
		return database.get(studentId);
	}

	@Override
	public List<Student> selectAllStudents() {
		
		return new ArrayList<>(database.values());
	}

	@Override
	public int updateStudentById(UUID studentId, Student newStudent) {
		database.put(studentId,newStudent);
		return 1;
	}

	@Override
	public int deleteStudentById(UUID studentId) {
		database.remove(studentId);
		return 1;
	}

}

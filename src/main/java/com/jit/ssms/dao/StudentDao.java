package com.jit.ssms.dao;

import com.jit.ssms.model.Student;

import java.util.List;

public interface StudentDao {

	int insertStudent(Student student);

	int deleteStudent(int id);

	int updateStudent(Student student);

	List<Student> selectStudentByName(String name);

	Student selectStudentById(int id);

	List<Student> selectAllStudent();

	void delclass(int id);
}
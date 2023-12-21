package com.jit.ssms.dao;

import com.jit.ssms.model.Teacher;

import java.util.List;

public interface TeacherDao {

	int insertTeacher(Teacher teacher);

	int deleteTeacher(int id);

	int updateTeacher(Teacher teacher);

	List<Teacher> selectTeacherByName(String name);

	Teacher selectTeacherById(int id);

	List<Teacher> selectAllTeacher();
	void delkecheng(int id);
}
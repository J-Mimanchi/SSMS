package com.jit.ssms.dao;

import com.jit.ssms.model.Classs;

import java.util.List;

public interface ClasssDao {

	int insert(Classs classs);

	int delete(int id);

	int update(Classs classs);

	List<Classs> selectByName(String name);

	Classs selectById(int id);

	List<Classs> selectAll();
}
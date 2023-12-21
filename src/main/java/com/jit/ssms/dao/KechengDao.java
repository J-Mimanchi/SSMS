package com.jit.ssms.dao;

import com.jit.ssms.model.Kecheng;

import java.util.List;

public interface KechengDao {

	int insert(Kecheng temp);

	int delete(int id);

	int update(Kecheng temp);

	List<Kecheng> selectByName(String name);

	Kecheng selectById(int id);

	List<Kecheng> selectAll();
}
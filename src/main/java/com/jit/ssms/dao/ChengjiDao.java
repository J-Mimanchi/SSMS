package com.jit.ssms.dao;

import com.jit.ssms.model.Chengji;

import java.util.List;

public interface ChengjiDao {

	int insert(Chengji classs);

	int delete(int id);

	int update(Chengji classs);

	List<Chengji> selectByName(String name);

	Chengji selectById(int id);

	List<Chengji> selectAll();
}
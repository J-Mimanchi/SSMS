package com.jit.ssms.dao;

import java.sql.SQLException;

public interface LoginDao {
    boolean findUser(String username,String password) throws ClassNotFoundException, SQLException;
}

package com.jit.ssms.daoimp;

import com.jit.ssms.dao.LoginDao;
import com.jit.ssms.model.Chengji;

import java.sql.*;

public class LoginDaoImp implements LoginDao{

    private final String jdbcDriver = "com.mysql.cj.jdbc.Driver";
    private final String url = "jdbc:mysql://localhost:3306/SSMS?serverTimezone=UTC";
    private final String userName = "root";
    private final String pwd = "jxb120608";
    @Override
    public boolean findUser(String username, String password){
        try {
            Class.forName(jdbcDriver);
            Connection conn = DriverManager.getConnection(url, userName, pwd);
            String sql = "SELECT * FROM admin WHERE username = ? AND password = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("ClassNotFoundException: " + e.getMessage());
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("SQLException: " + e.getMessage());
            return false;
        }
    }
}

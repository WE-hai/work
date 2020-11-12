package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBC {

    public boolean login(String username,String password1) throws ClassNotFoundException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/login?useSSL=false&characterEncoding=utf8";
            // 连接数据库的用户名
            String user = "root";
            // 连接数据库的密码
            String password = "";
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("success");
            PreparedStatement sql = connection.prepareStatement("select login_time,status from `user` where username=? and password=?");
            sql.setString(1,username);
            sql.setString(2,password);
            ResultSet rs = sql.executeQuery();
            while (rs.next()) {
                //String loginTime = rs.getString(1);
                //String status = rs.getString(2);
                return true;
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}

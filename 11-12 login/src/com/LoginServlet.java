package com;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        JDBC login = new JDBC();
        boolean flag = true;
        try {
            flag = login.login(username,password);
            Date date = new Date();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (flag) {
            req.setAttribute("msg","登陆成功");
            System.out.println("登陆成功");
        } else {
            req.setAttribute("msg","登陆失败");
            System.out.println("登陆失败");
        }
    }
}

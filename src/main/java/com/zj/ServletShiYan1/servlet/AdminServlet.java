package com.zj.ServletShiYan1.servlet;

import com.zj.ServletShiYan1.impl.AdminDaoImpl;
import com.zj.ServletShiYan1.impl.StudentDaoImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "AdminServlet", value = "/AdminServlet")
public class AdminServlet extends HttpServlet {
    AdminDaoImpl adminDao = new AdminDaoImpl();
    StudentDaoImpl studentDao = new StudentDaoImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        // 获取用户名
        String name = request.getParameter("name");
        // 获取密码
        String password = request.getParameter("password");

        // 查询用户名和密码是否正确
        try {
            if (adminDao.login(name, password)) {
                // 登录成功
                //查询所有学生信息
                request.getSession().setAttribute("studentList",studentDao.findAll());
                request.getSession().setAttribute("user", name);
                response.sendRedirect(request.getContextPath()+"/ServletShiYan1/index.jsp");
            }
            else {
                // 登录失败
                request.getSession().setAttribute("msg", "用户名或密码错误");
                request.getRequestDispatcher("/ServletShiYan1/error.jsp").forward(request, response);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

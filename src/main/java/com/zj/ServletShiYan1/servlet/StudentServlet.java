package com.zj.ServletShiYan1.servlet;

import cn.itcast.servlet.BaseServlet;
import com.zj.ServletShiYan1.impl.StudentDaoImpl;

import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;

@WebServlet(name = "StudentServlet", value = "/StudentServlet")
public class StudentServlet extends BaseServlet {
    StudentDaoImpl  studentDao =new StudentDaoImpl();
    public String delete(HttpServletRequest request, HttpServletResponse response) throws SQLException, UnsupportedEncodingException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        // 获取要删除的学生id
        String id = request.getParameter("id");
        // 调用service删除
        int result = studentDao.delete(Integer.parseInt(id));
        if (result==1){
            // 删除成功
            request.setAttribute("msg", "删除成功");
            System.out.println("删除成功");

        }else {
            // 删除失败
            request.setAttribute("msg", "删除失败");
            System.out.println("删除失败");
        }
        //查询所有学生信息
        request.getSession().setAttribute("studentList",studentDao.findAll());
        return "f:/ServletShiYan1/index.jsp";
    }
}

package com.zj.j2eehomework.zuoye8;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Zuoye8Servlet", value = "/Zuoye8Servlet")
public class Zuoye8Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String ucode = request.getParameter("ucode");
        String password = request.getParameter("password");
        if(ucode.equals("admin") && password.equals("admin")){
            User user=new User();
            user.setUcode(ucode);
            user.setPassword(password);
            request.getSession().setAttribute("user",user);
            //重定向
            response.sendRedirect(request.getContextPath()+"/zuoye8/index.jsp");
        }else{
            request.setAttribute("msg","用户名或密码错误");
            //转发
            request.getRequestDispatcher("/zuoye8/error.jsp").forward(request,response);
        }

    }
}

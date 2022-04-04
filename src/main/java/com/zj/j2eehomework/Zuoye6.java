package com.zj.j2eehomework;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Zuoye6", value = "/Zuoye6")
public class Zuoye6 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String cities="常州市;徐州市;南京市;淮安市;南通市;宿迁市;无锡市;扬州市;盐城市;苏州市;泰州市;镇江市;连云港市";
        request.getSession().setAttribute("cities",cities);
        response.sendRedirect("zuoye6.jsp");
    }


}

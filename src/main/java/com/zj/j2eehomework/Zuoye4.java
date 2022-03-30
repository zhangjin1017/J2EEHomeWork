package com.zj.j2eehomework;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Zuoye4", value = "/Zuoye4")
public class Zuoye4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        List<Double> scoreList=new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            double a=Math.random()*100;
            String score=String.format("%.2f",a);
            scoreList.add(Double.parseDouble(score));
        }
        request.getSession().setAttribute("scoreList",scoreList);
        response.sendRedirect("zuoye4.jsp");
    }
}

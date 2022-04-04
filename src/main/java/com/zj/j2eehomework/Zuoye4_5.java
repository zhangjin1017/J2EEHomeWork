package com.zj.j2eehomework;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Zuoye4_5", value = "/Zuoye4_5")
public class Zuoye4_5 extends HttpServlet {
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
        String schools="江苏海洋大学,中国海洋大学,广东海洋大学,浙江海洋大学,大连海洋大学,上海海洋大学";
        request.getSession().setAttribute("scoreList",scoreList);
        request.getSession().setAttribute("schools",schools);
        response.sendRedirect("zuoye4_5.jsp");
    }
}

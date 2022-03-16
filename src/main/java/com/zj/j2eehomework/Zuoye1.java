package com.zj.j2eehomework;

import cn.itcast.servlet.BaseServlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.System.out;

@WebServlet(name = "Zuoye1", value = "/Zuoye1")
public class Zuoye1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        Date date = new Date();
        // 指定格式化格式
        SimpleDateFormat sdf = new SimpleDateFormat("现在是 " + "yyyy 年 MM 月 dd 日 E HH 点 mm 分 ss 秒");
        PrintWriter pw = response.getWriter();
        pw.print("<h1>" + sdf.format(date) + "</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
    }
}

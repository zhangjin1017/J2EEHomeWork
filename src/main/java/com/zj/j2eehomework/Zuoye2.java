package com.zj.j2eehomework;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import static java.lang.System.out;

@WebServlet(name = "Zuoye2", value = "/Zuoye2")
public class Zuoye2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        int hang = Integer.parseInt(request.getParameter("hang"));
        int lie = Integer.parseInt(request.getParameter("lie"));
        String neirong = request.getParameter("neirong");
        PrintWriter pw = response.getWriter();
        pw.print("<h1>生成的表格</h1>");
        pw.print("<table border='1'>");
        for (int i = 0; i < hang; i++) {
            pw.print("<tr>");
            for (int j = 0; j < lie; j++){
                pw.print("<td>");
                pw.print(neirong);
                pw.print("</td>");
            }
            pw.print("</tr>");
        }
        pw.print("</table>");

    }
}

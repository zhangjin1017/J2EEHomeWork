package com.zj.j2eehomework.zuoye8;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "Zuoye8Filter",urlPatterns = "/zuoye8/index.jsp")
public class Zuoye8Filter implements Filter {
    public void init(FilterConfig config) throws ServletException {
        System.out.println("Zuoye8Filter init-----------------");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        System.out.println("Zuoye8Filter doFilter----------------");
        //从seesion中取出user对象
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        User user= (User) req.getSession().getAttribute("user");
        if (user==null) {
            req.setAttribute("msg", "你还没有登录!!!");
            //转发到登录页面
            req.getRequestDispatcher("/zuoye8/error.jsp").forward(req,resp);
        }else {
            chain.doFilter(request, response);
        }


    }
}

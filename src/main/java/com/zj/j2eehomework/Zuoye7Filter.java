package com.zj.j2eehomework;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebFilter(filterName = "Zuoye7",urlPatterns = "/hello.jsp")
public class Zuoye7Filter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        double probability=Math.random();
        System.out.println(probability);
        if(probability>0.5){
            chain.doFilter(request, response);
        }else{
            request.setAttribute("msg","你运气不好，访问失败了");
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
}

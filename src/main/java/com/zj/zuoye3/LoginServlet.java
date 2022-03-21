package com.zj.zuoye3;

import com.zj.commons.CommonUtils;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        User form= null;
        try {
            form = CommonUtils.toBean(request.getParameterMap(), User.class);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        Map<String,String> errors = new HashMap<String,String>();
        String username = form.getUsername();//获取表里的 usexname.
        if (username ==null||username.trim().isEmpty()) {
            errors.put ( "username" ,"用户名不能为空!");
        } else if(username.length() < 6||username.length() > 15){
            errors.put ( "username","用户名长度必须在6~15之间!");
        }
        String password = form.getPassword();//获取表里的 usexname.
        if (password ==null||password.trim().isEmpty()) {
            errors.put ( "password" ,"密码不能为空!");
        } else if(password.length() < 6||password.length() > 15){
            errors.put ( "password","密码长度必须在6~15之间!");
        }

        String sessionVerifyCode= (String) request.getSession().getAttribute("session_vcode");
        String verifyCode = form.getVerifyCode();//获取表里的 usexname.
        if (verifyCode ==null||verifyCode.trim().isEmpty()) {
            errors.put ( "verifyCode" ,"验证码不能为空!");
        } else if(verifyCode.length() !=4){
            errors.put ( "verifyCode","验证码长度必须为4!");
        }else if (!sessionVerifyCode.equalsIgnoreCase(verifyCode)) {
            errors.put ( "verifyCode","验证码错误!");
        }

        if(errors!=null&&errors.size()>0){
            request.setAttribute("errors",errors);
            request.setAttribute("user",form);
            request.getRequestDispatcher("/zuoye3/login.jsp").forward(request,response);
            return;
        }
        request.getSession().setAttribute("userSession",form);
        response.sendRedirect(request.getContextPath()+"/zuoye3/welcome.jsp");
    }
}

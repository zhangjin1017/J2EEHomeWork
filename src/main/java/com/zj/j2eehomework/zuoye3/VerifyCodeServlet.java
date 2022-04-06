package com.zj.j2eehomework.zuoye3;

import com.zj.commons.VerifyCode;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;

@WebServlet(name = "VerifyCodeServlet", value = "/VerifyCodeServlet")
public class VerifyCodeServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        VerifyCode code = new VerifyCode();
        BufferedImage image = code.createImage();
        System.out.println("yzm："+code.getText());
        req.getSession().setAttribute("session_vcode",code.getText());
//        ImageIO.write(image,"jpg",res.getOutputStream());
		VerifyCode.output(image,res.getOutputStream());
    }
}

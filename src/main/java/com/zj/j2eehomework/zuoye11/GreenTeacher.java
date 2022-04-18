package com.zj.j2eehomework.zuoye11;

import org.springframework.stereotype.Component;

@Component("green")
public class GreenTeacher extends TeachJavaAble {
    public void teachJava() throws Exception{
        System.out.println("格林老师java课程--------");
    }
}

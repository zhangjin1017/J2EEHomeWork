package com.zj.j2eehomework.zuoye11;

import org.springframework.stereotype.Component;

@Component("huang")
public class HuangTeacher {
    public void teachJava() throws Exception{
        double r=Math.random();
        if(r>0.5){
            throw  new Exception("我中了五百万，不给你们上课了");
        }
        System.out.println("黄老师java课程--------");
    }
}

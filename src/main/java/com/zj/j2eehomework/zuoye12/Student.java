package com.zj.j2eehomework.zuoye12;

import org.springframework.stereotype.Component;

@Component("student")
public class Student {
    public void addMark(){
        System.out.println("addMark-------------");
    }
    public void delMark(){
        System.out.println("printMark-----------");
    }
    public void updateMark(){
        System.out.println("updateMark----------");
    }
    public void printMark(){
        System.out.println("printMark-----------");
    }

}

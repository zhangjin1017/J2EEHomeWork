package com.zj.j2eehomework.zuoye11;

import org.springframework.stereotype.Component;
import javax.annotation.Resource;

@Component("stu")
public class Student {
    @Resource(name="green")
    private TeachJavaAble teacher;
    private String name="张三";
    private int age=20;
    public Student(){

    }

    public Student(String name, int age, TeachJavaAble teacher) {
        this.name=name;
        this.age=age;
        this.teacher=teacher;
        System.out.println("Student被创建了--------");
    }

    private void stuInit() {
        System.out.println("Student初始化--------");
    }

    private void stuDestroy() {
        System.out.println("Student被销毁--------");
    }

    public void studyJava() throws Exception {
        System.out.println(name+"起床-----我今年"+age);
        teacher.teachJava();
        System.out.println(name+"下课-----");
    }



}

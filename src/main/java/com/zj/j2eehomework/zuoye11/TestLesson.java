package com.zj.j2eehomework.zuoye11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLesson{
    public static void main(String[] args) throws Exception{
//        构建spring容器，spring会自动的构建对象并构建对象间的依赖关系
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        从容器中拿出学生对象
        Student stu=(Student) ctx.getBean("stu");
//        调用学生对象的学习方法
        stu.studyJava();
        System.out.println(stu);
        stu=(Student) ctx.getBean("stu");
//        调用学生对象的学习方法
        stu.studyJava();
        System.out.println(stu);
        
    }
}

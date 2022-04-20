package com.zj.j2eehomework.zuoye12;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    @Test
    public void test1() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("student");
        student.addMark();
        student.delMark();
        student.updateMark();
        student.printMark();

    }
}

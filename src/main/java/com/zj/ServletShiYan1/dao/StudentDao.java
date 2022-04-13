package com.zj.ServletShiYan1.dao;

import com.zj.ServletShiYan1.pojo.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentDao {
    public List<Student> findAll() throws SQLException;
    public int add(Student student) throws SQLException;
    public int update(Student student) throws SQLException;
    public int delete(int id) throws SQLException;
    public Student findById(int id) throws SQLException;
}

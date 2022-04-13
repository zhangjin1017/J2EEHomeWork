package com.zj.ServletShiYan1.impl;

import cn.itcast.jdbc.TxQueryRunner;
import com.zj.ServletShiYan1.dao.StudentDao;
import com.zj.ServletShiYan1.pojo.Student;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    QueryRunner qr=new TxQueryRunner();
    @Override
    public List<Student> findAll() throws SQLException {
        String sql="select * from t_student";
        return qr.query(sql,new BeanListHandler<Student>(Student.class));
    }

    @Override
    public int add(Student student) throws SQLException {
        String sql="insert into t_student(name,age,gender,place) values(?,?,?,?)";
        Object[] params = {student.getName(),student.getAge(),student.getGender(),student.getPlace()};
        return qr.update(sql, params);
    }

    @Override
    public int update(Student student) throws SQLException {
        String sql="update t_student set name=?,age=?,gender=?,place=?  where id =?";
        return qr.update(sql,student.getName(),student.getAge(),student.getGender(),student.getPlace(),student.getId());
    }

    @Override
    public int delete(int id) throws SQLException {
        String sql="delete from t_student where id=?";
        return qr.update(sql,id);
    }

    @Override
    public Student findById(int id) throws SQLException {
        String sql="select * from t_student where id=?";
        List<Student> studentList = qr.query(sql, new BeanListHandler<Student>(Student.class), id);
        if (studentList.size()==1){
            return studentList.get(0);
        }
        return null;

    }
}

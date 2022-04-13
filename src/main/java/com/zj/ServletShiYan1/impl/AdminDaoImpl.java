package com.zj.ServletShiYan1.impl;

import cn.itcast.jdbc.TxQueryRunner;
import com.zj.ServletShiYan1.dao.AdminDao;
import com.zj.ServletShiYan1.pojo.Admin;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class AdminDaoImpl implements AdminDao {
    private QueryRunner qr = new TxQueryRunner();
    @Override
    public boolean login(String name, String password) throws SQLException {
        String sql = "select * from t_admin where name=? and password=?";
        List<Admin> adminList = qr.query(sql, new BeanListHandler<Admin>(Admin.class), name, password);
        return adminList.size() == 1;
    }
}

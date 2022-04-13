package com.zj.ServletShiYan1.dao;

import java.sql.SQLException;

public interface AdminDao {
    public boolean login(String name, String password) throws SQLException;
}

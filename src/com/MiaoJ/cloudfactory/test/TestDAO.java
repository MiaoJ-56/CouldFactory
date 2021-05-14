package com.MiaoJ.cloudfactory.test;

import com.MiaoJ.cloudfactory.dao.BasicDAO;
import com.MiaoJ.cloudfactory.utils.DruidDemo;

import java.sql.Connection;
import java.sql.SQLException;

public class TestDAO {
    public static void main(String[] args) throws SQLException {
        Connection connection = DruidDemo.getConnection();
        System.out.println(connection);
    }
}

package com.MiaoJ.cloudfactory.dao;

import com.MiaoJ.cloudfactory.utils.DruidDemo;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class BasicDAO<T>{
    private QueryRunner qr = new QueryRunner();

    public int update(String sql, Object... parameters){
        Connection connection = null;
        try {
            connection = DruidDemo.getConnection();
            int update = qr.update(connection,sql,parameters);
            return update;

        } catch (SQLException e) {
//            throwables.printStackTrace();
        throw new RuntimeException(e);
        }finally {
            DruidDemo.close(null,null,connection);
        }
    }

    public List<T> queryMulti(String sql, Class<T> clazz ,Object... parameters){
        Connection connection = null;
        try {
            connection = DruidDemo.getConnection();
            return qr.query(connection,sql,new BeanListHandler<T>(clazz),parameters);

        } catch (SQLException e) {
//            throwables.printStackTrace();
            throw new RuntimeException(e);
        }finally {
            DruidDemo.close(null,null,connection);
        }
    }

    public T querySingle(String sql ,Class<T> clazz, Object... parameters){
        Connection connection = null;
        try {
            connection = DruidDemo.getConnection();
            return qr.query(connection,sql,new BeanHandler<T>(clazz),parameters);

        } catch (SQLException e) {
//            throwables.printStackTrace();
            throw new RuntimeException(e);
        }finally {
            DruidDemo.close(null,null,connection);
        }
    }

    public Object queryScalar(String sql , Object... parameters){
        Connection connection = null;
        try {
            connection = DruidDemo.getConnection();
            return qr.query(connection , sql, new ScalarHandler<>(), parameters);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DruidDemo.close(null,null,connection);
        }
        return null;
    }
}

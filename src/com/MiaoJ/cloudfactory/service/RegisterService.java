package com.MiaoJ.cloudfactory.service;

import com.MiaoJ.cloudfactory.dao.LoginDAO;
import com.MiaoJ.cloudfactory.dao.UserDAO;
import com.MiaoJ.cloudfactory.domain.Login;

import java.util.Date;

public class RegisterService {
    private LoginDAO loginDAO = new LoginDAO();
    private UserDAO userDAO = new UserDAO();

    //注册
    public boolean register(String account, String passwd, String actor,String name, String phone, Date birthday,String factoryName,String factoryIntr){
        boolean flag = true;
        Login login = loginDAO.querySingle("select * from login where account = ?", Login.class, account);
        if(login != null){
            System.out.println("该账号已经存在");
            return false;
        }else {
            loginDAO.update("insert into login values(?,?,?,?)",null, actor, account, passwd);
            Login login1 = loginDAO.querySingle("select * from login where account = ?", Login.class, account);
            userDAO.update("insert into user values(?,?,?,?,?,?,?)",login1.getId(),name,birthday,phone,actor,factoryName,factoryIntr);
        }
        return flag;
    }


}

package com.MiaoJ.cloudfactory.service;

import com.MiaoJ.cloudfactory.dao.LoginDAO;
import com.MiaoJ.cloudfactory.domain.Login;

public class LoginService {
    private LoginDAO loginDAO = new LoginDAO();

    //登录系统
    public Login login(String account, String passwd, String actor){
        return
        loginDAO.querySingle("select * from login where account = ? and passwd = ? and actor = ?",Login.class,account,passwd,actor);
    }


}

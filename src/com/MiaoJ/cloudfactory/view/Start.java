package com.MiaoJ.cloudfactory.view;

import com.MiaoJ.cloudfactory.domain.Login;
import com.MiaoJ.cloudfactory.service.LoginService;
import com.MiaoJ.cloudfactory.service.RegisterService;
import com.MiaoJ.cloudfactory.utils.Utility;

import java.util.Date;

public class Start {
    public static void main(String[] args) {
        new Start().mainView();
    }


    private LoginService loginService = new LoginService();
    private RegisterService registerService = new RegisterService();

    //注册
    public void register(){
        boolean flag = true;
        while (flag){
            System.out.println("1.云工厂管理员");
            System.out.println("2.经销商");
            System.out.println("3.返回上一级");
            System.out.print("请选择注册类型");
            int key = Utility.readInt();

            String account = "";
            String passwd = "";
            String actor = "";
            Login login = null;
            String name = "";
            String phone = "";
            Date birthday = null;
            String factoryName = "";
            String factoryIntr = "";

            switch (key){

                case 1:
                    System.out.print("请输入账号");
                    account = Utility.readString(15);
                    System.out.print("请输入密码");
                    passwd = Utility.readString(15);
                    System.out.print("请输入名字");
                    name = Utility.readString(15);

                    System.out.print("请输入电话号码");
                    phone = Utility.readString(15);
                    //生日

                    System.out.print("请输入公司名称");
                    factoryName = Utility.readString(15);
                    System.out.print("请输入公司简介");
                    factoryIntr = Utility.readString(15);


                    //String account, String passwd, String actor,String name, String phone, Date birthday,String factoryName,String factoryIntr
                    boolean result = registerService.register(account, passwd, "云工厂管理员", name, phone, birthday, factoryName, factoryIntr);
                    if(result){
                        System.out.println(account + "注册成功");
                    }else {
//                        System.out.println("密码输入错误");
                    }
                    break;
                case 2:
                    System.out.print("请输入账号");
                    account = Utility.readString(15);
                    System.out.print("请输入密码");
                    passwd = Utility.readString(15);
                    System.out.print("请输入名字");
                    name = Utility.readString(15);
                    System.out.print("请输入电话号码");
                    phone = Utility.readString(15);
                    //生日

                    //String account, String passwd, String actor,String name, String phone, Date birthday,String factoryName,String factoryIntr
                    boolean result2 = registerService.register(account, passwd, "经销商", name, phone, birthday, factoryName, factoryIntr);
                    if(result2){
                        System.out.println(account + "注册成功");
                    }else {
//                        System.out.println("密码输入错误");
                    }
                    break;
                case 3:
                    flag = false;
                    System.out.println("返回");
                    break;
                default:
                    System.out.println("输入错误，请重输");
                    break;
            }
        }

    }

    //登录
    public void logIn(){
        boolean flag = true;
        while (flag){
            System.out.println("1.超级管理员");
            System.out.println("2.云工厂管理员");
            System.out.println("3.经销商");
            System.out.println("4.返回上一级");
            System.out.print("请选择登录类型");
            int key = Utility.readInt();

            String account = "";
            String passwd = "";
            String actor = "";
            Login login = null;

            switch (key){

                case 1:
                    System.out.print("请输入账号");
                    account = Utility.readString(15);
                    System.out.print("请输入密码");
                    passwd = Utility.readString(15);
                    login = loginService.login(account, passwd, "超级管理员");
                    if(login != null){
                        System.out.println(login.getAccount() + "登录成功");
                        superUserView();
                    }else {
                        System.out.println("密码输入错误");
                    }
                    break;
                case 2:
                    System.out.print("请输入账号");
                    account = Utility.readString(15);
                    System.out.print("请输入密码");
                    passwd = Utility.readString(15);
                    login = loginService.login(account, passwd, "云工厂管理员");
                    if(login != null){
                        System.out.println(login.getAccount() + "登录成功");
                    }else {
                        System.out.println("密码输入错误");
                    }
                    break;
                case 3:
                    System.out.print("请输入账号");
                    account = Utility.readString(15);
                    System.out.print("请输入密码");
                    passwd = Utility.readString(15);
                    login = loginService.login(account, passwd, "经销商");
                    if(login != null){
                        System.out.println(login.getAccount() + "登录成功");
                    }else {
                        System.out.println("密码输入错误");
                    }
                    break;
                case 4:
                    flag = false;
                    System.out.println("返回");
                    break;
                default:
                    System.out.println("输入错误，请重输");
                    break;
            }
        }

    }

    //超级管理员功能
    public void superUserView(){
        boolean flag = true;
        while (flag){

            System.out.println("超级管理员登录成功");
            System.out.println("1.用户管理");
            System.out.println("2.工厂信息");
            System.out.println("3.产品类型管理");
            System.out.println("4.产品信息管理");
            System.out.println("5.设备类型管理");
            System.out.println("6.设备管理");
            System.out.println("7.订单管理");
            System.out.println("9.退出");
            System.out.print("请选择登录类型");
            int key = Utility.readInt();
            switch (key){
                case 1:
                    System.out.println("用户管理");
                    break;
                case 2:
                    System.out.println("工厂信息管理");
                    break;
                case 3:
                    System.out.println("产品类型管理");
                    break;
                case 4:
                    System.out.println("产品信息管理");
                    break;
                case 5:
                    System.out.println("设备类型管理");
                    break;
                case 6:
                    System.out.println("设备管理");
                    break;
                case 7:
                    System.out.println("订单管理");
                    break;
//                case 8:
//                    System.out.println("产品信息管理");
//                    break;
                case 9:
                    System.out.println("退出");
                    flag = false;
                    break;
                default:
                    System.out.println("输入错误，请重输");
                    break;
            }


        }


    }

    //主菜单
    public void mainView(){
        boolean loop = true;
        while (loop){
            System.out.println("============欢迎来到智能制造云平台===============");
            System.out.println("1.注册");
            System.out.println("2.登录");
            System.out.println("3.忘记密码");
            System.out.println("4.退出");
            System.out.print("请选择");
            int key = 0;
            key = Utility.readInt();
            switch (key){
                case 1:
                    System.out.println("注册功能");
                    register();
                    break;
                case 2:
                    System.out.println("登录");
                    logIn();
                    break;
                case 3:
                    System.out.println("忘记密码");
                    break;
                case 4:
                    loop = false;
                    break;
                default:
                    System.out.println("输入错误");
                    break;
            }

        }
        System.out.println("============再见===============");

    }


}

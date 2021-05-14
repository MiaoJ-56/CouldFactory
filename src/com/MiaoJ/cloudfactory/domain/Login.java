package com.MiaoJ.cloudfactory.domain;

public class Login {
    private Integer id;
    private String account;
    private String passwd;
    private String actor;

    public Login(){}

    public Login(Integer id, String account, String passwd, String actor) {
        this.id = id;
        this.account = account;
        this.passwd = passwd;
        this.actor = actor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
}

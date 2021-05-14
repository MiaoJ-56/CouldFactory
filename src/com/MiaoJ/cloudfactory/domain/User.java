package com.MiaoJ.cloudfactory.domain;

import java.util.Date;

public class User {
    private Integer id;
    private String name;
    private Date birthday;
    private String phone;
    private String actor;
    private String factoryName;
    private String factoryIntro;

    public User(){}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"name\":\"")
                .append(name).append('\"');
        sb.append(",\"birthday\":\"")
                .append(birthday).append('\"');
        sb.append(",\"phone\":\"")
                .append(phone).append('\"');
        sb.append(",\"actor\":\"")
                .append(actor).append('\"');
        sb.append(",\"factoryName\":\"")
                .append(factoryName).append('\"');
        sb.append(",\"factoryIntro\":\"")
                .append(factoryIntro).append('\"');
        sb.append('}');
        return sb.toString();
    }

    public User(Integer id, String name, Date birthday, String phone, String actor, String factoryName, String factoryIntro) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.phone = phone;
        this.actor = actor;
        this.factoryName = factoryName;
        this.factoryIntro = factoryIntro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getFactoryIntro() {
        return factoryIntro;
    }

    public void setFactoryIntro(String factoryIntro) {
        this.factoryIntro = factoryIntro;
    }
}

package com.tw.core.entity;

/**
 * Created by ksu on 7/13/15.
 */
public class User {
    private Integer id;
    private String name;
    private String sex;
    private String mail;
    private Integer age;

    public User() {
    }

    public User(Integer id, String name, String sex, String mail, Integer age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.mail = mail;
        this.age = age;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

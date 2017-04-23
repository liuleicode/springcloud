package com.springcloud.feign.model;

/**
 * Created by liulei on 2017/4/22.
 */
public class User {
    Long id;
    Integer age;
    String name;
    String sex;

    public User(Long id, Integer age, String name, String sex) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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
}

package com.example.demo.pojo;

import java.util.Date;

public class User {
    private String name;

    private Date update;

    public User(String name, Date update) {
        this.name = name;
        this.update = update;
    }

    public User() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getUpdate() {
        return update;
    }

    public void setUpdate(Date update) {
        this.update = update;
    }
}
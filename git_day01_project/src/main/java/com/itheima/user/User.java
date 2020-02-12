package com.itheima.user;

public class User {
    private String name;
    private Integer Id;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }
}

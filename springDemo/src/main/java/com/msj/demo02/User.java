package com.msj.demo02;

public class User {
    private int id;
    private String username;
    private UserClass userclass;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UserClass getUserclass() {
        return userclass;
    }

    public void setUserclass(UserClass userclass) {
        this.userclass = userclass;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", userclass=" + userclass +
                '}';
    }
}

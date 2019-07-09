package com.msj.demo01;

public class Hello {
    private int id;
    private String message;

    public void setId(int id) {
        this.id = id;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "id=" + id +
                ", message='" + message + '\'' +
                '}';
    }
}


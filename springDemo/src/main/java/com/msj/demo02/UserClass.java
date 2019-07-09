package com.msj.demo02;

public class UserClass {
    private int cno;

    public int getCno() {
        return cno;
    }

    public void setCno(int cno) {
        this.cno = cno;
    }

    @Override
    public String toString() {
        return "UserClass{" +
                "cno=" + cno +
                '}';
    }
}

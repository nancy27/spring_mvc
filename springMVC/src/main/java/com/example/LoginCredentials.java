package com.example;

public class LoginCredentials {
    private String uname;
    private String pass;
    private long id;

    public LoginCredentials() {
    }

    public LoginCredentials(String uname, String pass) {
        this.uname = uname;
        this.pass = pass;
        this.id=id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}

package com.company;

public class User {
    protected String name;
    protected String username;
    protected String password;
    protected boolean logged_in;

    public User(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }
    protected boolean login(String username, String password){
        this.logged_in = this.username.equals(name) && this.password.equals(password);
        return this.logged_in;
    }
}

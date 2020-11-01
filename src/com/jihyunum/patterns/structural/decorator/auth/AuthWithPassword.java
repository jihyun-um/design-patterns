package com.jihyunum.patterns.structural.decorator.auth;

public class AuthWithPassword implements Auth {
    @Override
    public void login() {
        System.out.println("Logging in with password");
    }
}

package com.jihyunum.patterns.structural.decorator.auth;

public class AuthDecorator implements Auth {
    private Auth auth;

    public AuthDecorator(Auth auth) {
        this.auth = auth;
    }

    @Override
    public void login() {
        auth.login();
    }
}

package com.jihyunum.patterns.structural.decorator.auth;

import java.time.LocalDate;

public class PasswordExpiryDecorator extends AuthDecorator {
    private LocalDate passwordExpiryDate;

    public PasswordExpiryDecorator(Auth auth) {
        super(auth);
    }

    @Override
    public void login() {
        super.login();
        setPasswordExpiryDate(90);
    }

    private void setPasswordExpiryDate(int numberOfDays) {
        passwordExpiryDate = LocalDate.now().plusDays(numberOfDays);
        System.out.println("Your password is set to expire on " + passwordExpiryDate.toString());
    }

}

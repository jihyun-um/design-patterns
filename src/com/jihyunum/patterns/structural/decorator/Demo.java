package com.jihyunum.patterns.structural.decorator;

import com.jihyunum.patterns.structural.decorator.auth.Auth;
import com.jihyunum.patterns.structural.decorator.auth.AuthWithPassword;
import com.jihyunum.patterns.structural.decorator.auth.PasswordExpiryDecorator;
import com.jihyunum.patterns.structural.decorator.auth.TwoFactorDecorator;

public class Demo {
    public static void main(String[] args) {
//        Auth authWithPasswordExpiry = new PasswordExpiryDecorator(new AuthWithPassword());
//        authWithPasswordExpiry.login();
//
//        Auth authWithTwoFactor = new TwoFactorDecorator(new AuthWithPassword());
//        authWithTwoFactor.login();

        Auth auth = new PasswordExpiryDecorator(
                        new TwoFactorDecorator(
                            new AuthWithPassword()
                        ));
        auth.login();
    }
}

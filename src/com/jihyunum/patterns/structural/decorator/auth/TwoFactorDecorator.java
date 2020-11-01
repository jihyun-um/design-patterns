package com.jihyunum.patterns.structural.decorator.auth;

public class TwoFactorDecorator extends AuthDecorator {
    private int tempCode;

    public TwoFactorDecorator(Auth auth) {
        super(auth);
    }

    @Override
    public void login() {
        super.login();
        sendTempCode();
    }

    private void sendTempCode() {
        generateTempCode();
        System.out.println("Sending temporary code " + tempCode + " to secondary device");
    }

    private void generateTempCode() {
        tempCode = 1000 + (int)(Math.random() * 8999);
    }
}

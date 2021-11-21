package com.pb.smolianykova.hw8;

public class WrongLoginException extends Exception {
    private String signInPassword;

    public WrongLoginException(String signInPassword) {
        this.signInPassword = signInPassword;
    }
}

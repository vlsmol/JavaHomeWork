package com.pb.smolianykova.hw8;

public class WrongPasswordException extends Exception {
    private String signUpPassword;

    public WrongPasswordException(String signUpPassword) {
        this.signUpPassword = signUpPassword;
    }
}

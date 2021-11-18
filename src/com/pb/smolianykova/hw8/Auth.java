package com.pb.smolianykova.hw8;
import java.util.Objects;
import java.util.Scanner;

public class Auth {
    private String userLogin, userPassword;

    public Auth() {
    }

    public String getUserLogin() {
        return userLogin;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void signUp (String login, String password, String confirmPassword) {


        this.userLogin = login;
        if (Objects.equals(password, confirmPassword)) {
            System.out.println("Пароль подтвержден.");
            this.userPassword = password;
        } else {
            System.out.println("Пароль не подтвержден.");
            this.userLogin = null;
            System.out.println("Пользователь не создан.");
        }
    }

    public void signIn(String login, String password) {



        if (Objects.equals(login, userLogin) && Objects.equals(password, userPassword)) {
            System.out.println("Доступ разрешен.");
        } else {
            System.out.println("Неверные логин и/или пароль.");
        }
    }
}

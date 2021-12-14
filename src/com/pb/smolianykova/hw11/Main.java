package com.pb.smolianykova.hw11;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ContactBook contactBook = new ContactBook();
        contactBook.add(new Contact("Cмоляникова Владлена Евгеньева", LocalDate.parse("2001-01-27"), "+38005977498", "Дом дома"));
        contactBook.add(new Contact("Чуприн Игорь Викторович", LocalDate.parse("1995-01-27"), "+380664584910", "Город, улица"));
        contactBook.add(new Contact("Сауренко Татьяна Николаевна", LocalDate.parse("1980-05-11"), "+79684285566", "Страна"));
        contactBook.mainMenu();
    }
}

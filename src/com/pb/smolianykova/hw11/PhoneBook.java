package com.pb.smolianykova.hw11;

public static void addAbonent(List<Abonent> pBook, Abonent ab) {
        pBook.add(ab);
        System.out.println("\nАбонент " + ab.getFio() + " добавлен.");
        }

public static void delAbonent(List<Abonent> pBook, Abonent ab) {
        pBook.remove(ab);
        System.out.println("\nАбонент " + ab.getFio() + " удален.");
        }

public static void searchName(List<Abonent> pBook, String name) {
        int i = -1;
        for (Abonent p : pBook) {
        if (Objects.equals(p.getFio(), name)) {
        System.out.println("\nАбонент " + name + " найден. \n" + p + "\n   ***** ");
        i++;
        break;
        }
        }
        if (i == -1) {
        System.out.println("Абонента " + name + " Нет в телефонной книге." + "\n   ***** ");
        }
        }

public static void searchNumber(List<Abonent> pBook, String nr) {
        int i = -1;
        System.out.println("\nНомер " + nr);
        for (Abonent p : pBook) {
        //List<String> phoneNrs
        for (String n : p.getPhoneNrs()) {
//                System.out.println(p.getPhoneNrs());
        if (Objects.equals(n, nr)) {
        System.out.println("найден у абонента " + p.getFio());
        i++;
        }
        }
        }
        if (i == -1) {
        System.out.println("не найден в телефонной книге.\n");
        }
        }

public static void phoneBookPrint(List<Abonent> pBook) {
        System.out.println("\n*** Полные данные абонентов ***");
        for (Abonent p : pBook) {
        System.out.println(p);
        }
        System.out.println("\n   *** ***** ***");
        }

public static void editAbonent(List<Abonent> pBook, String name, String newName) {
        int i = -1;
        for (Abonent p : pBook) {
        if (Objects.equals(p.getFio(), name)) {
        p.setFio(newName);  //phoneBook.get(1).setFio("Чичваркин");
        System.out.println("\nАбоненту " + name + " установлено ФИО  " + newName + "\n   ***** ");
        i++;
        }
        }
        if (i == -1) {
        System.out.println("Абонента " + name + " Нет в телефонной книге. Невозможно отредактировать.");
        }
        }

public static void editAbonentPhone(List<Abonent> pBook, String name, List<String> newNum) {
        int i = -1;
        for (Abonent p : pBook) {
        if (Objects.equals(p.getFio(), name)) {
        p.setPhoneNrs(newNum);  //phoneBook.get(1).setFio("Чичваркин");
        System.out.println("\nАбоненту " + name + " установлен(ы) номера  " + newNum + "\n   ***** ");
        i++;
        }
        }
        if (i == -1) {
        System.out.println("Абонента " + name + " Нет в телефонной книге. Невозможно отредактировать.");
        }
        }

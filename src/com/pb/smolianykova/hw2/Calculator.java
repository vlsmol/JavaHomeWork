package com.pb.smolianykova.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int leftoperand = in.nextInt();
        System.out.println("Введите второе число: ");
        int rightoperand = in.nextInt();
        System.out.println("Введите знак: ");
        String sign = in.next();
        switch (sign) {
            case "/" :
                if (rightoperand == 0) {
                    System.out.println("Кицька Чернушка огорчена и подавлена. На ноль не делим");
                }
                System.out.println("Ваш ответ" + (leftoperand / rightoperand));
                break;
            case "+" :
                System.out.println("Ваш ответ" + (leftoperand + rightoperand));
                break;
            case "-" :
                System.out.println("Ваш ответ" + (leftoperand - rightoperand));
                break;
            case "*" :
                System.out.println("Ваш ответ" + (leftoperand * rightoperand));
                break;
        }
}
}



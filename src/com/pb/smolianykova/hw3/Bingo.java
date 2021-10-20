package com.pb.smolianykova.hw3;

import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        System.out.println("Угадайте задуманное число от 0 до 100");
        System.out.println("Для завершения введите - грустный мявк");

        final int MAX_ATTEMPT = 10;
        int attempt = 0;
        String number = "27";
        Scanner in = new Scanner(System.in);

        while (attempt < MAX_ATTEMPT) {
            attempt++;
            System.out.println("Попытка " + attempt + ":");
            String value = in.next();

            if (value.equals("грустный мявк")) {

                System.out.println("Кыцька грустит, но прощается");
                break;
            }

            if (!value.equals(number)) {
                continue;
            }

            System.out.println("Кыцька довольна, число угадано с " + attempt + "попытки!");
            break;
        }

        System.out.println("Конец игры");
    }
}

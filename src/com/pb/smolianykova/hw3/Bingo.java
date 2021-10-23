package com.pb.smolianykova.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {

    public static void main(String[] args) {
        System.out.println("Угадайте задуманное число от 0 до 100");
        System.out.println("Для завершения введите - 101");
        Scanner in = new Scanner(System.in);

        final int MAX_ATTEMPT = 15;
        int attempt = 0;
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int x = Math.abs(random.nextInt(101));

        while (attempt < MAX_ATTEMPT) {
            attempt++;
            int y;
            y = scan.nextInt();
            System.out.println("Попытка " + attempt + ":");

            if (y > x) {
                System.out.println("Кыцька грустит, число меньше");
            }
            if (y < x) {
                System.out.println("Кыцька грустит, число больше");
            }
            if (y == 101) {
                System.out.println("Кыцька грустит, но прощается");
                break;
            }

            if (y == x) {
                System.out.println("Кыцька довольна, число угадано с " + attempt + "попытки!");
                continue;
            }
        }

        System.out.println("Конец игры");
    }
}

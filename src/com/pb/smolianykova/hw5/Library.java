package com.pb.smolianykova.hw5;

public class Library {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Петров В.В.", 1, "ИФ", "21.10.1999", "+806711111");
        Reader[] readers = {reader1};

        Book book1 = new Book("Приключения", "Иванов И. И.");
        Book book2 = new Book("Словарь", "Сидоров А. В.");
        Book book3 = new Book("Энциклопедия", "Гусев К. В.");
        Book[] books = {book1, book2, book3};

        printReaders(readers);
        printBooks(books);

        reader1.takeBook(3);
        reader1.takeBook("Приключения, Словарь, Энциклопедия");
        reader1.takeBook(book1, book2,book3);

        reader1.returnBook(3);
        reader1.returnBook("Приключения (Иванов И. И. 2000 г.), Словарь (Сидоров А. В 1980 г.), Энциклопедия (Гусев К. В. 2010 г.)\"");
        reader1.returnBook(book1, book2,book3);
    }

    private static void printBooks(Book[] books) {
        System.out.println("Список книг:");
        for (Book book : books) {
            System.out.println(book.getInfo());
        }
        System.out.println();
    }

    private static void printReaders(Reader[] readers) {
        System.out.println("Список читателей:");
        for (Reader reader : readers) {
            System.out.println( reader.getInfo());
        }
        System.out.println();
    }
}

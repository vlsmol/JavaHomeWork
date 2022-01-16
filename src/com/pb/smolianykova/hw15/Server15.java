package com.pb.smolianykova.hw15;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class Server15 {
    public static void main(String[] args) {
        Server15 server = new Server15();
    }
    // список клиентов
    private final ArrayList<ClientHandler15> clients15 = new ArrayList<>();
    int clNr;

    public Server15() {
        Socket clientSocket = null;
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(7777);
            System.out.println("Сервер запущен!");

            while (true) {
                clientSocket = serverSocket.accept();
                clNr++;
                String clName = "№ " + clNr;
                ClientHandler15 client = new ClientHandler15(clientSocket, this, clName, clNr);
                clients15.add(client);
                new Thread(client).start();
                LocalDateTime dateTime = LocalDateTime.now();
                DateTimeFormatter formattedDTime = DateTimeFormatter.ofPattern("dd.MM.yyyy, HH:mm:ss");
                // протокол подключений к серверу разными цетами (255 цветов, далее все клиенты белые)
                System.out.println("\u001B[38;5;" + clNr + "m" + dateTime.format(formattedDTime) +
                        ". В чате новый участник - " + clName + "\u001B[0m");
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        finally {
            try {
                clientSocket.close();
                System.out.println("Сервер остановлен.");
                serverSocket.close();
            }
            catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void sendMessageToAllClients(String msg) {
        for (ClientHandler15 o : clients15) {
            o.sendMsg(msg);
        }

    }

    // удаляем клиента при выходе из чата
    public void removeClient(ClientHandler15 client) {
        clients15.remove(client);
    }
}


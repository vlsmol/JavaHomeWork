package com.pb.smolianykova.hw14;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.util.ArrayList;


public class Server {

    public static void main(String[] args) {
        Server server = new Server();
    }
    // список клиентов
    private final ArrayList<ClientHandler> clients = new ArrayList<>();
    int clNr;

    public Server() {
        Socket clientSocket = null;
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(7777);
            System.out.println("Сервер запущен!");

            while (true) {
                clientSocket = serverSocket.accept();
                clNr++;
                String clName = "№ " + clNr;
                ClientHandler client = new ClientHandler(clientSocket, this, clName);
                clients.add(client);
                new Thread(client).start();
                System.out.println(LocalDateTime.now() + ". В чате новый клиент участник - " + clName);
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
        for (ClientHandler o : clients) {
            o.sendMsg(msg);
        }

    }

    // удаляем клиента при выходе из чата
    public void removeClient(ClientHandler client) {
        clients.remove(client);
    }
}

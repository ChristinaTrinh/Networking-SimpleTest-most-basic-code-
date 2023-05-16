package Server;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException{
        int port = 8000;
        ServerSocket server = new ServerSocket(port);
        System.out.println("SimpleTesterServer waiting on client");
        Socket clientSocket = server.accept();
        System.out.println("Client connected to server");
        Scanner in = new Scanner(clientSocket.getInputStream());
        
        while (true){
            System.out.println(in.nextLine());
        }
    }
}

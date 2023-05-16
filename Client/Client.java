package Client;
import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Client{
    public static void main(String[] args) throws IOException{
        int port = 8000;
        String host = "localhost";
        System.out.println("Client attempting to connect to server");
        Socket serverSocket = new Socket(host,port);
        System.out.println("Connected to host at port "+port);
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(serverSocket.getOutputStream());
        
        while (true){
            out.println(in.nextLine());
            out.flush();
        }
    }
}

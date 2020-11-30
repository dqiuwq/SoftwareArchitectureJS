package session12;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class SocServer {
    public static void main(String[] args) throws IOException {
        Socket socket = null;
        Scanner kb = new Scanner(System.in);
        // user server socket to listen for connection requests
        ServerSocket serverSocket = new ServerSocket(8080); // avoid known ports 0-1023
        System.out.println("Waiting for client to connect...");
        socket = serverSocket.accept(); // this will be in blocked state
        // connection is established
        // setup the input/output for passing data
        PrintWriter writer =
                new PrintWriter(socket.getOutputStream(), true);
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(socket.getInputStream()));
        // go into loop to read and write
        while (true) {
            String inMessage = reader.readLine();
            System.out.println(inMessage);
            System.out.println("Message to the client: ");
            String outMessage = kb.nextLine();
            if (outMessage.length() == 0) {
                break;
            }
            writer.println(outMessage);
        }
        serverSocket.close();
        socket.close();
    }
}

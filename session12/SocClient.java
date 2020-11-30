package session12;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class SocClient {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        try {
            InetAddress addr = InetAddress.getByName("localhost"); // domain name
            Socket socket = new Socket(addr, 8080);
            // connection is established
            // setup the input/output for passing data
            PrintWriter writer =
                    new PrintWriter(socket.getOutputStream(), true);
            BufferedReader reader =
                    new BufferedReader(
                            new InputStreamReader(socket.getInputStream()));
            writer.println("First message from client to server");
            // go into loop to read and write
            while (true) {
                String inMessage = reader.readLine();
                System.out.println(inMessage);
                System.out.println("Message to the server: ");
                String outMessage = kb.nextLine();
                if (outMessage.length() == 0) {
                    break;
                }
                writer.println(outMessage);
            }
            socket.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(6666);
            Socket socket = serverSocket.accept();
            DataInputStream datainputStream = new DataInputStream(socket.getInputStream());
            String aString = (String) datainputStream.readUTF();
            System.out.println("Received: " + aString);
            serverSocket.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
import java.io.*;
import java.net.*;

public class TServe implements Runnable {

    public void run() {
        try {
            System.out.println("Waiting on a client to connect...");

            ServerSocket serverSocket = new ServerSocket(6666);
            Socket socket = serverSocket.accept();
            DataInputStream datainputStream = new DataInputStream(socket.getInputStream());

            String aString = "";

            while (!aString.equals("quit")) {
                aString = (String) datainputStream.readUTF();
                System.out.println("Received: " + aString);

                if (aString.equals("quit")) {
                    break;
                }
            }

            System.out.println("Closing the connection...");

            serverSocket.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
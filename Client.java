import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 6666);
            DataOutputStream dataoutputStream = new DataOutputStream(socket.getOutputStream());
            dataoutputStream.writeUTF("Client says hello!");
            dataoutputStream.flush();
            dataoutputStream.close();
            socket.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
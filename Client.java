import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
		String message = "";

        try {
            Socket socket = new Socket("localhost", 6666);
            DataOutputStream dataoutputStream = new DataOutputStream(socket.getOutputStream());

            while (!message.equals("quit")) {

                System.out.println("Enter a message: ");
                System.out.println("Type \'quit\' to close the connection");

                message = scanner.nextLine();

                dataoutputStream.writeUTF(message);

                System.out.println("\"" + message + "\"" + " was sent to the server");
    
                if (message.contentEquals("quit")) {
                    break;
                }
            }

            System.out.println("Closing the connection...");

            scanner.close();
            dataoutputStream.flush();
            dataoutputStream.close();
            socket.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
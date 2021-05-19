public class Server {
    public static void main(String[] args) {

        ServerConnection serve1 = new ServerConnection();

        Thread thread = new Thread(serve1);
        thread.start();
    }

}

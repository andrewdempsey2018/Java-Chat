public class Manager {
    public static void main(String[] args) {

        TServe serve1 = new TServe();

        Thread thread = new Thread(serve1);
        thread.start();
    }

}

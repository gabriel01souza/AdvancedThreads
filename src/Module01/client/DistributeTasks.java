package Module01.client;

import java.net.Socket;

public class DistributeTasks implements Runnable {
    private final Socket socket;

    public DistributeTasks(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        System.out.println("Distributing tasks");
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

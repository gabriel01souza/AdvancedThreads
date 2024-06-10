package Module02.client;

import java.net.Socket;
import java.util.Scanner;

public class DistributeTasks implements Runnable {
    private final Socket socket;

    public DistributeTasks(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            System.out.println("Distributing tasks");
            Scanner scanner = new Scanner(socket.getInputStream());

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            scanner.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

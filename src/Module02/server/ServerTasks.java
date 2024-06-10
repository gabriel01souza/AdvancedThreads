package Module02.server;

import Module02.client.DistributeTasks;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerTasks {

    public static void main(String[] args) throws Exception {

        System.out.println(" --- Starting server --- ");
        ServerSocket server = new ServerSocket(9091);

        // With this class, I can define a limit of threads that my JVM'll use
        // And now I have a limit of threads available
        ExecutorService executor = Executors.newFixedThreadPool(5);

        while (true) {
            // the accept method makes our socket available to receive a connection
            Socket socket = server.accept();
            DistributeTasks distributeTasks = new DistributeTasks(socket);
            executor.execute(distributeTasks);

            System.out.println(" -- Accepting new client at the port -> " + socket.getPort());
        }
    }
}

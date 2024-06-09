package Module01.server;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerTasks {

    public static void main(String[] args) throws Exception {

        System.out.println(" --- Starting server --- ");
        ServerSocket server = new ServerSocket(9091);

        while (true) {

            // the accept method makes our socket available to receive a connection
            Socket socket = server.accept();

            System.out.println(" -- Accepting new client at the port -> " + socket.getPort());
        }
    }
}

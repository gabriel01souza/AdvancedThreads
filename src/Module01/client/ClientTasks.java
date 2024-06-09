package Module01.client;

import java.net.Socket;

public class ClientTasks {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 9091);
        System.out.println(" --- Connection established --- ");

        DistributeTasks distribuirTarefas = new DistributeTasks(socket);
        Thread clientThread = new Thread(distribuirTarefas);
        clientThread.start();

        socket.close();
    }
}

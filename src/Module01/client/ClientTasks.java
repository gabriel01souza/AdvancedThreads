package Module01.client;

import java.net.Socket;
import java.util.Scanner;

public class ClientTasks {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 9091);
        System.out.println(" --- Connection established --- ");

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        scanner.close();
        socket.close();
    }
}

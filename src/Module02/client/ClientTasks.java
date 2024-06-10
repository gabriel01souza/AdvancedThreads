package Module02.client;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientTasks {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 9091);
        System.out.println(" --- Connection established --- ");

        PrintStream printStream = new PrintStream(socket.getOutputStream());
        // c1 = command
        printStream.println("c1");

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        printStream.close();
        scanner.close();
        socket.close();
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketClient {
    private static final String HOST = "localhost";
    private static final int PORT = 6000;

    public static void main(String[] args) {
        try (Socket sock = new Socket(HOST, PORT);
             PrintWriter out = new PrintWriter(sock.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(sock.getInputStream()))) {

            String msg = "Greetings from client";
            out.println(msg);
            System.out.println("Client sent: " + msg);
            System.out.println("Server replied: " + in.readLine());

        } catch (IOException e) {
            System.out.println("Client error: " + e.getMessage());
        }
    }
}

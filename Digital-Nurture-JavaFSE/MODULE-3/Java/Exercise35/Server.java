import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
    private static final int PORT = 6000;

    public static void main(String[] args) {
        System.out.println("Server listening on port " + PORT);
        try (ServerSocket ss = new ServerSocket(PORT);
             Socket cs = ss.accept();
             BufferedReader in = new BufferedReader(new InputStreamReader(cs.getInputStream()));
             PrintWriter out = new PrintWriter(cs.getOutputStream(), true)) {

            System.out.println("Client connected");
            String msg = in.readLine();
            System.out.println("Received: " + msg);
            out.println("Hello from server");

        } catch (IOException e) {
            System.out.println("Server error: " + e.getMessage());
        }
    }
}

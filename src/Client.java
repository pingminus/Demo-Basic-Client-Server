import java.io.BufferedReader; 
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        final String SERVER_IP = "127.0.0.1"; // Localhost (this machine)
        final int SERVER_PORT = 1234;         // Must match the server port

        try (Socket socket = new Socket(SERVER_IP, SERVER_PORT)) {
            System.out.println("Connected to the server!");

            // Set up input and output streams
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Send message to the server
            String messageToSend = "Hello, Server!";
            out.println(messageToSend);
            System.out.println("Sent to server: " + messageToSend);

            // Read the response from the server
            String responseFromServer = in.readLine();
            System.out.println("Received from server: " + responseFromServer);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
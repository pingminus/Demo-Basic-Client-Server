import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        final int PORT = 1234; // The port the server will listen on
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server is listening on port " + PORT);
            
            // Accept client connection
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected!");

            // Set up input and output streams
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            // Read message from client
            String messageFromClient = in.readLine();
            System.out.println("Received from client: " + messageFromClient);

            // Respond to client
            out.println("Hello Client! You sent: " + messageFromClient);

            // Close the connection
            clientSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
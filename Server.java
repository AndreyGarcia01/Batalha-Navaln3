import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private char[][] tabuleiro;
    private ObjectOutputStream jogadorOutput;
    private ObjectInputStream jogadorInput;


    public void iniciar(int porta) {
        try (ServerSocket serverSocket = new ServerSocket(porta)) {
            System.out.println("Servidor aguardando conexões na porta " + porta + "...");

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Nova conexão estabelecida.");

                jogadorOutput = new ObjectOutputStream(socket.getOutputStream());
                jogadorInput = new ObjectInputStream(socket.getInputStream());

                JogoSimples();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        Server server = new Server();
        server.iniciar(8080);
    }
}
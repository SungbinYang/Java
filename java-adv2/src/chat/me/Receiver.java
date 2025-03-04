package chat.me;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

import static util.MyLogger.log;

public class Receiver implements Runnable {

    private final Socket socket;

    private final DataInputStream input;

    private final User user;

    private boolean closed = false;

    public Receiver(Socket socket, User user) throws IOException {
        this.socket = socket;
        this.user = user;
        this.input = new DataInputStream(socket.getInputStream());
    }

    @Override
    public void run() {
        log("receiver start");

        try {
            while (true) {
                String received = input.readUTF();

                if (received.startsWith("/exit")) {
                    break;
                }

                log(received);
            }
        } catch (IOException e) {
            log(e);
        } finally {
            System.out.println("receiver end");
            close();
        }
    }

    private void close() {
        if (closed) {
            return;
        }

        closed = true;

        try {
            socket.close();
        } catch (IOException e) {
            log(e);
        }
    }
}

package chat.me;

import java.io.IOException;
import java.net.Socket;

import static util.MyLogger.log;

public class Client {

    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {
        log("클라이언트 시작");
        Socket socket = null;
        User user = new User();

        try {
            socket = new Socket("localhost", PORT);
            log("소켓 연결: " + socket);

            Thread receiver = new Thread(new Receiver(socket, user));
            Thread sender = new Thread(new Sender(socket, user));

            receiver.start();
            sender.start();
        } catch (IOException e) {
            log(e);
        }
    }
}

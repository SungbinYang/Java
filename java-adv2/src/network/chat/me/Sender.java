package network.chat.me;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import static util.MyLogger.log;

public class Sender implements Runnable {

    private final Socket socket;

    private final DataOutputStream output;

    private final User user;

    private boolean closed = false;

    public Sender(Socket socket, User user) throws IOException {
        this.socket = socket;
        this.user = user;
        this.output = new DataOutputStream(socket.getOutputStream());
    }

    @Override
    public void run() {
        log("sender start");

        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                System.out.print("명령어를 입력하세요: ");
                String command = scanner.nextLine();

                if (command.isEmpty()) {
                    continue;
                }

                if (command.startsWith("/exit")) {
                    break;
                }

                output.writeUTF(command);
            }
        } catch (IOException e) {
            log(e);
        } finally {
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

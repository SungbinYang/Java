package network.chat.me;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import static network.tcp.SocketCloseUtil.closeAll;
import static util.MyLogger.log;

public class Session implements Runnable {

    private final Socket socket;

    private final DataInputStream input;

    private final DataOutputStream output;

    private final SessionManager sessionManager;

    private User user = new User();

    private boolean closed = false;

    public Session(Socket socket, SessionManager sessionManager) throws IOException {
        this.socket = socket;
        this.input = new DataInputStream(socket.getInputStream());
        this.output = new DataOutputStream(socket.getOutputStream());
        this.sessionManager = sessionManager;
        this.sessionManager.add(this);
    }

    public User getUser() {
        return user;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String received = input.readUTF();

                if (received.startsWith("/join")) {
                    String username = received.split("/")[1].split("\\|")[1];
                    String message = username + "님이 입장하셨습니다.";
                    user.setName(username);
                    log(message);
                    sessionManager.sendAll(message);
                }

                if (received.startsWith("/message")) {
                    String message = received.split("/")[1].split("\\|")[1];
                    log(message);
                    sessionManager.sendAll(message);
                }

                if (received.startsWith("/change")) {
                    String changeUsername = received.split("/")[1].split("\\|")[1];
                    sessionManager.sendAll(user.getName() + "님의 이름이 " + changeUsername + "으로 변경되었습니다.");
                    user.setName(changeUsername);
                }

                if (received.startsWith("/users")) {
                    sessionManager.getAllUsername().forEach(username -> {
                        log(username);
                        sessionManager.sendAll(username);
                    });
                }

                if (received.startsWith("/exit")) {
                    throw new IOException("exit");
                }
            }
        } catch (IOException e) {
            log(e);
        } finally {
            sessionManager.remove(this);
            sessionManager.sendAll(user.getName() + "님이 퇴장하였습니다.");
            close();
        }
    }

    public synchronized void close() {
        if (closed) {
            return;
        }

        closeAll(socket, input, output);
        closed = true;
        log("연결 종료: " + socket);
    }

    public synchronized void send(String message) {
        try {
            output.writeUTF(message);
        } catch (IOException e) {
            log(e);
        }
    }
}

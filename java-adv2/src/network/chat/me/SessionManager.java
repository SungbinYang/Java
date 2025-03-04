package network.chat.me;

import java.util.ArrayList;
import java.util.List;

public class SessionManager {

    private List<Session> sessions = new ArrayList<>();

    public synchronized void add(Session session) {
        sessions.add(session);
    }

    public synchronized void remove(Session session) {
        sessions.remove(session);
    }

    public synchronized void closeAll() {
        for (Session session : sessions) {
            session.close();
        }

        sessions.clear();
    }

    public synchronized void sendAll(String message) {
        for (Session session : sessions) {
            session.send(message);
        }
    }

    public synchronized List<String> getAllUsername() {
        List<String> usernames = new ArrayList<>();
        for (Session session : sessions) {
            usernames.add(session.getUser().getName());
        }

        return usernames;
    }
}

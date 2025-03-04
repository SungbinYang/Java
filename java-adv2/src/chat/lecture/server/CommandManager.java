package chat.lecture.server;

import java.io.IOException;

@FunctionalInterface
public interface CommandManager {
    void execute(String totalMessage, Session session) throws IOException;
}

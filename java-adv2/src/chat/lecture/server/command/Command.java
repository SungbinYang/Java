package chat.lecture.server.command;

import chat.lecture.server.Session;

import java.io.IOException;

@FunctionalInterface
public interface Command {
    void execute(String[] args, Session session) throws IOException;
}

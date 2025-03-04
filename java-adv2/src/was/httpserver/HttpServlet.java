package was.httpserver;

import java.io.IOException;

@FunctionalInterface
public interface HttpServlet {
    void service(HttpRequest request, HttpResponse response) throws IOException;
}

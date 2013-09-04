package k717.orders;

import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import javax.ws.rs.ext.RuntimeDelegate;
import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * @author Sergey Mischenko
 * @since 04.09.13
 */
public class Main {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        HttpHandler handler = RuntimeDelegate.getInstance().createEndpoint(new MyApplication(), HttpHandler.class);
        server.createContext("/", handler);
        server.start();
    }
}

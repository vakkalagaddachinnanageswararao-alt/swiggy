package com.swiggy;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class SwiggyApp {

    public static void main(String[] args) throws Exception {

        HttpServer server = HttpServer.create(new InetSocketAddress(9090), 0);

        server.createContext("/", (HttpExchange exchange) -> {
            String response = """
                    <html>
                    <head><title>Swiggy App</title></head>
                    <body>
                        <h1>Welcome to Swiggy</h1>
                        <h3>Menu</h3>
                        <ul>
                            <li>1. Chicken Biryani - ₹250</li>
                            <li>2. Veg Fried Rice - ₹150</li>
                            <li>3. Pizza - ₹300</li>
                            <li>4. Burger - ₹120</li>
                        </ul>
                        <h3>Order Placed Successfully!</h3>
                    </body>
                    </html>
                    """;

            exchange.sendResponseHeaders(200, response.length());
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        });

        server.setExecutor(null);
        server.start();
        System.out.println("Swiggy Application Running on Port 9090");
    }
}

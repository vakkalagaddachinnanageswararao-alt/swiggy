package com.swiggy;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class SwiggyApp {

    public static void main(String[] args) throws Exception {

        HttpServer server = HttpServer.create(new InetSocketAddress(9090), 0);

        // Home Page
        server.createContext("/", (HttpExchange exchange) -> {
            String response = """
                    <html>
                    <head>
                        <title>Swiggy App</title>
                    </head>
                    <body>
                        <h1>Welcome to Swiggy</h1>
                        <h2>Menu</h2>
                        <ul>
                            <li>Chicken Biryani - ₹250 <a href="/order?item=Biryani">Order</a></li>
                            <li>Pizza - ₹300 <a href="/order?item=Pizza">Order</a></li>
                            <li>Burger - ₹120 <a href="/order?item=Burger">Order</a></li>
                        </ul>
                    </body>
                    </html>
                    """;

            exchange.sendResponseHeaders(200, response.length());
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        });

        // Order Page
        server.createContext("/order", (HttpExchange exchange) -> {
            String query = exchange.getRequestURI().getQuery();
            String item = "Item";

            if (query != null && query.startsWith("item=")) {
                item = query.substring(5);
            }

            String response = """
                    <html>
                    <body>
                        <h1>Order Successful!</h1>
                        <p>You ordered: """ + item + """</p>
                        <a href="/">Go Back</a>
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

        System.out.println("Swiggy Web App running on port 9090");
    }
}

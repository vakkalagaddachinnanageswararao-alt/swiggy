package com.swiggy;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class SwiggyServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Swiggy Food Menu</title>");

        out.println("<style>");
        out.println("body {");
        out.println("font-family: Arial;");
        out.println("background-color:#f8f8f8;");
        out.println("text-align:center;");
        out.println("}");

        out.println("h1 {");
        out.println("color:white;");
        out.println("background-color:#fc8019;");
        out.println("padding:20px;");
        out.println("}");

        out.println(".menu {");
        out.println("background:white;");
        out.println("width:350px;");
        out.println("margin:auto;");
        out.println("padding:20px;");
        out.println("border-radius:10px;");
        out.println("box-shadow:0 0 10px gray;");
        out.println("}");

        out.println("li {");
        out.println("font-size:18px;");
        out.println("color:#333;");
        out.println("padding:8px;");
        out.println("}");

        out.println("</style>");
        out.println("</head>");

        out.println("<body>");

        out.println("<h1>Welcome to Mango Sai Swiggy Server</h1>");

        out.println("<div class='menu'>");
        out.println("<h2 style='color:#fc8019'>Food Menu</h2>");

        out.println("<ul style='list-style:none;'>");
        out.println("<li>🍕 Pizza - ₹199</li>");
        out.println("<li>🍔 Burger - ₹149</li>");
        out.println("<li>🍗 Chicken Biryani - ₹249</li>");
        out.println("<li>🥗 Veg Biryani - ₹199</li>");
        out.println("<li>🍜 Noodles - ₹159</li>");
        out.println("<li>🍚 Fried Rice - ₹179</li>");
        out.println("<li>🌯 Chicken Roll - ₹129</li>");
        out.println("<li>🧀 Paneer Butter Masala - ₹229</li>");
        out.println("<li>🥤 Cold Drink - ₹50</li>");
        out.println("<li>🍨 Ice Cream - ₹80</li>");
        out.println("</ul>");

        out.println("</div>");

        out.println("</body>");
        out.println("</html>");
    }
}

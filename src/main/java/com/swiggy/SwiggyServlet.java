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

        out.println("<html><body>");
        out.println("<h1>Welcome to Swiggy App</h1>");
        out.println("<h3>Menu</h3>");
        out.println("<ul>");
        out.println("<li>Pizza - ₹199</li>");
        out.println("<li>Burger - ₹149</li>");
        out.println("<li>Biryani - ₹249</li>");
        out.println("</ul>");
        out.println("</body></html>");
    }
}

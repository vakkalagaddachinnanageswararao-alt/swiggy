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
        out.println("<h1>Welcome to Mango Sai Server</h1>");
        out.println("<h2>Swiggy Food Menu</h2>");
        out.println("<ul>");
        out.println("<li>Pizza - ₹199</li>");
        out.println("<li>Burger - ₹149</li>");
        out.println("<li>Chicken Biryani - ₹249</li>");
        out.println("<li>Veg Biryani - ₹199</li>");
        out.println("<li>Fried Rice - ₹179</li>");
        out.println("<li>Noodles - ₹159</li>");
        out.println("<li>Chicken Roll - ₹129</li>");
        out.println("<li>Paneer Butter Masala - ₹229</li>");
        out.println("<li>Butter Naan - ₹40</li>");
        out.println("<li>Cold Drink - ₹50</li>");
        out.println("<li>Ice Cream - ₹80</li>");
        out.println("</ul>");
        out.println("</body></html>");
    }
}

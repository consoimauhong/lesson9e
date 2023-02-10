package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", value = "/convert")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ProductDescription = request.getParameter("ProductDescription");
        float DiscountPercent = Float.parseFloat(request.getParameter("DiscountPercent"));
        float ListPrice = Float.parseFloat(request.getParameter("ListPrice"));

        Double Amount =
                DiscountPercent * 0.01 ;
        Double Pricediscount = Amount * ListPrice;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<p>AmountDiscount: " + Amount+ "</p>");
        writer.println("<p>ListPrice: " +Pricediscount + "</p>");
        writer.println("</html>");
    }
}

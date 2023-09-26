package com.example.ss10_ex2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "calculatorServlet", value = "/calculate")

public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int firstOperand = Integer.parseInt(req.getParameter("firstOperand"));
        int secondOperand = Integer.parseInt(req.getParameter("secondOperand"));



        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<html>");

        printWriter.println("<h1>Product Name: " + productName + "</h1>");
        printWriter.println("<h1>Discount Amount: " + result + "</h1>");
        printWriter.println("<h1>Discount Price: " + discountPrice + "</h1>");

        printWriter.println("</html>");

    }
}



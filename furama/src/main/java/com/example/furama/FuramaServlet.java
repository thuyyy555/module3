package com.example.furama;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@WebServlet(name = "FuramaServlet", value = "")
public class FuramaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
//            case "showCreateForm":
//                showCreateForm(request, response);
//                break;
            default:
                display(request, response);
        }

    }

//    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
//        RequestDispatcher requestDispatcher
//                = request.getRequestDispatcher("create.jsp");
//        try {
//            requestDispatcher.forward(request, response);
//        } catch (ServletException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    private void display(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setAttribute("list", iProductService.findAll());
//        RequestDispatcher requestDispatcher
//                = request.getRequestDispatcher("index.jsp");
//        requestDispatcher.forward(request, response);
        try {
            response.sendRedirect("index.jsp");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
//                create(request,response);
                break;
            case "delete":
//                delete(request,response);
                break;
            default:
//                showList(request, response);
        }
    }
}
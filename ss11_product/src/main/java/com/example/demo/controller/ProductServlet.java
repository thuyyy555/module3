package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.IProductService;
import com.example.demo.service.ProductService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/product-servlet")
public class ProductServlet extends HttpServlet {
    private IProductService iProductService = new ProductService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null) {
            action = "";
        }
        switch (action){
            case "showCreateForm":
                showCreateForm(request,response);
                break;
            default:
                showList(request, response);
        }

    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher
                = request.getRequestDispatcher("create.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("list",iProductService.findAll());
        RequestDispatcher requestDispatcher
                = request.getRequestDispatcher("index.jsp");
        requestDispatcher.forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null) {
            action = "";
        }
        switch (action){
            case "create":
//                create(request,response);
                break;
        }
    }

//    private void create(HttpServletRequest request, HttpServletResponse response) {
//        int id = Integer.parseInt(request.getParameter("id"));
//        String name = request.getParameter("name");
//        boolean gender = "male".equals(request.getParameter("gender"));
//        double point = Double.parseDouble(request.getParameter("point"));
//        Student student = new Student(id,name,gender,point);
//        iStudentService.save(student);
//        try {
//            response.sendRedirect("/student-servlet");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}

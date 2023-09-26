package com.example.thuchanh.controller;


import com.example.thuchanh.model.Category;
import com.example.thuchanh.model.Product;
import com.example.thuchanh.service.CategoryService;
import com.example.thuchanh.service.ICategoryService;
import com.example.thuchanh.service.IProductService;
import com.example.thuchanh.service.ProductService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "HomeServlet", value = "")
public class HomeServlet extends HttpServlet {
    private IProductService iProductService = new ProductService();
    private ICategoryService iCategoryService = new CategoryService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if(action == null){
            action ="";
        }
        switch (action){
            case "showFormCreate":
                showFormCreate(request,response);
                break;
            case "showFormDelete":
                showFormDelete(request,response);
                break;
            case "showFormUpdate":
                showFormUpdate(request,response);
                break;
            default:
                display(request, response);
        }
    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
        List<Category> list = iCategoryService.displayCategory();
        request.setAttribute("listCategory",list);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("create.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void showFormDelete(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        iProductService.delete(id);
        try {
            response.sendRedirect("/");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormUpdate(HttpServletRequest request, HttpServletResponse response) {
        List<Category> list = iCategoryService.displayCategory();
        request.setAttribute("listCategory",list);
        int id = Integer.parseInt(request.getParameter("id"));
        request.setAttribute("id", id);
        Product product = iProductService.findProductById(id);
        request.setAttribute("product", product);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("update.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void display(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> list = iProductService.displayProduct();
        request.setAttribute("list",list);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if(action == null){
            action ="";
        }
        switch (action){
            case "create":
                create(request,response);
                break;
//            case "delete":
//                delete(request,response);
//                break;
            case "update":
                update(request,response);
                break;
            default:
                display(request, response);
        }
    }

    private void create(HttpServletRequest request, HttpServletResponse response) {
        String tenSP = request.getParameter("ten_sp");
        Double gia = Double.parseDouble(request.getParameter("gia"));
        int soLuong = Integer.parseInt(request.getParameter("so_luong"));
        String mauSac = request.getParameter("mau_sac");
        String moTa = request.getParameter("mo_ta");
        String danhMuc = request.getParameter("danh_muc");
        Product product = new Product(tenSP, gia, soLuong, mauSac, moTa, danhMuc);
        iProductService.save(product, danhMuc);
        try {
            response.sendRedirect("/");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//    private void delete(HttpServletRequest request, HttpServletResponse response) {
//        int id = Integer.parseInt(request.getParameter("did"));
//        iProductService.delete(id);
//        try {
//            response.sendRedirect("/");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
    private void update(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String tenSP = request.getParameter("ten_sp");
        Double gia = Double.parseDouble(request.getParameter("gia"));
        int soLuong = Integer.parseInt(request.getParameter("so_luong"));
        String mauSac = request.getParameter("mau_sac");
        String moTa = request.getParameter("mo_ta");
        String danhMuc = request.getParameter("danh_muc");
        iProductService.update(tenSP, gia, soLuong, mauSac, moTa, danhMuc, id);
        try {
            response.sendRedirect("/");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



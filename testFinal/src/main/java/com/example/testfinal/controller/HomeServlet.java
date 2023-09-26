package com.example.testfinal.controller;


import com.example.testfinal.model.MatBang;
import com.example.testfinal.service.IMatBangService;
import com.example.testfinal.service.MatBangService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@WebServlet(name = "HomeServlet", value = "")
public class HomeServlet extends HttpServlet {
    private IMatBangService iMatBangService = new MatBangService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if(action == null){
            action ="";
        }
        switch (action){
//            case "display":
//                display(request,response);
//                break;
//            case "showFormDelete":
//                showFormDelete(request,response);
//                break;
//            case "showFormUpdate":
//                showFormUpdate(request,response);
//                break;
            default:
                showFormCreate(request, response);
        }

    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
//        List<MatBang> list = iMatBangService.displayMatBang();
//        request.setAttribute("list",list);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void showFormDelete(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        iMatBangService.delete(id);
        List<MatBang> list = iMatBangService.displayMatBang();
        request.setAttribute("list",list);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("display.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    private void showFormUpdate(HttpServletRequest request, HttpServletResponse response) {
//        List<Category> list = iCategoryService.displayCategory();
//        request.setAttribute("listCategory",list);
//        int id = Integer.parseInt(request.getParameter("id"));
//        request.setAttribute("id", id);
//        Product product = iProductService.findProductById(id);
//        request.setAttribute("product", product);
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("update.jsp");
//        try {
//            requestDispatcher.forward(request,response);
//        } catch (ServletException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    private void display(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<MatBang> list = iMatBangService.displayMatBang();
        request.setAttribute("list",list);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/display.jsp");
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
//            case "create":
//                create(request,response);
//                break;
//            case "delete":
//                delete(request,response);
//                break;
//            case "update":
//                update(request,response);
//                break;
            case "showFormDelete":
                showFormDelete(request,response);
                break;
            default:
                create(request, response);
        }
    }

    private void create(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        Double dienTich = Double.parseDouble(request.getParameter("dien_tich"));
        String trangThai = request.getParameter("trang_thai");
        int tang = Integer.parseInt(request.getParameter("tang"));
        String loaiVp = request.getParameter("loai_vp");
        String moTa = request.getParameter("mo_ta");
        Double gia = Double.parseDouble(request.getParameter("gia"));
        String ngayBd = request.getParameter("ngay_bd");
        String ngayKt = request.getParameter("ngay_kt");
        MatBang matBang = new MatBang(id, dienTich, trangThai, tang, loaiVp, moTa, gia, ngayBd, ngayKt);
        iMatBangService.save(matBang);
        List<MatBang> list = iMatBangService.displayMatBang();
        request.setAttribute("list",list);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("display.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
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
//    private void update(HttpServletRequest request, HttpServletResponse response) {
//        int id = Integer.parseInt(request.getParameter("id"));
//        String tenSP = request.getParameter("ten_sp");
//        Double gia = Double.parseDouble(request.getParameter("gia"));
//        int soLuong = Integer.parseInt(request.getParameter("so_luong"));
//        String mauSac = request.getParameter("mau_sac");
//        String moTa = request.getParameter("mo_ta");
//        String danhMuc = request.getParameter("danh_muc");
//        iProductService.update(tenSP, gia, soLuong, mauSac, moTa, danhMuc, id);
//        try {
//            response.sendRedirect("/");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }




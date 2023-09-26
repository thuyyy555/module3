package com.example.library.controller;

import com.example.library.model.HocSinh;
import com.example.library.model.Sach;
import com.example.library.service.*;

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
    private ISachService iSachService = new SachService();
    private ITheMuonSachService iTheMuonSachService = new TheMuonSachService();
    private IHocSinhService iHocSinhService = new HocSinhService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if(action == null){
            action ="";
        }
        switch (action){
            case "showFormBorrow":
                showFormBorrow(request,response);
                break;
//            case "showFormDelete":
//                showFormDelete(request,response);
//                break;
//            case "showFormUpdate":
//                showFormUpdate(request,response);
//                break;
            default:
                displayBook(request, response);
        }

    }

    private void showFormBorrow(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("muonsach.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//    private void showFormDelete(HttpServletRequest request, HttpServletResponse response) {
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("delete.jsp");
//        try {
//            requestDispatcher.forward(request,response);
//        } catch (ServletException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

//    private void showFormUpdate(HttpServletRequest request, HttpServletResponse response) {
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("update.jsp");
//        try {
//            requestDispatcher.forward(request,response);
//        } catch (ServletException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    private void displayBook(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Sach> listSach = iSachService.displayBook();
        request.setAttribute("listSach",listSach);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/home.jsp");
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
            default:
                displayBook(request, response);
        }
    }

//    private void create(HttpServletRequest request, HttpServletResponse response) {
//        String name = request.getParameter("name");
//        boolean gender = request.getParameter("gender").equals("male");
//        double point = Double.parseDouble(request.getParameter("point"));
//        Student student = new Student(name,gender,point);
//        iStudentService.save(student);
//        try {
//            response.sendRedirect("/");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//    private void delete(HttpServletRequest request, HttpServletResponse response) {
//        int id = Integer.parseInt(request.getParameter("id"));
//        if(iStudentService.findId(id)){
//            iStudentService.delete(id);
//        }else{
//
//        }
//
//        try {
//            response.sendRedirect("/");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//    private void update(HttpServletRequest request, HttpServletResponse response) {
//        int id_update = Integer.parseInt(request.getParameter("id_update"));
//        String name = request.getParameter("name");
//        boolean gender = request.getParameter("gender").equals("male");
//        double point = Double.parseDouble(request.getParameter("point"));
//        iStudentService.update(id_update, name, gender, point);
//        try {
//            response.sendRedirect("/");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}



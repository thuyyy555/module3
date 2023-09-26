package com.example.demo_jstl.controller;

import com.example.demo_jstl.model.Student;
import com.example.demo_jstl.repository.StudentRepository;
import com.example.demo_jstl.service.IStudentService;
import com.example.demo_jstl.service.StudentService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "StudentServlet", value = "")
public class StudentServlet extends HttpServlet {
    private IStudentService iStudentService = new StudentService();
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
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("delete.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormUpdate(HttpServletRequest request, HttpServletResponse response) {
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
        List<Student> list = iStudentService.display();
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
            case "delete":
                delete(request,response);
                break;
            case "update":
                update(request,response);
                break;
            default:
                display(request, response);
        }
    }

    private void create(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        boolean gender = request.getParameter("gender").equals("male");
        double point = Double.parseDouble(request.getParameter("point"));
        Student student = new Student(name,gender,point);
        iStudentService.save(student);
        try {
            response.sendRedirect("/");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void delete(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        if(iStudentService.findId(id)){
            iStudentService.delete(id);
        }else{

        }

        try {
            response.sendRedirect("/");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void update(HttpServletRequest request, HttpServletResponse response) {
        int id_update = Integer.parseInt(request.getParameter("id_update"));
        String name = request.getParameter("name");
        boolean gender = request.getParameter("gender").equals("male");
        double point = Double.parseDouble(request.getParameter("point"));
        iStudentService.update(id_update, name, gender, point);
        try {
            response.sendRedirect("/");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


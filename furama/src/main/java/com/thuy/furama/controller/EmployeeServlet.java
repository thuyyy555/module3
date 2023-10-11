package com.thuy.furama.controller;

import com.thuy.furama.model.Customer;
import com.thuy.furama.model.Employee;
import com.thuy.furama.model.Service;
import com.thuy.furama.service.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "employeeServlet", value = "/employee")
public class EmployeeServlet extends HttpServlet {
    private final IEmployeeService iEmployeeService = new EmployeeService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                create(request, response);
                break;
            case "showFormUpdate":
                showFormUpdate(request, response);
                break;
            default:
                displayEmployee(request, response);
        }
    }

    private void displayEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Employee> employees = this.iEmployeeService.displayEmployee();
        request.setAttribute("list", employees);
        request.getRequestDispatcher("employee.jsp").forward(request, response);
    }

    private void showFormUpdate(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("update_id"));
        Employee employee = iEmployeeService.getEmployeeById(id);
        request.setAttribute("employee", employee);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("updateEmployee.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void create(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.sendRedirect("createEmployee.jsp");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showFormCreate(req, resp);
                break;
            case "delete":
                delete(req, resp);
                break;
            case "update":
                update(req, resp);
                break;
            case "search":
                search(req, resp);
                break;
            default:
                displayEmployee(req, resp);
        }
    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
        int maNhanVien = Integer.parseInt(request.getParameter("maNhanVien"));
        String hoTen = request.getParameter("hoTen");
        String ngaySinh= request.getParameter("ngaySinh");
        String cmnd = request.getParameter("cmnd");
        Double luong = Double.parseDouble(request.getParameter("luong"));
        String sdt = request.getParameter("sdt");
        String email = request.getParameter("email");
        String diaChi= request.getParameter("diaChi");
        int maViTri = Integer.parseInt(request.getParameter("maViTri"));
        int maTrinhDo = Integer.parseInt(request.getParameter("maTrinhDo"));
        int maBoPhan= Integer.parseInt(request.getParameter("maBoPhan"));
        Employee employee = new Employee(maNhanVien, hoTen, ngaySinh, cmnd, luong, sdt, email, diaChi, maViTri, maTrinhDo, maBoPhan);
        iEmployeeService.save(employee);
        List<Employee> list = iEmployeeService.displayEmployee();
        request.setAttribute("list", list);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("employee.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        iEmployeeService.delete(id);
        List<Employee> list = iEmployeeService.displayEmployee();
        request.setAttribute("list", list);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("employee.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void update(HttpServletRequest request, HttpServletResponse response) {
        int maNhanVien = Integer.parseInt(request.getParameter("maNhanVien"));
        String hoTen = request.getParameter("hoTen");
        String ngaySinh = request.getParameter("ngaySinh");
        String cmnd = request.getParameter("cmnd");
        Double luong = Double.parseDouble(request.getParameter("luong"));
        String sdt= request.getParameter("sdt");
        String email= request.getParameter("email");
        String diaChi = request.getParameter("diaChi");
        int maViTri = Integer.parseInt(request.getParameter("maViTri"));
        int maTrinhDo = Integer.parseInt(request.getParameter("maTrinhDo"));
        int maBoPhan = Integer.parseInt(request.getParameter("maBoPhan"));
        iEmployeeService.update(maNhanVien, hoTen, ngaySinh, cmnd, luong, sdt, email, diaChi, maViTri, maTrinhDo, maBoPhan);
        List<Employee> list = iEmployeeService.displayEmployee();
        request.setAttribute("list", list);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("employee.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void search(HttpServletRequest request, HttpServletResponse response) {
        String txtSearch = request.getParameter("txtSearch");
        List<Employee> list = iEmployeeService.search(txtSearch);
        request.setAttribute("list", list);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("employee.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

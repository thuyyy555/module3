package com.thuy.furama.controller;

import com.thuy.furama.model.Customer;
import com.thuy.furama.model.Employee;
import com.thuy.furama.service.CustomerService;
import com.thuy.furama.service.ICustomerService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "customerServlet", value = "/customer")
public class CustomerServlet extends HttpServlet {
    private ICustomerService iCustomerService = new CustomerService();

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
            case "displayCustomerUSer":
                displayCustomerUsingService(request, response);
                break;
            default:
                displayCustomer(request, response);
        }
    }

    private void displayCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customers = this.iCustomerService.displayCustomer();
        request.setAttribute("list", customers);
        request.getRequestDispatcher("customer.jsp").forward(request, response);
    }
    private void displayCustomerUsingService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customers = this.iCustomerService.displayCustomerUsingService();
        request.setAttribute("list", customers);
        request.getRequestDispatcher("customer.jsp").forward(request, response);
    }
    private void showFormUpdate(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("update_id"));
        Customer customer = iCustomerService.getCustomerById(id);
        request.setAttribute("customer",customer);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("updateCustomer.jsp");
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
            response.sendRedirect("createCustomer.jsp");
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
                displayCustomer(req, resp);
        }
    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
        int maKhachHang = Integer.parseInt(request.getParameter("maKH"));
        int maLoaiKhach = Integer.parseInt(request.getParameter("maLK"));
        String hoTenKhachHang = request.getParameter("hoTen");
        String ngaySinhKH = request.getParameter("ngaySinh");
        boolean gioiTinh = "male".equals(request.getParameter("gioiTinh"));
        String chungMinh = request.getParameter("cmnd");
        String soDienThoai = request.getParameter("sdt");
        String email = request.getParameter("email");
        String diaChi = request.getParameter("diaChi");
        Customer customer = new Customer(maKhachHang, maLoaiKhach, hoTenKhachHang, ngaySinhKH, gioiTinh, chungMinh, soDienThoai, email, diaChi);
        iCustomerService.save(customer);
        List<Customer> list = iCustomerService.displayCustomer();
        request.setAttribute("list", list);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer.jsp");
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
        iCustomerService.delete(id);
        List<Customer> list = iCustomerService.displayCustomer();
        request.setAttribute("list",list);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void update(HttpServletRequest request, HttpServletResponse response) {
        int maKhachHang = Integer.parseInt(request.getParameter("maKH"));
        int maLoaiKhach = Integer.parseInt(request.getParameter("maLK"));
        String hoTenKhachHang = request.getParameter("hoTen");
        String ngaySinhKH = request.getParameter("ngaySinh");
        boolean gioiTinh = "male".equals(request.getParameter("gioiTinh"));
        String chungMinh = request.getParameter("cmnd");
        String soDienThoai = request.getParameter("sdt");
        String email = request.getParameter("email");
        String diaChi = request.getParameter("diaChi");
        iCustomerService.update(maKhachHang, maLoaiKhach, hoTenKhachHang, ngaySinhKH, gioiTinh, chungMinh, soDienThoai, email, diaChi);
        List<Customer> list = iCustomerService.displayCustomer();
        request.setAttribute("list", list);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer.jsp");
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
        List<Customer> list = iCustomerService.search(txtSearch);
        request.setAttribute("list", list);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

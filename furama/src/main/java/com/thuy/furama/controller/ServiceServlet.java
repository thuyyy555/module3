package com.thuy.furama.controller;

import com.thuy.furama.model.Customer;
import com.thuy.furama.model.Service;
import com.thuy.furama.service.CustomerService;
import com.thuy.furama.service.ICustomerService;
import com.thuy.furama.service.IServiceService;
import com.thuy.furama.service.ServiceService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "serviceServlet", value = "/service")
public class ServiceServlet extends HttpServlet {
    private final IServiceService iServiceService = new ServiceService();

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
//            case "showFormUpdate":
//                showFormUpdate(request, response);
//                break;
            default:
                displayService(request, response);
        }
    }

    private void displayService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Service> services = this.iServiceService.displayService();
        request.setAttribute("list", services);
        request.getRequestDispatcher("service.jsp").forward(request, response);
    }

//    private void showFormUpdate(HttpServletRequest request, HttpServletResponse response) {
//        int id = Integer.parseInt(request.getParameter("update_id"));
//        Customer customer = iCustomerService.getCustomerById(id);
//        request.setAttribute("customer", customer);
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("updateCustomer.jsp");
//        try {
//            requestDispatcher.forward(request, response);
//        } catch (ServletException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    private void create(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.sendRedirect("createService.jsp");
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
//            case "delete":
//                delete(req, resp);
//                break;
//            case "update":
//                update(req, resp);
//                break;
            default:
                displayService(req, resp);
        }
    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
        int maDV = Integer.parseInt(request.getParameter("maDV"));
        String tenDV = request.getParameter("tenDV");
        int dienTich = Integer.parseInt(request.getParameter("dienTich"));
        double chiPhi = Double.parseDouble(request.getParameter("chiPhi"));
        int soNguoiToiDa = Integer.parseInt(request.getParameter("soNguoiToiDa"));
        int maKieuThue = Integer.parseInt(request.getParameter("maKieuThue"));
        int maLoaiDV = Integer.parseInt(request.getParameter("maLoaiDV"));
        String tieuChuanPhong = request.getParameter("tieuChuanPhong");
        String moTa = request.getParameter("moTa");
        double dienTichHoBoi = Double.parseDouble(request.getParameter("dienTichHoBoi"));
        int soTang = Integer.parseInt(request.getParameter("soTang"));
        Service service = new Service(maDV, tenDV, dienTich, chiPhi, soNguoiToiDa, maKieuThue, maLoaiDV, tieuChuanPhong, moTa, dienTichHoBoi, soTang);
        iServiceService.save(service);
        List<Service> list = iServiceService.displayService();
        request.setAttribute("list", list);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("service.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    private void delete(HttpServletRequest request, HttpServletResponse response) {
//        int id = Integer.parseInt(request.getParameter("id"));
//        iCustomerService.delete(id);
//        List<Customer> list = iCustomerService.displayCustomer();
//        request.setAttribute("list", list);
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer.jsp");
//        try {
//            requestDispatcher.forward(request, response);
//        } catch (ServletException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

//    private void update(HttpServletRequest request, HttpServletResponse response) {
//        int maKhachHang = Integer.parseInt(request.getParameter("maKH"));
//        int maLoaiKhach = Integer.parseInt(request.getParameter("maLK"));
//        String hoTenKhachHang = request.getParameter("hoTen");
//        String ngaySinhKH = request.getParameter("ngaySinh");
//        boolean gioiTinh = "male".equals(request.getParameter("gioiTinh"));
//        String chungMinh = request.getParameter("cmnd");
//        String soDienThoai = request.getParameter("sdt");
//        String email = request.getParameter("email");
//        String diaChi = request.getParameter("diaChi");
//        iCustomerService.update(maKhachHang, maLoaiKhach, hoTenKhachHang, ngaySinhKH, gioiTinh, chungMinh, soDienThoai, email, diaChi);
//        List<Customer> list = iCustomerService.displayCustomer();
//        request.setAttribute("list", list);
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer.jsp");
//        try {
//            requestDispatcher.forward(request, response);
//        } catch (ServletException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}

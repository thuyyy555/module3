package com.thuy.furama.controller;

import com.thuy.furama.model.Contract;
import com.thuy.furama.model.ContractDetail;
import com.thuy.furama.model.Customer;
import com.thuy.furama.model.Service;
import com.thuy.furama.repository.IContractDetailRepository;
import com.thuy.furama.service.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "contractServlet", value = "/contract")
public class ContractServlet extends HttpServlet {
    private final IContractService iContractService = new ContractService();
    private final IContractDetailService iContractDetailService = new ContractDetailService();

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
            case "createContractDetail":
                createContractDetail(request, response);
                break;
            case "displayContractDetail":
                displayContractDetail(request, response);
                break;
            default:
                displayContract(request, response);
        }
    }

    private void displayContract(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Contract> contracts = this.iContractService.displayContract();
        request.setAttribute("list", contracts);
        request.getRequestDispatcher("contract.jsp").forward(request, response);
    }
    private void displayContractDetail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<ContractDetail> contractDetails = this.iContractDetailService.displayContractDetail();
        request.setAttribute("list", contractDetails);
        request.getRequestDispatcher("contractDetail.jsp").forward(request, response);
    }

    private void create(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.sendRedirect("createContract.jsp");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private void createContractDetail(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.sendRedirect("createContractDetail.jsp");
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
            case "createContractDetail":
                showFormContractDetail(req, resp);
                break;
            default:
                displayContract(req, resp);
        }
    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
        int maHopDong = Integer.parseInt(request.getParameter("maHopDong"));
        String ngayLamHopDong = request.getParameter("ngayLamHopDong");
        String ngayKetThuc = request.getParameter("ngayKetThuc");
        double tienDatCoc = Double.parseDouble(request.getParameter("tienDatCoc"));
        int maNhanVien = Integer.parseInt(request.getParameter("maNhanVien"));
        int maKhachHang = Integer.parseInt(request.getParameter("maKhachHang"));
        int maDichVu = Integer.parseInt(request.getParameter("maDichVu"));
        Contract contract = new Contract(maHopDong, ngayLamHopDong, ngayKetThuc, tienDatCoc, maNhanVien, maKhachHang, maDichVu);
        iContractService.save(contract);
        List<Contract> list = iContractService.displayContract();
        request.setAttribute("list", list);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("contract.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void showFormContractDetail(HttpServletRequest request, HttpServletResponse response) {
        int maHopDongChiTiet = Integer.parseInt(request.getParameter("maHopDongChiTiet"));
        int maHopDong = Integer.parseInt(request.getParameter("maHopDong"));
        int maDichVuDiKem = Integer.parseInt(request.getParameter("maDichVuDiKem"));
        int soLuong = Integer.parseInt(request.getParameter("soLuong"));
        ContractDetail contractDetail = new ContractDetail(maHopDongChiTiet, maHopDong, maDichVuDiKem, soLuong);
        iContractDetailService.save(contractDetail);
        List<ContractDetail> list = iContractDetailService.displayContractDetail();
        request.setAttribute("list", list);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("contractDetail.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

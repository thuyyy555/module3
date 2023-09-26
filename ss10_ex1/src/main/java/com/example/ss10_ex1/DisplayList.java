package com.example.ss10_ex1;

import com.sun.org.apache.xml.internal.dtm.ref.CustomStringPool;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet(name = "DisplayListCustomerServlet", value="/display-customer")

public class DisplayList extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Customer> list = new ArrayList<>();
        Customer c1 = new Customer("Nguyễn Văn A", "11/02/2002", "Hà Nội", "https://i.vgt.vn/2022/12/7/cha-eun-woo-co-gi-ma-dam-vuot-lee-min-ho-tro-thanh-my-nam-hot-nhat-mxh-628-6782401.png");
        Customer c2 = new Customer("Nguyễn Văn B", "12/02/2002", "Long An", "https://i.vgt.vn/2022/12/7/cha-eun-woo-co-gi-ma-dam-vuot-lee-min-ho-tro-thanh-my-nam-hot-nhat-mxh-628-6782401.png");
        Customer c3 = new Customer("Nguyễn Văn C", "12/12/2002", "Nghệ An", "https://i.vgt.vn/2022/12/7/cha-eun-woo-co-gi-ma-dam-vuot-lee-min-ho-tro-thanh-my-nam-hot-nhat-mxh-628-6782401.png");
        list.add(c1);
        list.add(c2);
        list.add(c3);
        req.setAttribute("list", list);
        RequestDispatcher rq = req.getRequestDispatcher("index.jsp");
        rq.forward(req, resp);
    }
}

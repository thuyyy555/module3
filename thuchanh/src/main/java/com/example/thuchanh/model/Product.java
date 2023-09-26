package com.example.thuchanh.model;

public class Product {
    int id;
    String tenSP;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product(int id, String tenSP, Double gia, int soLuong, String mauSac, String moTa, String danhMuc) {
        this.id = id;
        this.tenSP = tenSP;
        this.gia = gia;
        this.soLuong = soLuong;
        this.mauSac = mauSac;
        this.moTa = moTa;
        this.danhMuc = danhMuc;
    }

    Double gia;
    int soLuong;
    String mauSac;
    String moTa;
    int id_Cate;
    String danhMuc;

    public String getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }

    public Product(String tenSP, Double gia, int soLuong, String mauSac, String moTa, String danhMuc) {
        this.tenSP = tenSP;
        this.gia = gia;
        this.soLuong = soLuong;
        this.mauSac = mauSac;
        this.moTa = moTa;
        this.danhMuc = danhMuc;
    }

    public Product(String tenSP, Double gia, int soLuong, String mauSac, String moTa, int id_Cate) {
        this.tenSP = tenSP;
        this.gia = gia;
        this.soLuong = soLuong;
        this.mauSac = mauSac;
        this.moTa = moTa;
        this.id_Cate = id_Cate;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getId_Cate() {
        return id_Cate;
    }

    public void setId_Cate(int id_Cate) {
        this.id_Cate = id_Cate;
    }
}

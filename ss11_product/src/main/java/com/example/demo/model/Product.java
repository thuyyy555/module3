package com.example.demo.model;

public class Product {
    int id;
    String tenSP;
    Double giaSP;
    String moTa;
    String nhaXB;

    public Product(int id, String tenSP, Double giaSP, String moTa, String nhaXB) {
        this.id = id;
        this.tenSP = tenSP;
        this.giaSP = giaSP;
        this.moTa = moTa;
        this.nhaXB = nhaXB;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public Double getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(Double giaSP) {
        this.giaSP = giaSP;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getNhaXB() {
        return nhaXB;
    }

    public void setNhaXB(String nhaXB) {
        this.nhaXB = nhaXB;
    }
}

package com.example.library.model;

public class HocSinh {
    String hoTen;
    int maHs;
    String lop;
    public HocSinh(String hoTen, int maHs, String lop) {
        this.hoTen = hoTen;
        this.maHs = maHs;
        this.lop = lop;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getMaHs() {
        return maHs;
    }

    public void setMa_hs(int maHs) {
        this.maHs = maHs;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
}

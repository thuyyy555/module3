package com.thuy.furama.model;

public class Service {
    int maDV;
    String tenDV;
    int dienTich;
    double chiPhi;
    int soNguoiToiDa;
    int maKieuThue;
    int maLoaiDV;
    String tieuChuanPhong;
    String moTa;
    Double dienTichHoBoi;
    int soTang;

    public Service(int maDV, String tenDV, int dienTich, double chiPhi, int soNguoiToiDa, int maKieuThue, int maLoaiDV, String tieuChuanPhong, String moTa, Double dienTichHoBoi, int soTang) {
        this.maDV = maDV;
        this.tenDV = tenDV;
        this.dienTich = dienTich;
        this.chiPhi = chiPhi;
        this.soNguoiToiDa = soNguoiToiDa;
        this.maKieuThue = maKieuThue;
        this.maLoaiDV = maLoaiDV;
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTa = moTa;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public int getMaDV() {
        return maDV;
    }

    public void setMaDV(int maDV) {
        this.maDV = maDV;
    }

    public String getTenDV() {
        return tenDV;
    }

    public void setTenDV(String tenDV) {
        this.tenDV = tenDV;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public double getChiPhi() {
        return chiPhi;
    }

    public void setChiPhi(double chiPhi) {
        this.chiPhi = chiPhi;
    }

    public int getSoNguoiToiDa() {
        return soNguoiToiDa;
    }

    public void setSoNguoiToiDa(int soNguoiToiDa) {
        this.soNguoiToiDa = soNguoiToiDa;
    }

    public int getMaKieuThue() {
        return maKieuThue;
    }

    public void setMaKieuThue(int maKieuThue) {
        this.maKieuThue = maKieuThue;
    }

    public int getMaLoaiDV() {
        return maLoaiDV;
    }

    public void setMaLoaiDV(int maLoaiDV) {
        this.maLoaiDV = maLoaiDV;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Double getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(Double dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }
}

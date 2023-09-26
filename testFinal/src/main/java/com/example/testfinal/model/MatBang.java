package com.example.testfinal.model;

import java.util.Date;

public class MatBang {
    String id;
    Double dienTich;
    String trangThai;
    int Tang;
    String loaiVp;
    String moTa;
    Double gia;
    String ngayBd;
    String ngayKt;

    public MatBang(String id, Double dienTich, String trangThai, int tang, String loaiVp, String moTa, Double gia, String ngayBd, String ngayKt) {
        this.id = id;
        this.dienTich = dienTich;
        this.trangThai = trangThai;
        Tang = tang;
        this.loaiVp = loaiVp;
        this.moTa = moTa;
        this.gia = gia;
        this.ngayBd = ngayBd;
        this.ngayKt = ngayKt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getDienTich() {
        return dienTich;
    }

    public void setDienTich(Double dienTich) {
        this.dienTich = dienTich;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public int getTang() {
        return Tang;
    }

    public void setTang(int tang) {
        Tang = tang;
    }

    public String getLoaiVp() {
        return loaiVp;
    }

    public void setLoaiVp(String loaiVp) {
        this.loaiVp = loaiVp;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public String getNgayBd() {
        return ngayBd;
    }

    public void setNgayBd(String ngayBd) {
        this.ngayBd = ngayBd;
    }

    public String getNgayKt() {
        return ngayKt;
    }

    public void setNgayKt(String ngayKt) {
        this.ngayKt = ngayKt;
    }
}

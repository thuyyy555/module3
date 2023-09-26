package com.example.library.model;

import java.util.Date;

public class TheMuonSach {
    String maMuon;
    int maHs;
    String maSach;
    Boolean trangThai;
    Date ngayMuon;
    Date ngayTra;

    public TheMuonSach(String maMuon, int maHs, String maSach, Boolean trangThai, Date ngayMuon, Date ngayTra) {
        this.maMuon = maMuon;
        this.maHs = maHs;
        this.maSach = maSach;
        this.trangThai = trangThai;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;
    }

    public String getMaMuon() {
        return maMuon;
    }

    public void setMaMuon(String maMuon) {
        this.maMuon = maMuon;
    }

    public int getMaHs() {
        return maHs;
    }

    public void setMaHs(int maHs) {
        this.maHs = maHs;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }

    public Date getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(Date ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public Date getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(Date ngayTra) {
        this.ngayTra = ngayTra;
    }
}

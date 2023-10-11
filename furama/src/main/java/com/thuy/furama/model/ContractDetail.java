package com.thuy.furama.model;

public class ContractDetail {
    int maHopDongChiTiet;
    int maHopDong;
    int maDichVuDiKem;
    int soLuong;

    public ContractDetail(int maHopDongChiTiet, int maHopDong, int maDichVuDiKem, int soLuong) {
        this.maHopDongChiTiet = maHopDongChiTiet;
        this.maHopDong = maHopDong;
        this.maDichVuDiKem = maDichVuDiKem;
        this.soLuong = soLuong;
    }

    public int getMaHopDongChiTiet() {
        return maHopDongChiTiet;
    }

    public void setMaHopDongChiTiet(int maHopDongChiTiet) {
        this.maHopDongChiTiet = maHopDongChiTiet;
    }

    public int getMaHopDong() {
        return maHopDong;
    }

    public void setMaHopDong(int maHopDong) {
        this.maHopDong = maHopDong;
    }

    public int getMaDichVuDiKem() {
        return maDichVuDiKem;
    }

    public void setMaDichVuDiKem(int maDichVuDiKem) {
        this.maDichVuDiKem = maDichVuDiKem;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}

package com.thuy.furama.model;

public class Customer {
    int maKhachHang;
    int maLoaiKhach;
    String hoTenKhachHang;
    String ngaySinhKH;
    Boolean gioiTinh;
    String chungMinh;
    String soDienThoai;
    String email;
    String diaChi;

    public Customer(int maKhachHang, String hoTenKhachHang, String ngaySinhKH, Boolean gioiTinh, String chungMinh, String soDienThoai, String email, String diaChi) {
        this.maKhachHang = maKhachHang;
        this.hoTenKhachHang = hoTenKhachHang;
        this.ngaySinhKH = ngaySinhKH;
        this.gioiTinh = gioiTinh;
        this.chungMinh = chungMinh;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.diaChi = diaChi;
    }

    public Customer(int maKhachHang, int maLoaiKhach, String hoTenKhachHang, String ngaySinhKH, Boolean gioiTinh, String chungMinh, String soDienThoai, String email, String diaChi) {
        this.maKhachHang = maKhachHang;
        this.maLoaiKhach = maLoaiKhach;
        this.hoTenKhachHang = hoTenKhachHang;
        this.ngaySinhKH = ngaySinhKH;
        this.gioiTinh = gioiTinh;
        this.chungMinh = chungMinh;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.diaChi = diaChi;
    }

    public Customer() {

    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public int getMaLoaiKhach() {
        return maLoaiKhach;
    }

    public void setMaLoaiKhach(int maLoaiKhach) {
        this.maLoaiKhach = maLoaiKhach;
    }

    public String getHoTenKhachHang() {
        return hoTenKhachHang;
    }

    public void setHoTenKhachHang(String hoTenKhachHang) {
        this.hoTenKhachHang = hoTenKhachHang;
    }

    public String getNgaySinhKH() {
        return ngaySinhKH;
    }

    public void setNgaySinhKH(String ngaySinhKH) {
        this.ngaySinhKH = ngaySinhKH;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getChungMinh() {
        return chungMinh;
    }

    public void setChungMinh(String chungMinh) {
        this.chungMinh = chungMinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}

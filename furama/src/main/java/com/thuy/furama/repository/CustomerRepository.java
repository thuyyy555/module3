package com.thuy.furama.repository;

import com.thuy.furama.model.Customer;
import com.thuy.furama.model.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository{
    private final String SELECT = "SELECT * FROM khach_hang;";
    private final String SELECT_CUSTOMER_SERVICE = "select khach_hang.ma_khach_hang, khach_hang.ma_loai_khach, khach_hang.ho_ten, khach_hang.ngay_sinh, khach_hang.gioi_tinh, khach_hang.so_cmnd, khach_hang.so_dien_thoai, khach_hang.email, khach_hang.dia_chi\n" +
            "from hop_dong \n" +
            "join khach_hang\n" +
            "on hop_dong.ma_khach_hang = khach_hang.ma_khach_hang\n" +
            "join dich_vu\n" +
            "on dich_vu.ma_dich_vu = hop_dong.ma_dich_vu\n" +
            "where hop_dong.ngay_ket_thuc > CURRENT_DATE();";
    private final String SEARCH = "SELECT * FROM khach_hang WHERE ho_ten LIKE ?;";

    private final String SELECT_UP_ID = "SELECT * FROM khach_hang where ma_khach_hang = ?;";
    private final String INSERT = "insert into khach_hang(ma_khach_hang, ma_loai_khach, ho_ten, ngay_sinh, gioi_tinh, so_cmnd, so_dien_thoai, email, dia_chi)\n" +
            "values(?,?,?,?,?,?,?,?,?)";
    private final String DELETE = "delete from khach_hang where ma_khach_hang = ?;";
    private final String UPDATE = "UPDATE khach_hang SET ma_loai_khach = ?, ho_ten = ?, ngay_sinh = ?, gioi_tinh = ?, so_cmnd = ?, so_dien_thoai = ?, email = ?, dia_chi = ? WHERE (ma_khach_hang = ?);";

    @Override
    public List<Customer> displayCustomer() {
        List<Customer> list = new ArrayList<>();
        Connection con = BaseRepository.getConnection();
        try {
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT);
            while (resultSet.next()) {
                int maKhachHang = resultSet.getInt("ma_khach_hang");
                int maLoaiKhach = resultSet.getInt("ma_loai_khach");
                String hoTenKhachHang = resultSet.getString("ho_ten");
                String ngaySinhKH = resultSet.getString("ngay_sinh");
                Boolean gioiTinh = resultSet.getBoolean("gioi_tinh");
                String chungMinh = resultSet.getString("so_cmnd");
                String soDienThoai = resultSet.getString("so_dien_thoai");
                String email = resultSet.getString("email");
                String diaChi = resultSet.getString("dia_chi");
                list.add(new Customer(maKhachHang, maLoaiKhach, hoTenKhachHang, ngaySinhKH, gioiTinh, chungMinh, soDienThoai, email, diaChi) );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    @Override
    public List<Customer> displayCustomerUsingService() {
        List<Customer> list = new ArrayList<>();
        Connection con = BaseRepository.getConnection();
        try {
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT_CUSTOMER_SERVICE);
            while (resultSet.next()) {
                int maKhachHang = resultSet.getInt("ma_khach_hang");
                int maLoaiKhach = resultSet.getInt("ma_loai_khach");
                String hoTenKhachHang = resultSet.getString("ho_ten");
                String ngaySinhKH = resultSet.getString("ngay_sinh");
                Boolean gioiTinh = resultSet.getBoolean("gioi_tinh");
                String chungMinh = resultSet.getString("so_cmnd");
                String soDienThoai = resultSet.getString("so_dien_thoai");
                String email = resultSet.getString("email");
                String diaChi = resultSet.getString("dia_chi");
                list.add(new Customer(maKhachHang, maLoaiKhach, hoTenKhachHang, ngaySinhKH, gioiTinh, chungMinh, soDienThoai, email, diaChi) );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void save(Customer customer) {
        Connection con = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = con.prepareStatement(INSERT);
            preparedStatement.setInt(1, customer.getMaKhachHang());
            preparedStatement.setInt(2, customer.getMaLoaiKhach());
            preparedStatement.setString(3, customer.getHoTenKhachHang());
            preparedStatement.setString(4, customer.getNgaySinhKH());
            preparedStatement.setBoolean(5, customer.getGioiTinh());
            preparedStatement.setString(6, customer.getChungMinh());
            preparedStatement.setString(7, customer.getSoDienThoai());
            preparedStatement.setString(8, customer.getEmail());
            preparedStatement.setString(9, customer.getDiaChi());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Customer> search(String txtSearch) {
        List<Customer> list = new ArrayList<>();
        Connection con = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = con.prepareStatement(SEARCH);
            preparedStatement.setString(1, "%" + txtSearch + "%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int maKhachHang = resultSet.getInt("ma_khach_hang");
                int maLoaiKhach = resultSet.getInt("ma_loai_khach");
                String hoTenKhachHang = resultSet.getString("ho_ten");
                String ngaySinhKH = resultSet.getString("ngay_sinh");
                Boolean gioiTinh = resultSet.getBoolean("gioi_tinh");
                String chungMinh = resultSet.getString("so_cmnd");
                String soDienThoai = resultSet.getString("so_dien_thoai");
                String email = resultSet.getString("email");
                String diaChi = resultSet.getString("dia_chi");
                list.add(new Customer(maKhachHang, maLoaiKhach, hoTenKhachHang, ngaySinhKH, gioiTinh, chungMinh, soDienThoai, email, diaChi) );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void delete(int id) {
        Connection con = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = con.prepareStatement(DELETE);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public Customer getCustomerById(int id) {
        Connection con = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = con.prepareStatement(SELECT_UP_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int maKhachHang = resultSet.getInt("ma_khach_hang");
                int maLoaiKhach = resultSet.getInt("ma_loai_khach");
                String hoTenKhachHang = resultSet.getString("ho_ten");
                String ngaySinhKH = resultSet.getString("ngay_sinh");
                Boolean gioiTinh = resultSet.getBoolean("gioi_tinh");
                String chungMinh = resultSet.getString("so_cmnd");
                String soDienThoai = resultSet.getString("so_dien_thoai");
                String email = resultSet.getString("email");
                String diaChi = resultSet.getString("dia_chi");
                return new Customer(maKhachHang, maLoaiKhach, hoTenKhachHang, ngaySinhKH, gioiTinh, chungMinh, soDienThoai, email, diaChi);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    @Override
    public void update(int maKhachHang, int maLoaiKhach, String hoTenKhachHang, String ngaySinhKH, Boolean gioiTinh, String chungMinh, String soDienThoai, String email, String diaChi) {
        Connection con = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = con.prepareStatement(UPDATE);
            preparedStatement.setInt(1, maLoaiKhach);
            preparedStatement.setString(2, hoTenKhachHang);
            preparedStatement.setString(3, ngaySinhKH);
            preparedStatement.setBoolean(4, gioiTinh);
            preparedStatement.setString(5, chungMinh);
            preparedStatement.setString(6, soDienThoai);
            preparedStatement.setString(7, email);
            preparedStatement.setString(8, diaChi);
            preparedStatement.setInt(9, maKhachHang);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

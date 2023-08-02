
-- Thêm thông tin bảng Bộ Phận
insert into bo_phan (ma_bo_phan, ten_bo_phan)
values (1, "Sale-Marketing");
insert into bo_phan (ma_bo_phan, ten_bo_phan)
values (2, "Hành chính");
insert into bo_phan (ma_bo_phan, ten_bo_phan)
values (3, "Phục vụ");
insert into bo_phan (ma_bo_phan, ten_bo_phan)
values (4, "Quản lí");

-- Thêm thông tin bảng Trình Độ
insert into trinh_do (ma_trinh_do, ten_trinh_do)
values (1, "Trung cấp");
insert into trinh_do (ma_trinh_do, ten_trinh_do)
values (2, "Cao đẳng");
insert into trinh_do (ma_trinh_do, ten_trinh_do)
values (3, "Đại học");
insert into trinh_do (ma_trinh_do, ten_trinh_do)
values (4, "Sau Đại học");

-- Thêm thông tin bảng Vị Trí
insert into vi_tri (ma_vi_tri, ten_vi_tri)
values (1, "Lế tân");
insert into vi_tri (ma_vi_tri, ten_vi_tri)
values (2, "Phục vụ");
insert into vi_tri (ma_vi_tri, ten_vi_tri)
values (3, "Chuyên viên");
insert into vi_tri (ma_vi_tri, ten_vi_tri)
values (4, "Giám sát");
insert into vi_tri (ma_vi_tri, ten_vi_tri)
values (5, "Quản lí");
insert into vi_tri (ma_vi_tri, ten_vi_tri)
values (6, "Giám đốc");

-- Thêm thông tin bảng Nhân Viên 
insert into nhan_vien (ma_nhan_vien, ho_ten, ngay_sinh, so_cmnd, luong, so_dien_thoai, email, dia_chi, ma_vi_tri, ma_trinh_do, ma_bo_phan)
values (1, "Nguyễn Văn Cường", "2002/12/12", "1111111111", 20000000, 0911111111, "nguyenvancuong@gmail.com", "Long An", 2, 3, 4);
insert into nhan_vien (ma_nhan_vien, ho_ten, ngay_sinh, so_cmnd, luong, so_dien_thoai, email, dia_chi, ma_vi_tri, ma_trinh_do, ma_bo_phan)
values (2, "Trần An Khang", "1983/10/22", "1111111112", 10000000, 0911111112, "tranankhang@gmail.com", "Đà Nẵng", 1, 1, 3);
insert into nhan_vien (ma_nhan_vien, ho_ten, ngay_sinh, so_cmnd, luong, so_dien_thoai, email, dia_chi, ma_vi_tri, ma_trinh_do, ma_bo_phan)
values (3, "Lê Hoàng Hà", "1998/03/16", "1111111113", 30000000, 0911111113, "lehoangha@gmail.com", "Sài Gòn", 3, 2, 4);
insert into nhan_vien (ma_nhan_vien, ho_ten, ngay_sinh, so_cmnd, luong, so_dien_thoai, email, dia_chi, ma_vi_tri, ma_trinh_do, ma_bo_phan)
values (4, "Đinh An Nhiên", "1970/12/24", "1111111114", 40000000, 0911111114, "dinhannhien@gmail.com", "Hà Nội", 4, 3, 2);
insert into nhan_vien (ma_nhan_vien, ho_ten, ngay_sinh, so_cmnd, luong, so_dien_thoai, email, dia_chi, ma_vi_tri, ma_trinh_do, ma_bo_phan)
values (5, "Hoàng Cao Anh", "2001/03/03", "1111111115", 50000000, 0911111115, "hoangcaoanh@gmail.com", "Quảng Trị", 5, 4, 4);
insert into nhan_vien (ma_nhan_vien, ho_ten, ngay_sinh, so_cmnd, luong, so_dien_thoai, email, dia_chi, ma_vi_tri, ma_trinh_do, ma_bo_phan)
values (6, "Ngô Văn Miên", "2000/02/04", "1111111111", 60000000, 0911111116, "ngovanmien@gmail.com", "Tiền Giang", 6, 3, 1);

-- Thêm thông tin bảng Loại Khách
insert into loai_khach (ma_loai_khach, ten_loai_khach) 
values (1, "Diamond");
insert into loai_khach (ma_loai_khach, ten_loai_khach) 
values (2, "Platinium");
insert into loai_khach (ma_loai_khach, ten_loai_khach) 
values (3, "Gold");
insert into loai_khach (ma_loai_khach, ten_loai_khach) 
values (4, "Silver");
insert into loai_khach (ma_loai_khach, ten_loai_khach) 
values (5, "Member");

-- Thêm thông tin bảng Khách Hàng
insert into khach_hang (ma_khach_hang, ma_loai_khach, ho_ten, ngay_sinh, gioi_tinh, so_cmnd, so_dien_thoai, email, dia_chi)
values (1, 1, "Trần Cao Anh Tài", "1983/12/23", (1), 2222222221, 0811111111, "trancaoanhtai@gmail.com", "Quảng Trị");
insert into khach_hang (ma_khach_hang, ma_loai_khach, ho_ten, ngay_sinh, gioi_tinh, so_cmnd, so_dien_thoai, email, dia_chi)
values (2, 3, "Nguyễn Văn Mai Hương", "1999/12/03", (1), 2222222222, 0811111112, "nguyenvanmaihuong@gmail.com", "Đà Nẵng");
insert into khach_hang (ma_khach_hang, ma_loai_khach, ho_ten, ngay_sinh, gioi_tinh, so_cmnd, so_dien_thoai, email, dia_chi)
values (3, 5, "Võ Minh Anh", "2002/02/18", (1), 2222222223, 0811111113, "vominhanh@gmail.com", "Tây Ninh");
insert into khach_hang (ma_khach_hang, ma_loai_khach, ho_ten, ngay_sinh, gioi_tinh, so_cmnd, so_dien_thoai, email, dia_chi)
values (4, 4, "Cao Xuân Thu", "1977/11/27", (1), 2222222224, 0811111114, "caoxuanthu@gmail.com", "Quảng Bình");
insert into khach_hang (ma_khach_hang, ma_loai_khach, ho_ten, ngay_sinh, gioi_tinh, so_cmnd, so_dien_thoai, email, dia_chi)
values (5, 2, "Nguyễn Tất Tuấn", "2000/10/10", (1), 2222222225, 0811111115, "nguyentattuan@gmail.com", "Quảng Nam");

-- Thêm thông tin bảng Kiểu Thuê
insert into kieu_thue (ma_kieu_thue, ten_kieu_thue)
values (1, "Theo năm");
insert into kieu_thue (ma_kieu_thue, ten_kieu_thue)
values (2, "Theo tháng");
insert into kieu_thue (ma_kieu_thue, ten_kieu_thue)
values (3, "Theo ngày");
insert into kieu_thue (ma_kieu_thue, ten_kieu_thue)
values (4, "Theo giờ");

-- Thêm thông tin bảng Loại Dịch Vụ
insert into loai_dich_vu (ma_loai_dich_vu, ten_loai_dich_vu)
values (1, "Villa");
insert into loai_dich_vu (ma_loai_dich_vu, ten_loai_dich_vu)
values (2, "House");
insert into loai_dich_vu (ma_loai_dich_vu, ten_loai_dich_vu)
values (3, "Room");

-- Thêm thông tin bảng Dịch Vụ
insert into dich_vu (ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue, so_nguoi_toi_da, ma_kieu_thue, ma_loai_dich_vu, tieu_chuan_phong, mo_ta_tien_nghi_khac, dien_tich_ho_boi, so_tang)
values (1, "Villa01", 200, 2500000, 10, 3, 1, "4 sao", "Tiện nghi Villa", 20, 3);
insert into dich_vu (ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue, so_nguoi_toi_da, ma_kieu_thue, ma_loai_dich_vu, tieu_chuan_phong, mo_ta_tien_nghi_khac, dien_tich_ho_boi, so_tang)
values (2, "House01", 250, 2000000, 15, 2, 2, "3 sao", "Tiện nghi House", null, 4);
insert into dich_vu (ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue, so_nguoi_toi_da, ma_kieu_thue, ma_loai_dich_vu, tieu_chuan_phong, mo_ta_tien_nghi_khac, dien_tich_ho_boi, so_tang)
values (3, "Room01", 50, 20000000, 3, 1, 3, null, null, null, null);

-- Thêm thông tin bảng Hợp Đồng
insert into hop_dong (ma_hop_dong, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, ma_nhan_vien, ma_khach_hang, ma_dich_vu)
values (1, "2020/12/01", "2021/03/28", 1000000, 1, 1, 1);
insert into hop_dong (ma_hop_dong, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, ma_nhan_vien, ma_khach_hang, ma_dich_vu)
values (2, "2021/12/12", "2023/03/28", 1500000, 2, 2, 2);
insert into hop_dong (ma_hop_dong, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, ma_nhan_vien, ma_khach_hang, ma_dich_vu)
values (3, "2018/12/01", "2019/07/20", 1000000, 3, 3, 3);
insert into hop_dong (ma_hop_dong, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, ma_nhan_vien, ma_khach_hang, ma_dich_vu)
values (4, "2019/10/12", "2020/03/15", 1800000, 4, 2, 1);

-- Thêm thông tin bảng Dich Vụ Đi Kèm
insert into dich_vu_di_kem (ma_dich_vu_di_kem, ten_dich_vu_di_kem, gia, don_vi, trang_thai)
values (1, "massage", 200000, );

-- Thêm thông tin bảng Hợp Đồng Chi Tiết
insert into (ma_hop_dong_chi_tiet, ma_hop_dong, ma_dich_vu_di_kem, so_luong)
values ();


create database nhap_xuat_hang;
use nhap_xuat_hang;

create table phieu_xuat(
so_px int primary key,
ngay_xuat date
);

create table vat_tu(
ma_vat_tu int primary key,
ten_vat_tu varchar(255)
);

create table phieu_nhap(
so_pn int primary key,
nhay_nhap date
);

create table nha_cung_cap(
ma_ncc int primary key,
ten_ncc varchar(255),
dia_chi varchar(255),
sdt int
);

create table don_dat_hang(
so_dat_hang int primary key,
ngay_dat_hang date,
ma_ncc int,
foreign key (ma_ncc) references nha_cung_cap(ma_ncc)
);



create table chi_tiet_phieu_nhap(
so_pn int,
ma_vat_tu int,
primary key(so_pn, ma_vat_tu),
dg_nhap int,
sl_nhap int,
foreign key (so_pn) references phieu_nhap(so_pn), 
foreign key (ma_vat_tu) references vat_tu(ma_vat_tu)
);

create table chi_tiet_phieu_xuat(
so_px int,
ma_vat_tu int,
primary key(so_px, ma_vat_tu),
dg_xuat int,
sl_xuat int,
foreign key (so_px) references phieu_xuat(so_px), 
foreign key (ma_vat_tu) references vat_tu(ma_vat_tu)
);

create table chi_tiet_don_dat_hang(
so_dat_hang int,
ma_vat_tu int,
primary key(so_dat_hang, ma_vat_tu),
foreign key (so_dat_hang) references don_dat_hang(so_dat_hang), 
foreign key (ma_vat_tu) references vat_tu(ma_vat_tu)
);
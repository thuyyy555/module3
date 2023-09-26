package com.example.library.service;

import com.example.library.model.HocSinh;
import com.example.library.model.Sach;
import com.example.library.repository.HocSinhRepository;
import com.example.library.repository.IHocSinhRepository;
import com.example.library.repository.ISachRepository;
import com.example.library.repository.SachRepository;

import java.util.List;

public class HocSinhService implements IHocSinhService{
    IHocSinhRepository iHocSinhRepository = new HocSinhRepository();
    @Override
    public List<HocSinh> displayHocSinh() {
        return iHocSinhRepository.displayHocSinh();
    }
}

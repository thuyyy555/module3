package com.example.testfinal.service;

import com.example.testfinal.model.MatBang;

import java.util.List;

public interface IMatBangService {
    List<MatBang> displayMatBang();
    void save(MatBang matBang);
    void delete(String id);
}

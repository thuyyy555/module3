package com.example.testfinal.repository;

import com.example.testfinal.model.MatBang;

import java.util.List;

public interface IMatBangRepository {
    List<MatBang> displayMatBang();
    void save(MatBang matBang);
    void delete(String id);
}

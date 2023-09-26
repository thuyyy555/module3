package com.example.testfinal.service;

import com.example.testfinal.model.MatBang;
import com.example.testfinal.repository.IMatBangRepository;
import com.example.testfinal.repository.MatBangRepository;

import java.util.List;

public class MatBangService implements IMatBangService{
    IMatBangRepository iMatBangRepository = new MatBangRepository();
    @Override
    public List<MatBang> displayMatBang() {
        return iMatBangRepository.displayMatBang();
    }

    @Override
    public void save(MatBang matBang) {
        iMatBangRepository.save(matBang);
    }

    @Override
    public void delete(String id) {
        iMatBangRepository.delete(id);
    }
}

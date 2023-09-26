package com.example.library.service;

import com.example.library.model.Sach;
import com.example.library.repository.ISachRepository;
import com.example.library.repository.SachRepository;

import java.util.List;

public class SachService implements ISachService{
    ISachRepository iSachRepository = new SachRepository();
    @Override
    public List<Sach> displayBook() {
        return iSachRepository.displayBook();
    }
}

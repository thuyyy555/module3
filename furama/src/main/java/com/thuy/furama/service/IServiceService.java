package com.thuy.furama.service;

import com.thuy.furama.model.Service;

import java.util.List;

public interface IServiceService {
    List<Service> displayService();
    void save(Service service);
}

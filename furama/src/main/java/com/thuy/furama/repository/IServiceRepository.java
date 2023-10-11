package com.thuy.furama.repository;

import com.thuy.furama.model.Service;

import java.util.List;

public interface IServiceRepository {
    List<Service> displayService();
    void save(Service service);
}

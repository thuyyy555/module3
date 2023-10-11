package com.thuy.furama.service;

import com.thuy.furama.model.Service;
import com.thuy.furama.repository.CustomerRepository;
import com.thuy.furama.repository.ICustomerRepository;
import com.thuy.furama.repository.IServiceRepository;
import com.thuy.furama.repository.ServiceRepository;

import java.util.List;

public class ServiceService implements IServiceService{
    IServiceRepository iServiceRepository = new ServiceRepository();
    @Override
    public List<Service> displayService() {
        return iServiceRepository.displayService();
    }

    @Override
    public void save(Service service) {
        iServiceRepository.save(service);
    }
}

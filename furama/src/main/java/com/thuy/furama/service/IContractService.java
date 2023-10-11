package com.thuy.furama.service;

import com.thuy.furama.model.Contract;

import java.util.List;

public interface IContractService {
    List<Contract> displayContract();
    void save(Contract contract);
}

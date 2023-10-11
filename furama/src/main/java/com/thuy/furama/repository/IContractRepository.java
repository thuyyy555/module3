package com.thuy.furama.repository;

import com.thuy.furama.model.Contract;
import com.thuy.furama.model.Service;

import java.util.List;

public interface IContractRepository {
    List<Contract> displayContract();
    void save(Contract contract);
}

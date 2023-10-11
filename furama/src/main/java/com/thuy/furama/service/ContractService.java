package com.thuy.furama.service;

import com.thuy.furama.model.Contract;
import com.thuy.furama.repository.ContractRepository;
import com.thuy.furama.repository.IContractRepository;

import java.util.List;

public class ContractService implements IContractService {
    IContractRepository iContractRepository = new ContractRepository();

    @Override
    public List<Contract> displayContract() {
        return iContractRepository.displayContract();
    }

    @Override
    public void save(Contract contract) {
        iContractRepository.save(contract);
    }
}

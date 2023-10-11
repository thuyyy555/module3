package com.thuy.furama.service;

import com.thuy.furama.model.ContractDetail;
import com.thuy.furama.repository.ContractDetailRepository;
import com.thuy.furama.repository.IContractDetailRepository;

import java.util.List;

public class ContractDetailService implements IContractDetailService {
    IContractDetailRepository iContractDetailRepository = new ContractDetailRepository();

    @Override
    public List<ContractDetail> displayContractDetail() {
        return iContractDetailRepository.displayContractDetail();
    }

    @Override
    public void save(ContractDetail contractDetail) {
        iContractDetailRepository.save(contractDetail);
    }
}

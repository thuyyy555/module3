package com.thuy.furama.service;

import com.thuy.furama.model.Contract;
import com.thuy.furama.model.ContractDetail;

import java.util.List;

public interface IContractDetailService {
    List<ContractDetail> displayContractDetail();
    void save(ContractDetail contractDetail);
}

package com.thuy.furama.repository;

import com.thuy.furama.model.Contract;
import com.thuy.furama.model.ContractDetail;

import java.util.List;

public interface IContractDetailRepository {
    List<ContractDetail> displayContractDetail();
    void save(ContractDetail contractDetail);
}

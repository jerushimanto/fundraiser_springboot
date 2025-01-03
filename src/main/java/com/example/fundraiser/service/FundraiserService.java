package com.example.fundraiser.service;

import com.example.fundraiser.custom_exception;
import com.example.fundraiser.model.Fundraiser;
import com.example.fundraiser.repository.FundraiserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FundraiserService {
    @Autowired
    private FundraiserRepository repository;

    public List<Fundraiser> getAllFundraisers() {
        return repository.findAll();
    }

    public Fundraiser getFundraiserById(Long id) {
        return repository.findById(id).orElseThrow(() -> new custom_exception("Fundraiser not found"));
    }

    public Fundraiser createFundraiser(Fundraiser fundraiser) {
        return repository.save(fundraiser);
    }

    public void donateToFundraiser(Long id, double amount) {
        Fundraiser fundraiser = getFundraiserById(id);
        fundraiser.setRaisedAmount(fundraiser.getRaisedAmount() + amount);
        repository.save(fundraiser);
    }
}

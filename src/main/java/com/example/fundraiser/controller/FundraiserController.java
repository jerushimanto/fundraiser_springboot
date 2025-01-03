package com.example.fundraiser.controller;

import com.example.fundraiser.model.Fundraiser;
import com.example.fundraiser.service.FundraiserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fundraisers")
public class FundraiserController {
    @Autowired
    private FundraiserService service;

    @GetMapping
    public List<Fundraiser> getAllFundraisers() {
        return service.getAllFundraisers();
    }

    @GetMapping("/{id}")
    public Fundraiser getFundraiserById(@PathVariable Long id) {
        return service.getFundraiserById(id);
    }

    @PostMapping
    public Fundraiser createFundraiser(@RequestBody Fundraiser fundraiser) {
        return service.createFundraiser(fundraiser);
    }

    @PostMapping("/{id}/donate")
    public void donateToFundraiser(@PathVariable Long id, @RequestParam double amount) {
        service.donateToFundraiser(id, amount);
    }
}

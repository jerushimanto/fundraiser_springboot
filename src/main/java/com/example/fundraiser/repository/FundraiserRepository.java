package com.example.fundraiser.repository;

import com.example.fundraiser.model.Fundraiser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FundraiserRepository extends JpaRepository<Fundraiser, Long> {}

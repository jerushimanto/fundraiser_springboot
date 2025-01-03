package com.example.fundraiser.model;

import jakarta.persistence.*;

@Entity
public class Fundraiser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private double targetAmount;
    private double raisedAmount;

    public Fundraiser() {}

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public double getTargetAmount() { return targetAmount; }
    public void setTargetAmount(double targetAmount) { this.targetAmount = targetAmount; }

    public double getRaisedAmount() { return raisedAmount; }
    public void setRaisedAmount(double raisedAmount) { this.raisedAmount = raisedAmount; }
}

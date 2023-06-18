package com.wellsfargo.counselor.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    private Advisor financialAdvisor;

    protected Client() {
    }

    public Client(String name, Advisor financialAdvisor) {
        this.name = name;
        this.financialAdvisor = financialAdvisor;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Advisor getFinancialAdvisor() {
        return financialAdvisor;
    }

    public void setFinancialAdvisor(Advisor financialAdvisor) {
        this.financialAdvisor = financialAdvisor;
    }
}

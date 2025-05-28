package org.acme.model;


import jakarta.persistence.*;

@Entity
@Table(name = "employment_details")
public class EmploymentDetails extends BaseEntity{

    @OneToOne
    @JoinColumn(name = "user_id",nullable = false)
    private Users userId;

    @Column(name = "education",nullable = false)
    private String education;

    @Column(name = "occupation", nullable = false)
    private String occupation;

    @Column(name = "designation", nullable = false)
    private String designation;

    @Column(name = "employment_type", nullable = false)
    private String employmentType;

    @Column(name = "source_of_income", nullable = false)
    private String sourceOfIncome;

    @Column(name = "annual_income", nullable = false)
    private double annualIncome;

    @Column(name = "annual_transaction", nullable = false)
    private int annualTransaction;

    @Column(name = "annual_transaction_volume", nullable = false)
    private double annualTransactionVolume;

    public EmploymentDetails() {
    }

    public Users getUserId() {
        return userId;
    }

    public void setUserId(Users userId) {
        this.userId = userId;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public String getSourceOfIncome() {
        return sourceOfIncome;
    }

    public void setSourceOfIncome(String sourceOfIncome) {
        this.sourceOfIncome = sourceOfIncome;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public int getAnnualTransaction() {
        return annualTransaction;
    }

    public void setAnnualTransaction(int annualTransaction) {
        this.annualTransaction = annualTransaction;
    }

    public double getAnnualTransactionVolume() {
        return annualTransactionVolume;
    }

    public void setAnnualTransactionVolume(double annualTransactionVolume) {
        this.annualTransactionVolume = annualTransactionVolume;
    }
}

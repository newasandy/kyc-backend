package org.acme.model;

import jakarta.persistence.*;

@Entity
@Table(name = "family_details")
public class FamilyDetails extends BaseEntity{

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @OneToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customerId;

    @ManyToOne
    @JoinColumn(name = "relation_id",nullable = false)
    private RelationType relationTypeId;

    @Column(name = "marital_status", nullable = false)
    private boolean maritalStatus;

    public FamilyDetails() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public RelationType getRelationTypeId() {
        return relationTypeId;
    }

    public void setRelationTypeId(RelationType relationTypeId) {
        this.relationTypeId = relationTypeId;
    }

    public boolean isMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(boolean maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
}

package org.acme.model;

import jakarta.persistence.*;

@Entity
@Table(name = "family_details")
public class FamilyDetails extends BaseEntity{
    @Column(name = "father_name", nullable = false)
    private String fatherName;
    @Column(name="mother_name", nullable = false)
    private String motherName;
    @Column(name="grandfather_name", nullable = false)
    private String grandfatherName;
    @Column(name = "marital_status", nullable = false)
    private Boolean martialStatus;
    @Column(name = "spouse_name", nullable = true)
    private String spouseName;
    @Column(name = "father_in_law_name", nullable = true)
    private String fatherInlLawName;
    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users userId;

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getGrandfatherName() {
        return grandfatherName;
    }

    public void setGrandfatherName(String grandfatherName) {
        this.grandfatherName = grandfatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public Boolean getMartialStatus() {
        return martialStatus;
    }

    public void setMartialStatus(Boolean martialStatus) {
        this.martialStatus = martialStatus;
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    public String getFatherInlLawName() {
        return fatherInlLawName;
    }

    public void setFatherInlLawName(String fatherInlLawName) {
        this.fatherInlLawName = fatherInlLawName;
    }

    public Users getUserId() {
        return userId;
    }

    public void setUserId(Users userId) {
        this.userId = userId;
    }
}

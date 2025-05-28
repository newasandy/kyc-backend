package org.acme.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "identification_details")
public class IdentificationDetails extends BaseEntity{

    @OneToOne
    @JoinColumn(name = "user_id",nullable = false)
    private Users usersId;

    @Column(name ="document_type",nullable = false)
    private String documentType;

    @Column(name = "nationality",nullable = false)
    private String nationality;

    @Column(name = "birth_place",nullable = false)
    private String birthPlace;

    @Column(name = "place_of_issue",nullable = false)
    private String placeOfIssue;

    @Column(name = "id_number", nullable = false,unique = true)
    private String idNumber;

    @Column(name = "issue_date", nullable = false)
    private LocalDate issueDate;

    @Column(name = "authority", nullable = false)
    private String authority;

    public IdentificationDetails() {
    }

    public Users getUsersId() {
        return usersId;
    }

    public void setUsersId(Users usersId) {
        this.usersId = usersId;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getPlaceOfIssue() {
        return placeOfIssue;
    }

    public void setPlaceOfIssue(String placeOfIssue) {
        this.placeOfIssue = placeOfIssue;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}

package org.acme.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "district")
public class District extends BaseEntity{

    @Column(name = "district", nullable = false)
    private String district;
}

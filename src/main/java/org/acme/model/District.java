package org.acme.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "district")
public class District extends BaseEntity{

    @Column(name = "district", nullable = false)
    private String district;

    @ManyToOne
    @JoinColumn(name = "province_id",nullable = false)
    private Province provinceId;

    @OneToMany(mappedBy = "district", cascade = CascadeType.ALL)
    private List<LocalLevel> localLevel;

    public District() {
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Province getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Province provinceId) {
        this.provinceId = provinceId;
    }
}

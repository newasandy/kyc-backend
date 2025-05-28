package org.acme.model;

import jakarta.persistence.*;

@Entity
@Table(name = "local_level")
public class LocalLevel extends BaseEntity{
    @Column(name = "local_level", nullable = false)
    private String localLevel;

    @OneToMany
    @JoinColumn(name = "district", nullable = false)
    private District district;

    public LocalLevel(){

    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public String getLocalLevel() {
        return localLevel;
    }

    public void setLocalLevel(String localLevel) {
        this.localLevel = localLevel;
    }
}

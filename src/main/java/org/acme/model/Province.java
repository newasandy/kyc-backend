package org.acme.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "province")
public class Province extends BaseEntity{
    @Column(name = "province", nullable = false)
    private String  province;

    public Province(){

    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}

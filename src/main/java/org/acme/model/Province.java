package org.acme.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "province")
public class Province extends BaseEntity{
    @Column(name = "province", nullable = false)
    private String  province;


    @OneToMany(mappedBy = "provinceId",cascade = CascadeType.ALL)
    private List<District> district;

    public Province(){

    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}

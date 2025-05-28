package org.acme.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "local_level")
public class LocalLevel extends BaseEntity{
    @Column(name = "local_level")
    private String localLevel;

    public LocalLevel(){

    }

    public String getLocalLevel() {
        return localLevel;
    }

    public void setLocalLevel(String localLevel) {
        this.localLevel = localLevel;
    }
}

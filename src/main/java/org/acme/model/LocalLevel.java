package org.acme.model;

import jakarta.persistence.*;

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

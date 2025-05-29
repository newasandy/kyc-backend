package org.acme.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "relation_type")
public class RelationType extends BaseEntity {

    @Column(name = "relation", nullable = false, length = 100)
    private String relation;

    public RelationType() {
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }
}

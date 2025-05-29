package org.acme.dao.daoimpl;

import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.acme.dao.RelationTypeDao;
import org.acme.model.RelationType;

public class RelationTypeDaoImpl extends BaseDaoImpl<RelationType,Long> implements RelationTypeDao{

    public RelationTypeDaoImpl(){
        super(RelationType.class,null);
    }

    @Inject
    public RelationTypeDaoImpl(EntityManager entityManager){
        super(RelationType.class, entityManager);
    }
}
package org.acme.dao.daoimpl;

import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.acme.dao.LocalLevelDao;
import org.acme.model.LocalLevel;

public class LocalLevelDaoImpl extends BaseDaoImpl<LocalLevel,Long>implements LocalLevelDao {

    public LocalLevelDaoImpl(){
        super(LocalLevel.class,null);
    }

    @Inject
    public LocalLevelDaoImpl(EntityManager entityManager){
        super(LocalLevel.class,entityManager);
    }
}

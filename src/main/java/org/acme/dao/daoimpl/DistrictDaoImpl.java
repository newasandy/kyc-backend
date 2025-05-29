package org.acme.dao.daoimpl;

import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.acme.dao.DistrictDao;
import org.acme.model.District;

public class DistrictDaoImpl extends BaseDaoImpl<District,Long>implements DistrictDao {

    public DistrictDaoImpl(){
        super(District.class,null);
    }

    @Inject
    public DistrictDaoImpl(EntityManager entityManager){
        super(District.class,entityManager);
    }
}

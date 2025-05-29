package org.acme.dao.daoimpl;

import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.acme.dao.FamilyDetailsDao;
import org.acme.model.FamilyDetails;

public class FamilyDetailsDaoImpl extends BaseDaoImpl<FamilyDetails,Long>implements FamilyDetailsDao {

    public FamilyDetailsDaoImpl(){
        super(FamilyDetails.class,null);
    }

    @Inject
    public FamilyDetailsDaoImpl(EntityManager entityManager){
        super(FamilyDetails.class,entityManager);
    }
}

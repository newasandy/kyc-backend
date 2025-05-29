package org.acme.dao.daoimpl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.acme.dao.IdentificationDetailsDao;
import org.acme.model.IdentificationDetails;

@ApplicationScoped
public class IdentificationDetailsDaoImpl extends BaseDaoImpl<IdentificationDetails,Long> implements IdentificationDetailsDao {
    public IdentificationDetailsDaoImpl(){
        super(IdentificationDetails.class,null);
    }
    @Inject
    public IdentificationDetailsDaoImpl(EntityManager entityManager){
        super(IdentificationDetails.class,entityManager);
    }
}

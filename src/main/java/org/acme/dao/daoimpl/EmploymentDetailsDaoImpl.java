package org.acme.dao.daoimpl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.acme.dao.EmploymentDetailsDao;
import org.acme.model.EmploymentDetails;

@ApplicationScoped
public class EmploymentDetailsDaoImpl extends BaseDaoImpl<EmploymentDetails,Long> implements EmploymentDetailsDao {

    public EmploymentDetailsDaoImpl(){
        super(EmploymentDetails.class,null);
    }

    @Inject
    public EmploymentDetailsDaoImpl(EntityManager entityManager){
        super(EmploymentDetails.class,entityManager);
    }
}

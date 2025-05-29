package org.acme.dao.daoimpl;

import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.acme.dao.PermanentAddressDao;
import org.acme.model.PermanentAddress;

public class PermanentAddressDaoImpl extends BaseDaoImpl<PermanentAddress,Long> implements PermanentAddressDao {

    public PermanentAddressDaoImpl(){
        super(PermanentAddress.class,null);
    }

    @Inject
    public PermanentAddressDaoImpl(EntityManager entityManager){
        super(PermanentAddress.class,entityManager);
    }
}

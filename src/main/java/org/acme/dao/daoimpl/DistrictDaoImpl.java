package org.acme.dao.daoimpl;

import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.acme.dao.DistrictDao;
import org.acme.model.District;
import org.acme.model.Province;

import java.util.Collections;
import java.util.List;

public class DistrictDaoImpl extends BaseDaoImpl<District,Long>implements DistrictDao {

    public DistrictDaoImpl(){
        super(District.class,null);
    }

    @Inject
    public DistrictDaoImpl(EntityManager entityManager){
        super(District.class,entityManager);
    }


    @Override
    public List<District> districtList(Long id) {
        TypedQuery<District> query = entityManager.createQuery(
                "SELECT d FROM District d WHERE d.provinceId = :provinceId", District.class
        );
        query.setParameter("provinceId", id);
        return query.getResultList();
    }

}

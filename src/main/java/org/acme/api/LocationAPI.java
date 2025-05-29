package org.acme.api;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.acme.dao.DistrictDao;
import org.acme.dao.LocalLevelDao;
import org.acme.dao.ProvinceDao;
import org.acme.model.District;
import org.acme.model.LocalLevel;
import org.acme.model.Province;

import java.util.List;

@Path("/location")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class LocationAPI {

    @Inject
    private ProvinceDao provinceDao;

    @Inject
    private DistrictDao districtDao;

    @Inject
    private LocalLevelDao localLevelDao;

    @POST
    @Path("/province")
    public List<Province> provinces(){
        return provinceDao.findAll();
    }

    @POST
    @Path("/district/{id}")
    public List<District> districts(@PathParam("id") Long id){
        System.out.println(id);
        return districtDao.districtList(id);
    }

    @POST
    @Path("/locallevel/{id}")
    public List<LocalLevel> localLevel(@PathParam("id") Long id){
        return localLevelDao.localLevelList(id);
    }

}

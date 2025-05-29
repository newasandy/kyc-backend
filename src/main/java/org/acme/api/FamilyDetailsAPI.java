package org.acme.api;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.acme.dao.FamilyDetailsDao;
import org.acme.model.FamilyDetails;
import org.acme.model.IdentificationDetails;

@Path("/family")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FamilyDetailsAPI {
    @Inject
    private FamilyDetailsDao familyDetailsDao;

    @Path("/addEmploymentDetails")
    public Response addFamilyDetails(FamilyDetails familyDetails){
        if(familyDetailsDao.save(familyDetails)){
            return Response.status(Response.Status.CREATED).entity(familyDetails).build();
        }
        else{
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("Family details was not added")
                    .build();
        }
    }
}

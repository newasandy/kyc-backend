package org.acme.api;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.acme.dao.IdentificationDetailsDao;
import org.acme.model.Customer;
import org.acme.model.IdentificationDetails;

@Path("/identification")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class IdentificationDetailsAPI {

    @Inject
    private IdentificationDetailsDao identificationDetailsDao;

    @Path("/addIdentificationDetails")
    public Response addIdentificationDetails(IdentificationDetails identificationDetails){
        if(identificationDetailsDao.save(identificationDetails)){
            return Response.status(Response.Status.CREATED).entity(identificationDetails).build();
        }
        else{
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("Identification was not added")
                    .build();
        }
    }
}

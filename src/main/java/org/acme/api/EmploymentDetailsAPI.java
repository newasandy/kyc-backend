package org.acme.api;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.acme.dao.EmploymentDetailsDao;
import org.acme.model.EmploymentDetails;

@Path("/employment")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EmploymentDetailsAPI {

    @Inject
    private EmploymentDetailsDao employmentDetailsDao;

    @Path("/addEmploymentDetails")
    public Response addEmploymentDetails(EmploymentDetails employmentDetails){
        if(employmentDetailsDao.save(employmentDetails)){
            return Response.status(Response.Status.CREATED).entity(employmentDetails).build();
        }
        else{
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("Employment details was not added")
                    .build();
        }
    }
}

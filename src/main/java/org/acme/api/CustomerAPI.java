package org.acme.api;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.acme.dao.CustomerDao;
import org.acme.model.Customer;

@Path("/customer")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CustomerAPI {
    @Inject
    private CustomerDao customerDao;

    @POST
    @Path("/addPersonalInfo")
    public Response addPersonalInfo(Customer customer){
        if(customerDao.save(customer)){
            return Response.status(Response.Status.CREATED).entity(customer).build();
        }
        else{
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("Customer has been added")
                    .build();
        }
    }
}

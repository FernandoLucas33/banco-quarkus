package br.com.litebanco;

import br.com.litebanco.persistence.dao.PixDao;
import br.com.litebanco.persistence.models.Pix;
import jakarta.annotation.Resource;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.Provider;


@Path("/v1/pix")
public class PixResource {


    @Inject
    PixDao dao;

    @GET
    @Path("/{cpf}")
    public Response verificaChavePix(final@PathParam("cpf") String cpf){
        return Response.status(Response.Status.OK).entity(dao.verificaChavePix(cpf)).build();
    }

    @POST
    public Response inseriPix(Pix pix){
        return Response.status(Response.Status.CREATED).entity(dao.inserPix(pix)).build();
    }
    
}

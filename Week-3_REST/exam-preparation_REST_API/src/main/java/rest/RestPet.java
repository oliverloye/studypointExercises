/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import com.google.gson.Gson;
import facade.FacadePet;
import javax.persistence.Persistence;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Oliver
 */
@Path("pet")
public class RestPet {
    
    private FacadePet fp;
    private Gson gson;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public RestPet() {
        fp = new FacadePet();
        fp.addEntityManagerFactory(Persistence.createEntityManagerFactory("PU"));
        gson = new Gson();
    }

    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/all")
    public String getPets() {
        return new Gson().toJson(fp.getPets());
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of RestPet
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}

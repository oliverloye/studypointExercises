/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import com.google.gson.Gson;
import entity.Person;
import entity.Personn;
import facade.FacadePerson;
import javax.persistence.Persistence;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Oliver
 */
@Path("person")
public class RestPerson {
    
    private FacadePerson fp;
    private Gson gson;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of RestPerson
     */
    public RestPerson() {
        fp = new FacadePerson();
        fp.addEntityManagerFactory(Persistence.createEntityManagerFactory("PU"));
        gson = new Gson();
    }

    /**
     * Retrieves representation of an instance of rest.RestPerson
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        return "hej";
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/all")
    public String getPersons() {
        return new Gson().toJson(fp.getPersons());
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public String getPerson(@PathParam("id") Long id) {
        Personn p = fp.getPerson(id);
        if(p != null) {
            return new Gson().toJson(p);
        }
        return "{}";
    }

    /**
     * PUT method for updating or creating an instance of RestPerson
     * @param content representation for the resource
     */
    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public String putJson(String content, @PathParam("id") int id) {
        System.out.println(content);
        System.out.println(id);

        System.out.println(context.getQueryParameters().toString());

        
        return "{\"MESSAGE\":\"PUT\"}";
    }
    
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public String deletePerson(@PathParam("id") Long id) {
        Personn p = fp.deletePerson(id);
        
        return new Gson().toJson(p);
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String postJson(String content) {
        //From json to  java object
        Personn p = new Gson().fromJson(content, Personn.class);
        
        System.out.println(p);
        System.out.println(p.getlName());
        fp.addPerson(p);
        
        //From java object to json
        return new Gson().toJson(p);
    }
    
}

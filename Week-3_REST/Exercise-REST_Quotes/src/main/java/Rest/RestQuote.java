/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rest;

import Entity.Quote;
import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
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
@Path("quote")
public class RestQuote {

    @Context
    private UriInfo context;

    private static Map<Integer,String> quotes = new HashMap() {
        {
        put(1, "Friends are kisses blown to us by angels");
        put(2, "Do not take life too seriously. You will never get out of it alive");
        put(3, "Behind every great man, is a woman rolling her eyes");
        }
    };

    
    public RestQuote() {
    }

    @Path("{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson(@PathParam("id") int id) {
     
        String quote = quotes.get(id);
        
        return "{\"quote\": \"" + quote + "\"}";
    }
    
    @Path("random")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJsonRandom() {
        int randomNum = ThreadLocalRandom.current().nextInt(1, 3 + 1);
        String randomQuoteById = quotes.get(randomNum);
        return "{\"quote\": \"" + randomQuoteById + "\"}";
    }

    @Path("{id}")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String putJson(String content, @PathParam("id") int id, @DefaultValue("quote") @QueryParam("quote") String quoteText) {
        Quote q1 = new Gson().fromJson(content, Quote.class);
        
        System.out.println(q1);
        
        return new Gson().toJson(q1);
        
    }
    
}

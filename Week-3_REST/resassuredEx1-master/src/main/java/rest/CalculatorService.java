package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import calc.Calculator;
import dto.CalculationResult;

/**
 * REST Web Service
 *
 * @author lam
 */
@Path("calculator")
public class CalculatorService {

  private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
  private static final Calculator calc = new Calculator();
  @Context
  private UriInfo context;

  /**
   * Creates a new instance of CalculatorService
   */
  public CalculatorService() {
  }

  @Path("add/{n1}/{n2}")
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public String add(@PathParam("n1") String n1Str, @PathParam("n2") String n2Str) {
    int n1 = Integer.parseInt(n1Str);
    int n2 = Integer.parseInt(n2Str);
    CalculationResult result = new CalculationResult(String.format("%s + %s", n1, n2), calc.add(n1, n2));
    return gson.toJson(result);
  }

  @Path("sub/{n1}/{n2}")
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public String sub(@PathParam("n1") int n1, @PathParam("n2") int n2) {
    CalculationResult result = new CalculationResult(String.format("%s - %s", n1, n2), calc.sub(n1, n2));
    return gson.toJson(result);
  }
  @Path("mul/{n1}/{n2}")
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public String mul(@PathParam("n1") int n1, @PathParam("n2") int n2) {
    CalculationResult result = new CalculationResult(String.format("%s * %s", n1, n2), calc.mul(n1, n2));
    return gson.toJson(result);
  }
  
  @Path("div/{n1}/{n2}")
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public String div(@PathParam("n1") int n1, @PathParam("n2") int n2) {
    CalculationResult result = new CalculationResult(String.format("%s / %s", n1, n2), calc.div(n1, n2));
    return gson.toJson(result);
  }

}

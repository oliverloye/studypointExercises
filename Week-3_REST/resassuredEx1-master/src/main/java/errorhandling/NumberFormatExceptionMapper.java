package errorhandling;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javax.servlet.ServletContext;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import org.glassfish.jersey.server.ParamException.PathParamException;

@Provider
public class NumberFormatExceptionMapper implements ExceptionMapper<NumberFormatException> {
    static Gson gson = new GsonBuilder().setPrettyPrinting().create();
    @Context 
    ServletContext context;
    
    @Override
    public Response toResponse(NumberFormatException ex) {
      String msg = "Illegal parameters, "+ex.getMessage();
       ErrorMessage err = new ErrorMessage(msg,400);
       return Response.status(400)
				.entity(gson.toJson(err))
				.type(MediaType.APPLICATION_JSON).
				build();
	}
}
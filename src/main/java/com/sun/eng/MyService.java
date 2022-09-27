package com.sun.eng;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.QueryParam;
import org.example.MyApp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/service")
public class MyService {
  private static final Logger logger = (Logger) LoggerFactory.getLogger(MyApp.class);
  @Inject
  private MessageServices messageServices;
  @GET
  @Path("/azure")
  @Produces(MediaType.TEXT_PLAIN)
  public String helloAzure()
  {
    return "response";
  }

  @GET
  @Path("/aws")
  @Produces(MediaType.TEXT_PLAIN)
  public String helloAwa()
  {
    return "hello aws";
  }
  @GET
  @Path("/sol")
  @Produces(MediaType.TEXT_PLAIN)
  public int curiosityDateDateConversion(@QueryParam("date") String date)
  {
    logger.info("Example log from "+  MyService.class.getSimpleName() +" class, get method : convertCuriositySol()");
    return messageServices.curiosityDateDateConversion(date);
  }
}



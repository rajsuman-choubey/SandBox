package com.sun.eng;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
@Path("/service")
public class MyService {
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
}



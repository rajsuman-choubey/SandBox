package org.example;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Path("/hello")
public class MyResource {
  private static final Logger logger  = (Logger) LoggerFactory.getLogger(MyResource.class);

  public String hellaws()
  {
    logger.info("MyResource log from {}"+MyResource.class.getSimpleName()+ hellaws() );
    return "Hello";
  }
  @Inject
  private MessageService msgService;

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  @Path("/healthz")
  public String helloAzure()

  {
    //Logs every request with SLF4J
    logger.info("MyResource log from {}"+MyResource.class.getSimpleName()+helloAzure() );
    return "hello";
  }
  @GET
  @Produces(MediaType.TEXT_PLAIN)
  @Path("/printhello")
  public String getInfo()
  {
    //Logs every request with SLF4J
    logger.info("MyResource log from {}"+MyResource.class.getSimpleName());
    return msgService.getHello();
  }
}

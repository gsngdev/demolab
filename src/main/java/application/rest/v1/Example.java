package application.rest.v1;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import java.net.UnknownHostException;
import java.util.ArrayList;


@Path("hello")
public class Example {


    @GET
    public String greet() throws UnknownHostException {
        return "Hello from"+ java.net.InetAddress.getLocalHost().getHostName();
    }
}

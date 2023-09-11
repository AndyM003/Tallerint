package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hola")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hola() {
        return "hola a todos esta es mi primera API NASHEEEEEEEEEEE";
    }
}

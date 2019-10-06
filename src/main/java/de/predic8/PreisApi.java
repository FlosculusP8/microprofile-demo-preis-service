package de.predic8;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.Random;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/preis")
@RequestScoped
public class PreisApi {

    @GET
    @Path("/{artikel}")
    @Produces(APPLICATION_JSON)
    public Preis get( @PathParam("artikel") String  artikel) {
        System.out.println("get = " + artikel);

        if (new Random().nextInt(3) == 2)
            throw new RuntimeException("Fehler");

        switch (artikel) {
            case "Kaffee" : return new Preis(2.40);
            case "Tee" : return new Preis(1.80);
            case "Wasser" : return new Preis(2.50);
        }

        throw new RuntimeException("Not Found");
    }

}

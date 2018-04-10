
import javax.ejb.Stateless;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author entrar
 */

@Stateless
@Path("/product")

public class ProductResource {
    
    static Product product;
    
    @GET
    @Produces({"application/json", "application/xml"})
    public Product leer(){
        return product;
    }
    
    @POST
    @Consumes({"application/xml", "application/json"})
    public Response guardar (Product p){
        product = p;
        return Response.ok(p).build();
    }
}

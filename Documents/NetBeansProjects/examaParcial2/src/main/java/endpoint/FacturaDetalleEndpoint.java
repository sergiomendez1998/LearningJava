/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package endpoint;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import servidor.FacturaDetalleServidor;

/**
 *
 * @author Sergio_Mendez_G
 */

@Path("/facturaDetalles")
public class FacturaDetalleEndpoint {
    
       
    @Inject
    private FacturaDetalleServidor facturaDetalleServicio;

     
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response findFacturaDetalles() {
        var facturaDetalleList = this.facturaDetalleServicio.findFacturaDetalle();
        return Response.ok(facturaDetalleList).build();
    }
    
}

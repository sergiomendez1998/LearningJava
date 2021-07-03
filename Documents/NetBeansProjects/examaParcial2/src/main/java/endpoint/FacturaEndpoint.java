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
import servidor.FacturaServidor;

/**
 *
 * @author Sergio_Mendez_G
 */
@Path("/factura")
public class FacturaEndpoint {

    @Inject
    private FacturaServidor facturaServicio;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response findFacturaDetalles() {
        var facturaList = this.facturaServicio.findFacturas();
        return Response.ok(facturaList).build();
    }

}

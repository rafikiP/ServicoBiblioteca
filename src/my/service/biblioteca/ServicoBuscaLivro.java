package my.service.biblioteca;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
 
@Path("/busca")
public class ServicoBuscaLivro {
 
	@GET
	@Path("/{param}")
	public Response buscarLivro(@PathParam("param") String msg) {
 
		String output = "Jersey say : " + msg;
 
		return Response.status(200).entity(output).build();
 
	}
 
}
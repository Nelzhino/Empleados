/**
 * 
 */
package co.com.pruebas.ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import co.com.pruebas.model.Empleado;
import co.com.pruebas.service.EmpleadoService;

/**
 * @author zymat
 * @description Proyecto basico 
 *
 */

@Path("/Search")
public class ServiceRestWS {
	
	@POST
	@Path("/Empleados")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public List<Empleado> getInformation(){	
		
		List<Empleado> empleados = 
				new EmpleadoService().findAllEmpleados();
		return empleados;
	}
	
}

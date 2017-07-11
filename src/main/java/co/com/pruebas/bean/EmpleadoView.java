/**
 * 
 */
package co.com.pruebas.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;

import co.com.pruebas.model.Empleado;
import co.com.pruebas.ws.ClientService;

/**
 * @author zymat
 *
 */

@ManagedBean
public class EmpleadoView {

	private List<Empleado> empleados;

	private String message = " - ZYMATEC";

	/**
	 * 
	 * @return
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * 
	 * @param message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the empleados
	 */
	public List<Empleado> getEmpleados() {
		ClientService clientService = new ClientService();
		return clientService.getEmpleadosAll();
	}

	/**
	 * @param empleados
	 *            the empleados to set
	 */
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

}

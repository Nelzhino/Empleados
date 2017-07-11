package co.com.pruebas.service;

import org.hibernate.Session;

import java.util.List;

import co.com.pruebas.model.Empleado;
import co.com.pruebas.utils.HibernateUtil;

public class EmpleadoService {

	private Session session;

	/**
	 * Contructor
	 */
	public EmpleadoService() {
		session = HibernateUtil.getSessionFactory().openSession();
	}

	/**
	 * 
	 * @return Get all Employees
	 */
	@SuppressWarnings("unchecked")
	public List<Empleado> findAllEmpleados(){
		return this.session.createCriteria(Empleado.class).list();
	}

}

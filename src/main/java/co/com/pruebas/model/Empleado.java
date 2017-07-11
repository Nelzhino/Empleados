package co.com.pruebas.model;

public class Empleado {
	private Integer id;
	private String nombre;
	private String apellido;
	private Integer salario;
	
	
	
	
	/**
	 * 
	 */
	public Empleado() {
		
	}

	/**
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param salario
	 */
	public Empleado(int id, String nombre, String apellido, int salario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
	}


	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}


	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	/**
	 * @return the salario
	 */
	public int getSalario() {
		return salario;
	}


	/**
	 * @param salario the salario to set
	 */
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	
	
	
	

}

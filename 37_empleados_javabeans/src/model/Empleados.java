package model;

public class Empleados {
	private int codigo;
	private String nombre;
	private String email;
	private int edad;
	
	//Contructor
	public Empleados(int codigo,String nombre, String email, int edad) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.email = email;
		this.edad = edad;
		
	}

	//getter y setter
	public Empleados() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	
}

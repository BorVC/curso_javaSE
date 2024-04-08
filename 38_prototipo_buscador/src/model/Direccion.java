package model;

public class Direccion {

	public String url;
	public String tematica;
	public String direccion;
	
	//Constructor
	public Direccion(String url, String tematica, String direccion) {
		super();
		this.url = url;
		this.tematica = tematica;
		this.direccion = direccion;
		
	}

	//GETTER Y SETTER
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTematica() {
		return tematica;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
	
	
	
}

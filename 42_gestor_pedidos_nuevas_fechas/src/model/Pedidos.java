package model;

import java.time.LocalDate;
import java.util.Date;

public class Pedidos {

	private String producto;
	private int unidades;
	private LocalDate fecha;
	public Pedidos(String producto, int unidades, LocalDate fecha) {
		super();
		this.producto = producto;
		this.unidades = unidades;
		this.fecha = fecha;
	}
	
	
	public Pedidos() {
		super();
	}


	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	
	
	
}

package service;

import java.util.Collection;
import java.util.HashMap;

import model.Empleados;

public class EmpleadosService {
	
	//HashMap se Integer (clave)Objeto calse Empleados(valor
	HashMap<Integer,Empleados>empleados = new HashMap<>();
	
	//Métodos
	//Nuevo empleado
	public boolean  nuevo(Empleados empleado) {
		if(!empleados.containsKey(empleado.getCodigo())) {
		empleados.put(empleado.getCodigo(),empleado);
		return true;
		}
		return false;
	}
	
	//Buscar empleado
	public Empleados buscar(int codigo) {	
		return empleados.get(codigo);
	}
	
	//Eliminar empleado
	public Empleados eliminar(int clave, String valor) {	
		return empleados.remove(clave);
	}
	
	//Mostrar nombre todos
	public Empleados [] mostrarEmpleados() {
		Collection<Empleados> datos = empleados.values();
		return datos.toArray(new Empleados[0]);//Se le pasa un array vacio q rellenará con los datos
	}
	

}

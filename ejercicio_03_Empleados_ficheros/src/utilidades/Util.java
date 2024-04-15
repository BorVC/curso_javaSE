package utilidades;

import model.Empleado;

public class Util {

	public static Empleado convertirCadenaAObjeto(String linea) {
		String [] info = linea.split(",");
		
		return new Empleado(Integer.parseInt(info[0]),info[1],info[2],Integer.parseInt(info[3]));
	}
	
	public static String convertirObjetoACadena(Empleado empleado) {
		return empleado.getCodigo() + "," + empleado.getNombre() + "," + empleado.getEmail() + "," + empleado.getEdad();
	}
}

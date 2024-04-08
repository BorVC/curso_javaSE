package principal;

import java.util.Arrays;

public class FacturacionDepartamento1 {

	public static void main(String[] args) {
		// String con los datos
		String facturacion="ventas-20800,administracion-17900,informatica-35000,RRHH-10350";
		//Array con los datos 
		String arrayFacturacion [] = facturacion.split(",");
		//Array guardará departamentos ordenados por facturación
		String departamentos [] = new String[arrayFacturacion.length];
		//Variable guarda cada departamento y su facturación para registrar en array
		String departamento = "";

		
		System.out.println("DEPARTAMENTOS ORDENADOS POR FACTURACIÓN : ");
		for(int cantidad : cantidadesFacturacion(arrayFacturacion)) {
			//System.out.println(cantidad);
			System.out.println(departamentos(arrayFacturacion,cantidad));
			departamento = departamentos(arrayFacturacion,cantidad);
			//Bucle guarda cada departamento en array departamentos
			for(int i = 0; i < arrayFacturacion.length; i++) {
				departamentos[i] = departamento;
			}
		}
	
		System.out.println("DEPARTAMENTO QUE MÁS HA FACTURADO: " + departamentos[departamentos.length -1]);

	}
	
	//FUNCIÓN 1 devuelve array con importes facturación
	static int [] cantidadesFacturacion (String datosFacturacion []) {
		//Array guarda las cantidades facturadas
		int arrayCantidades [] = new int [datosFacturacion.length];
		//Variable guarda la cantidad
		int cantidad = 0;
		
		//Bucle recorre el array pasado por parámetro
		for(int i = 0; i < datosFacturacion.length; i++) {
			cantidad = Integer.parseInt(datosFacturacion[i].substring(datosFacturacion[i].indexOf("-") + 1,datosFacturacion[i].length()));
			//Guardamos cantidad extrida de la cadena en el arrayCantidades
			arrayCantidades [i] = cantidad;
		}
		//Ordenamos el array de menor a mayor
		Arrays.sort(arrayCantidades);
		
		return arrayCantidades;
	}
	
	//FUNCIÓN 2.devuelve array con  los departamentos ordenados
	static String departamentos(String datosFacturacion [],int cantidad) {
		//Pasar a String la cantidad de facturación
		String cantidadText = Integer.toString(cantidad);
		//Variable guarda departamento
		  String depar = "";
		//Array guarda departamento por cantidad de facturación
		/*String depar []  = new String[datosFacturacion.length];
		for(int i = 0; i < datosFacturacion.length; i++) {
			if(datosFacturacion[i].endsWith(cantidadText)) {
				depar[i] = datosFacturacion[i];
			}
		}*/
		
		for(String departamento : datosFacturacion) {
			if(departamento.endsWith(cantidadText)) {
				depar = departamento;
			}
		}
		return depar;
	}

}

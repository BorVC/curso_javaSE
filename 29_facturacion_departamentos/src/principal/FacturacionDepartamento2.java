package principal;

import java.util.Arrays;

public class FacturacionDepartamento2 {

	public static void main(String[] args) {
		// String con los datos
				String facturacion="ventas-20800,administracion-17900,informatica-35000,RRHH-10350";
				//Llamada a la función 
				System.out.println(mostrarInfo(facturacion));

			}
			
			//Método para ver información a partir del String
			static String mostrarInfo (String info) {
				//Array con departamantos  y facturación a partir de String (desordenados)
				String arrayInfoFacturacion [] = info.split(",");
				//Array donde guardar facturación
				int arrayFacturacion [] = new int [arrayInfoFacturacion.length];
				//Array guarda departamentos ordenados por facturación
				String arrayDepartamentos [] = new String [arrayInfoFacturacion.length];
				//Variable guarda importe facturación
				int facturacion = 0;
				//Variable guarda como texto importes
				String facturacionString = "";
				//Objeto StrinBuider en el iremos guardando la información extraida con los departamentos oredenados por facturación de > a <
				StringBuilder departamentosFactu = new StringBuilder();
				//Variable contador
				int x = 0;
				
				//Bucle recorre 'arrayInfoFacturacion' para extraer y guardar la facturación de cada departamento en 'arrayFacturacion'
				for(int i = 0; i < arrayInfoFacturacion.length; i++) {
					facturacion = Integer.parseInt(arrayInfoFacturacion[i].substring(arrayInfoFacturacion[i].indexOf("-") + 1,arrayInfoFacturacion[i].length()));
					arrayFacturacion[i] = facturacion;
				}
				//Ordenar 'arrayFacturacion' de menor a mayor
				Arrays.sort(arrayFacturacion);
				
				//Bucle recorre 'arrayFacturacion' para ir sacando cada importe de facturación de > a <
				for(int importe : arrayFacturacion) {
					facturacionString = Integer.toString(importe);
					//Bucle anidado recorre 'arrayInfoFacturacion' buscando una coincidencia 
					for(String departamento : arrayInfoFacturacion) {
						if(departamento.endsWith(facturacionString)) {//Si el importe coincide
							departamentosFactu.append(departamento  + "\n");//Se añade departamento + facturación del 'arrayInfoFacturacion'al objeto StrinBuilder
							arrayDepartamentos[x] = departamento;//Añadimos departamento + facturación del 'arrayInfoFacturacion' al 'arrayDepartamentos'
							x++;
						}
					}
				}
				return "DEPARTAMENTOS: \n" + departamentosFactu.toString() + "DEPARTAMENTO CON MAYOR FACTURACIÓN: \n" + arrayDepartamentos[x-1];
				
			}
}

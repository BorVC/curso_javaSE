package service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

import model.Empleado;
import utilidades.Util;

public class EmpleadosService {

	//Fichero
	String fichero = "empleados.tx";
	
	//Métodos
	//Agregar nuevo empleado
	public void nuevoEmpleado(Empleado empleado) {
		try(FileOutputStream fos = new FileOutputStream(fichero,true);
		    PrintStream out = new PrintStream(fos)){
			
			out.println(Util.convertirObjetoACadena(empleado));
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	//Eliminar todos los empleados
	public void eliminarEmpleados() {
		File file = new File(fichero);
		file.delete();
	}
	
	//Buscar empleado
	public Empleado buscarEmpleado(int codigo) {
		Empleado emAux = new Empleado();
		try(FileReader fr = new FileReader(fichero);
		    BufferedReader bf = new BufferedReader(fr)){
			
			String linea;
			while((linea = bf.readLine()) != null) {
				Empleado em = Util.convertirCadenaAObjeto(linea);
				if(codigo == em.getCodigo()) {
					emAux = em;
				}
			}
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		return emAux;
	}
	
	//Mostrar todos los empleados
	public ArrayList <Empleado> verTodosEmpleados(){
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		try(FileReader fr = new FileReader(fichero);
			BufferedReader bf = new BufferedReader(fr)){
			
			String linea;
			while((linea = bf.readLine()) != null) {
				Empleado em = Util.convertirCadenaAObjeto(linea);
				empleados.add(em);		
			}
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		return empleados;
	}
	
}

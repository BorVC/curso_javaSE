package service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import model.Empleado;
import utilidades.Util;

public class EmpleadosService {

	//Fichero
	String fichero = "empleados.txt";
	
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
	
	//Eliminar empleado
	public void eliminarEmpleado(int codigo) {
		Path filePath = Paths.get(fichero);
	    if (!Files.exists(filePath)) {
	        try {
	            Files.createFile(filePath);        
	        } catch (IOException e) {
	            System.err.println("Error al crear el archivo: " + e.getMessage());
	        }
	    }
	    PrintStream out = null;
		ArrayList<Empleado> empleados = new ArrayList<>();
		try(FileReader fr = new FileReader(fichero);
			BufferedReader br = new BufferedReader(fr)){
			String linea;
			while((linea = br.readLine()) != null) {
				if(codigo != Util.convertirCadenaAObjeto(linea).getCodigo()) {
					empleados.add(Util.convertirCadenaAObjeto(linea));
				}
			}
			out = new PrintStream(fichero);
			for(Empleado em : empleados) {
				out.println(Util.convertirObjetoACadena(em));
			}
		}catch(IOException ex) {
			ex.printStackTrace();
		}finally {
            if (out != null) {
                out.close();
            }
		}
	}
	
	//Buscar empleado
	public Empleado buscarEmpleado(int codigo) {
	    Path filePath = Paths.get(fichero);
	    if (!Files.exists(filePath)) {
	        try {
	            Files.createFile(filePath);        
	        } catch (IOException e) {
	            System.err.println("Error al crear el archivo: " + e.getMessage());
	        }
	    }
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
		Path filePath = Paths.get(fichero);
	    if (!Files.exists(filePath)) {
	        try {
	            Files.createFile(filePath);        
	        } catch (IOException e) {
	            System.err.println("Error al crear el archivo: " + e.getMessage());
	        }
	    }
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

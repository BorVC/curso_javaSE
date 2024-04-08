package service;

import java.util.ArrayList;
import java.util.HashSet;

import model.Ciudades;

public class CiudadesService {

	//HashSet donde se guardarán las nuevas ciudades
	HashSet<Ciudades> ciudades = new HashSet<>();
	
	//Métodos
	//1- Agregar nueva ciudad al HashsSet como objeto Ciudades
	public boolean nuevaCiudad(Ciudades ciudad) {
		for(Ciudades ciu : ciudades) {
			if(ciu.getNombre().equals(ciudad.getNombre()) && ciu.getPais().equals(ciudad.getPais())) {
				return true;
			}
		}
		ciudades.add(ciudad);
		return false;
	}
	
	//2-Mostrar todos los datos de ciudad más poblada.Devuelve objet Ciudades con la info
	public Ciudades masPoblada() {
		//Objeto guarda la ciudad con mayor población
		Ciudades ciudadMasHabiatantes = null;
		//Iterar por el HashsSet comparando la pobación de las ciudades que guarda
		for(Ciudades ciudad : ciudades) {
			if(ciudad.getHabitantes() > ciudadMasHabiatantes.getHabitantes()) {
				//ciudadMasHabiatantes.setHabitantes(ciudad.getHabitantes());
				ciudadMasHabiatantes = ciudad;
			}
		}
		return ciudadMasHabiatantes;
	}
	
	//3-Mostrar las ciudades pertenecientes a un determinado país y guardar en un ArrayList
	public ArrayList <Ciudades> ciudadesPorPais(String pais){
		//ArrayList deonde guardar las ciudades del país buscado
		ArrayList<Ciudades> ciudadesPais = new ArrayList<>();
		//Iterar por el HashsSet y hasta encontrar el país buscado y guardar en el ArrayList las ciudades 
		for(Ciudades ciudad : ciudades) {
			if(ciudad.getPais().contains(pais)) {
				ciudadesPais.add(ciudad);
			}
		}
		return ciudadesPais;
		
	}
	
	
}

package service;

import java.util.HashSet;

import model.Direccion;

public class BuscadorService {
	
	HashSet <Direccion> direcciones = new HashSet<Direccion>();	
	public BuscadorService() {
		direcciones.add(new Direccion("http://www.amazon.es/", "libros", "web de libros y más cosas"));
		direcciones.add(new Direccion("http://www.fnac.es/", "", "libreria completa"));
		direcciones.add(new Direccion("http://www.travel.es/", "viajes", "viajes por el mundo"));
		direcciones.add(new Direccion("http://www.game.es/", "juegos", "el mundo del juego"));
		direcciones.add(new Direccion("http://www.fly.com/", "viajes", "vuelos a todos los destinos"));
		direcciones.add(new Direccion("http://www.casadellibro.es/", "libros", "libros de todos los temas"));
	}
	
	//Método q a partir de una temática devuelva un subconjunto con las direcciones asociadas a dicha temática
	
	public HashSet<Direccion> buscarTematica(String tematica){
		//HashShet
		HashSet <Direccion> direccion = new HashSet <Direccion>();
		for(Direccion dir : direcciones) {
			if(dir.getTematica().equals(tematica)) {
				direccion.add(dir);
			}
		}
		return direccion;
	}

}

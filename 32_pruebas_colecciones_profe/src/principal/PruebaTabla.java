package principal;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class PruebaTabla {

	public static void main(String[] args) {
		HashMap<String,Integer> ciudades= new HashMap<String,Integer>();
		//Introducir elementos en HashMap
		ciudades.put("Madrid", 3200000);
		ciudades.put("Barcelona", 3000000);
		ciudades.put("Caceres",1299000);
		ciudades.put("Madri", 333300);
		//Mostrar un elemento
		System.out.println(ciudades.get("Madrid"));
		
		//Recorrer un HashMap
		//por clave
		Set<String> claves = ciudades.keySet();
		for (String clave : claves) {
			System.out.println("Claves: " + clave);
		}
		//por valor
		Collection<Integer>valores = ciudades.values();
		for(Integer valor : valores) {
			System.out.println("Valores: " + valor);
		}
	}

}

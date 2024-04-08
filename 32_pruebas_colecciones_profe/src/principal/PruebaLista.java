package principal;

import java.util.ArrayList;

public class PruebaLista {

	public static void main(String[] args) {
		//Creación de objetos de la colección Arraylist
		ArrayList<String> cadenas = new ArrayList<>();
		ArrayList<Integer> numeros = new ArrayList<>();
		var decimales = new ArrayList <Double>();
		
		//Conocer el tamaño del ArrayList
		System.out.println(cadenas.size());//Es 0 puesto q no hay ningún elemento o valor.Crece dinámicamente
		//Añadir elementos bocupan posiciones correlativas sin ocupar
		cadenas.add("Lunes");
		cadenas.add("Martes");
		//Añadir en una posición específica
		cadenas.add(0, "Miercoles");
		//Leer contenido de una posición
		System.out.println(cadenas.get(0));
		
		numeros.add(35);
		numeros.add(numeros.get(0));//La posición 0 del ArrayList apunta a la misma dirección de memoria que la posición 0
		//Sustituye elemento en una posición
		numeros.set(0, 100);//Cambia el objeto de la posición 0,pero el de la posición 1 no.
		System.out.println(numeros.get(1));//35
		//Elimian un elemento reorganizando el resto de los que hay en el ArrayList
		cadenas.remove(1);//Elimina el Lunes y Martes pasará a esa posición 
		//Recorrer ArryList
		for(String dia : cadenas) {
			System.out.println(dia);
		}
		
		for(int i = 0 ; i < numeros.size();i++) {
			System.out.println(numeros.get(i));
		}
		
		//Si el elemento se encuentra en el ArrayList
		System.out.println(cadenas.contains("Lunes"));
		System.out.println(cadenas.size());
		
		
	}

}

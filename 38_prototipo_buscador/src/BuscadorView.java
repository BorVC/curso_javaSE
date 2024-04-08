import java.util.HashSet;
import java.util.Scanner;

import model.Direccion;
import service.BuscadorService;

public class BuscadorView {

	public static void main(String[] args) {
		//Objeto Scanner
		Scanner scn  = new Scanner(System.in);
		
		System.out.println("Introduce una temática");
		String tematica = scn.nextLine();
		//Objeto clase BuscadorService para llamar a sus métodos
		BuscadorService service = new BuscadorService();
		//HashSet q guarda el q devuelve el método 'buscartematica'
		HashSet <Direccion> direcciones = service.buscarTematica(tematica);
		//Recorrer el HashSet q devuelve el método 
		for(Direccion direccion : direcciones) {
			System.out.println("URL: " + direccion.getDireccion());
			System.out.println("Descripción: " + direccion.getTematica());
			System.out.println("-------------------");
		}

	}

}

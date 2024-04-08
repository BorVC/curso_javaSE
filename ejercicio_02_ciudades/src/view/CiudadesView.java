package view;

import java.util.Scanner;

import model.Ciudades;
import service.CiudadesService;

public class CiudadesView {

	//Objetos
	//Objeto Ciudades
	//static Ciudades ciudad = new Ciudades();
	//Objeto HashsSet
	static CiudadesService service = new CiudadesService();
	public static void main(String[] args) {
		//Objeto Scanner
		Scanner scn = new Scanner(System.in);
		//Variable guarda la opción del usuario
		int opcion;
		
		//Mostrar menú y gestionar las diferentes opciones
		do {
			mostrarMenu();
			opcion = scn.nextInt();
			switch(opcion) {
			case 1:
				añadirCiudad();
			break;
			case 2:
				ciudadMayorPoblacion();
			break;
			case 3:
				buscarPorPais();
			break;
			case 4:
				System.out.println("Hata luego!!!!");
			break;
			default:
				System.out.println("No existe la opción elegida. Elige una de las oopciones del menú");
			}
		}while(opcion != 4);
		

	}
	
	//Funciones
	static void  mostrarMenu() {
		System.out.println("""
				Selecciona una de las opciones del menú:
				1- Nueva ciudad
				2- Ciudad más poblada
				3- Buscar por país
				4- Salir
				""");
	}
	
	//1- Nueva ciudad
	static void añadirCiudad() {
		//Objeto Scanner
		Scanner scn = new Scanner(System.in);
		System.out.println("Nombre de la ciudad:");
		String nombre = scn.nextLine();
		System.out.println("Habitantes de la ciudad:");
		int habitantes = Integer.parseInt(scn.nextLine());
		System.out.println("País de la ciudad:");
		String pais = scn.nextLine();
		//Objeto ciudad con los datos recopilados
		Ciudades ciudad = new Ciudades(nombre,habitantes,pais);
		//Llamada a la función de la clase CiudadesService
		if(!service.nuevaCiudad(ciudad)){
			System.out.println("Hecho!!!Ciudad guardada correctamente");
		}
		else {
			System.out.println("Error!!!.La ciudad introducida ya corresponde a un país");
		}
	}
	
	//2- Ciudad más poblada
	static void ciudadMayorPoblacion() {
		//Llamada a la función de la clase CiudadesService genera objeto Ciudades
		System.out.println(service.masPoblada().getNombre());
	}
	
	//3- Buscar país
	static void buscarPorPais() {
		//Objeto Scanner
		Scanner scn = new Scanner(System.in);
		System.out.println("Introduce el país del que quieres conocer sus ciudades:");
		String pais = scn.nextLine();
		//Iterar Array que devuelve llamada al método de la clase CiudadesService
		for(Ciudades ciudad : service.ciudadesPorPais(pais)) {
			System.out.println("Ciudad: "+ ciudad.getNombre());
			System.out.println("-------------");
		}
		System.out.println(service.ciudadesPorPais(pais).size());
	}

}

package view;

import java.util.Arrays;
import java.util.Scanner;

import service.NotasService;
public class NotaMenu {
	//Variable clase NotasService q comparten todos los metodos por eso esta fuera
	static NotasService service = new NotasService();

	public static void main(String[] args) {
		//Objeto scanner
		Scanner scn = new Scanner(System.in);
		//Variable q guarda la opción escogida
		int opcion;
		//Estructura 
		do {
			//Presentar menú
			presentarMenu();
			//leer opción y comprobar opción			
			opcion = scn.nextInt();
			
			//switch q recorre las opcions del menu
			switch(opcion) {
			case 1:
				agregarNota();
			break;
			case 2:
				calcularMedia();
			break;
			case 3:
				mostrarExtremas();
			break;
			case 4: 
				obtenerNotas();
			break;
			case 5 : 
				System.out.println("Hasta pronto!!!");
			break;
			default:
				System.out.println("La opción elegida es incorrecta");
			break;
			}
		}while(opcion != 5);//Si la opcion es distinta a culaquiera de las opcionales

	}
	
	//Método presaentar menú
	static void presentarMenu() {
		//Objeto scanner
		Scanner scn = new Scanner(System.in);
		//Variable q guarda la opción escogida
		int opcion = 0;
		String textoMenu = """
				           Utiliza las suiguientes opciones:
                           1- Agrege una nota.
                           2- Calcula nota media.
                           3- Mostrar extremas.
                           4- Obtener notas.
                           5- Salir                             
                           """;
		System.out.println(textoMenu);
	}
	
	static void agregarNota() {
		double nota;
		//Objeto scanner
		Scanner scn = new Scanner(System.in);
		System.out.println("Introduce nota");
		nota = scn.nextDouble();
		service.agregarNota(nota);
	}
	
	static void calcularMedia() {
		System.out.println("Nota media " + service.calcularMedia());
	}
	
	static void mostrarExtremas() {		
		System.out.println("Nota min: " + service.notaMin());
		System.out.println("Nota max: " + service.notaMax());
	}
	
	static void obtenerNotas() {
		Double []notas = service.obtenerNotas();
		System.out.println("las notas son : ");
		for(double nota : notas) {
			System.out.println(nota);;
		}
		
		System.out.println("Las notas son:"+Arrays.toString(service.obtenerNotas()));
	}

}

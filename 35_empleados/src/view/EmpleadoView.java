package view;

import java.util.Arrays;
import java.util.Scanner;

import service.EmpleadosService;

public class EmpleadoView {
	static EmpleadosService service = new EmpleadosService();
	public static void main(String[] args) {
		//Objeto Scanner
		Scanner scn = new Scanner(System.in);
		//Variable guarda la opción elegida
		int opcion;
		
		do {
			//Lamada al método q muestra el menu
			presentarMenu();
			//leer opción y comprobar opción			
			opcion = scn.nextInt();
			
			//switch q recorre las opcions del menu
			switch(opcion) {
			case 1:
				agregarEmpleado();
			break;
			case 2:
				buscarEmpleado();
			break;
			case 3:
				eliminarEmpleados();
			break;
			case 4: 
				mostrarEmpleados();
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
	                           1- Agrege empleado .
	                           2- Buscar empleado.
	                           3- Eliminar empleado.
	                           4- Obtener empleados.
	                           5- Salir                             
	                           """;
			System.out.println(textoMenu);
		}
		
		static void agregarEmpleado() {
			Scanner scn = new Scanner(System.in);
			System.out.println("Código empleado:");
			int codigo = Integer.parseInt(scn.nextLine());
			System.out.println("Nombre empleado:");
			String nombre= scn.nextLine();
			
			if(service.nuevo(codigo, nombre)) {
				System.out.println("Añadido");
			}else {
				System.out.println("Código existente.No añadido!");
			}
		}
		
		static void buscarEmpleado() {
			Scanner scn = new Scanner(System.in);
			System.out.println("Introduce el código del empleado");
			int codigo = Integer.parseInt(scn.nextLine());
			String empleado = service.buscar(codigo);
			if(empleado == null) {
				System.out.println("No existe empleado");
			}else {
				System.out.println("El empleado buscado es : " + empleado);
			}
		}
		
		static void eliminarEmpleados() {
			Scanner scn = new Scanner(System.in);
			System.out.println("Introduce el código del empleado");
			int codigo = Integer.parseInt(scn.nextLine());
     		String empleado = service.eliminar(codigo);
			if(empleado == null) {
				System.out.println("ERROR.No existe empleado");
			}else {
				System.out.println("El empleado eliminado es : " + empleado);
			}
		}
		
		static void mostrarEmpleados() {
			System.out.println(Arrays.toString(service.mostrarEmpleados()));
		}
		
	

}

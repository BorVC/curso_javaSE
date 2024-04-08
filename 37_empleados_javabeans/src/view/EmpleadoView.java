package view;

import java.util.Arrays;
import java.util.Scanner;

import model.Empleados;
import service.EmpleadosService;

public class EmpleadoView {
	static EmpleadosService service = new EmpleadosService();
	public static void main(String[] args) {
		//Objeto Scanner
		Scanner scn = new Scanner(System.in);
		//variable guarda la opción elegida
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
			System.out.println("Código:");
			int codigo = Integer.parseInt(scn.nextLine());
			System.out.println("Nombre:");
			String nombre= scn.nextLine();
			System.out.println("Email:");
			String email= scn.nextLine();
			System.out.println("Edad:");
			int edad = Integer.parseInt(scn.nextLine());
			//Objeto clase empleado
			Empleados  empleado = new Empleados(codigo,nombre,email,edad);		
			if(service.nuevo(empleado)) {
				System.out.println("Hecho");
			}else {
				System.out.println("Código existente.No añadido!");
			}
		}
		
		static void buscarEmpleado() {
			Scanner scn = new Scanner(System.in);
			System.out.println("Introduce el código del empleado");
			int codigo = Integer.parseInt(scn.nextLine());
			Empleados empleado = service.buscar(codigo);
			if(empleado == null) {
				System.out.println("No existe empleado");
			}else {
				System.out.println("El empleado buscado es : " + empleado.getNombre());
			}
		}
		
		static void eliminarEmpleados() {
			Scanner scn = new Scanner(System.in);
			System.out.println("Introduce el código del empleado");
			int codigo = Integer.parseInt(scn.nextLine());
			System.out.println("Introduce un nombre");
			String nombre = scn.nextLine();
			Empleados empleado = service.eliminar(codigo,nombre);
			if(empleado == null) {
				System.out.println("No existe empleado");
			}else {
				System.out.println("El empleado eliminado es : " + empleado.getNombre());
			}
		}
		
		static void mostrarEmpleados() {
			//System.out.println(Arrays.toString(service.mostrarEmpleados()));
			Empleados[] empleados = service.mostrarEmpleados();
			for(Empleados empleado : empleados) {
				System.out.println("Nombre:" + empleado.getNombre() + " Edad:" + empleado.getEdad());
				
				
			}
		}
		
	

}

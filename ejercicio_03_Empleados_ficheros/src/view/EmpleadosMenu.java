package view;

import java.util.ArrayList;

import curso.io.LectorTeclado;
import model.Empleado;
import service.EmpleadosService;

public class EmpleadosMenu {
	//Objeto libreria externa lector de tecldo
	static LectorTeclado lector = new LectorTeclado();
	static EmpleadosService service = new EmpleadosService();
	public static void main(String[] args) {
		
		int opcion = 0;
		do {
			presentarMenu();
			try {
				opcion = lector.readInt();
				switch (opcion) {
				case 1:
					nuevo();
				break;
				case 2:
					buscar();
				break;
				case 3:
					eliminar();
				break;
				case 4: 
					eliminarTodos();
				break;
				case 5: 
					todos();
				break;
				case 6:
					System.out.println("Hasta pronto!!!");
				break;
				default:
					System.out.println("La opción seleccionada es incorrecta");
				}
			}catch(NumberFormatException ex) {
				System.out.println("Debe ser un valor numérico!!");
			}
		}while(opcion != 6);

	}
	
	//Métodos
	static void presentarMenu() {
		System.out.println("""
				   1- Agrege empleado .
       2- Buscar empleado.
       3- Eliminar un solo empleado.
       4- Eliminar todos los empleados.
       5- Obtener empleados.
       6- Salir  
				""");
	}
	
	static void nuevo() {
		System.out.println("Código:");
		int codigo = lector.readInt();
		System.out.println("Nombre");
		String nombre = lector.readString();
		System.out.println("Email:");
		String email = lector.readString();
		System.out.println("Edad:");
		int edad = lector.readInt();
		
		if(codigo != service.buscarEmpleado(codigo).getCodigo()) {
			Empleado empleado = new Empleado(codigo,nombre,email,edad);
			service.nuevoEmpleado(empleado);
			System.out.println("Empleado guardado con exito");
		}else {
			System.out.println("ERROR:El código de empleado que intenta introducir ya existe");
		}
	}
	
	static void buscar() {
		System.out.println("Código del empleado que deseas buscar");
		int codigo = lector.readInt();
		//service.buscarEmpleado(codigo);
		if(codigo == service.buscarEmpleado(codigo).getCodigo()) {
			System.out.println("Código: " + service.buscarEmpleado(codigo).getCodigo());
			System.out.println("Nombre: " + service.buscarEmpleado(codigo).getNombre());
			System.out.println("Email: " + service.buscarEmpleado(codigo).getEmail());
			System.out.println("Edad: " + service.buscarEmpleado(codigo).getEdad());
		}else {
			System.out.println("El código no existe");
		}
	}
	
	static void eliminar() {
		System.out.println("Código del empleado que deseas eliminar");
		int codigo = lector.readInt();
		if(codigo == service.buscarEmpleado(codigo).getCodigo()) {
			service.eliminarEmpleado(codigo);
			System.out.println("Empleado eliminado");
		}else {
			System.out.println("NO se puede eliminar empleado.Código no existe");
		}
		
	}
	
	static void eliminarTodos() {
		service.eliminarEmpleados();
		System.out.println("Se han eliminado todos los empelados con exito");
	}
	
	static void todos() {
		if(service.verTodosEmpleados().size() != 0) {
			for(Empleado empleado : service.verTodosEmpleados()) {
				System.out.println("Código: " + empleado.getCodigo());
				System.out.println("Nombre: " + empleado.getNombre());
				System.out.println("Email: " + empleado.getEmail());
				System.out.println("Edad: " + empleado.getEdad());
				System.out.println("-----------------------------");
			}
		}else {
			System.out.println("NO hay ningún empleado registrado aún");
		}
	}

}

package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import model.Pedidos;
import service.PedidosService;

public class PedidosView {

	static PedidosService service = new PedidosService();
	static Pedidos pedido = new Pedidos();
	public static void main(String[] args) throws ParseException {
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
				agregarPedido();
			break;
			case 2:
				pedidoUltimo();
			break;
			case 3:
				pedidoFechas();
			break;
			case 4: 
				System.out.println("Hasta pronto!!!");
			break;
			default:
				System.out.println("La opción elegida es incorrecta");
			break;
			}
		}while(opcion != 4);//Si la opcion es distinta a culaquiera de las opcionales

	}
	
	//Método presentar menú
	static void presentarMenu() {
		System.out.println("""
				1-Agrega un pedido.
				2-Ver pedido con fecha más alta.
				3-Pedidos entre fechas formato dd/mm/yyyy.
				4-Salir
				""");	
	}
	
	//Método agregar pedido
	static void agregarPedido() throws ParseException {
		//Onjeto Scanner
		Scanner scn = new Scanner(System.in);
		//Objet SimpleDateFormat
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		//Variables guardan dato para crear objet q se guarda en el HashSet
		System.out.println("Producto del pedido:");
		String producto = scn.nextLine();
		System.out.println("Unidades del pedido:");
		int unidades = Integer.parseInt(scn.nextLine());
		System.out.println("Fecha del pedido dd/MM/yyyy:");
		try {
		Date fecha = format.parse(scn.nextLine());//Pasar de cadena a fecha
		
		//Objeto clase Pedidos
		Pedidos pedido = new Pedidos(producto,unidades,fecha);
		service.nuevoPedido(pedido);
		}
		catch(ParseException ex) {
			ex.printStackTrace();
			System.out.println("Fecha no valida");
		}
	}
	
	static void pedidoUltimo() {
		pedido = service.pedidoReciente();//Objeto pedido q guarda el HashSet q recive de la función
		//Objet SimpleDateFormat
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Producto : " + pedido.getProducto());
		System.out.println("Unidades: " + pedido.getUnidades());
		System.out.println("fecha: " + format.format(pedido.getFecha()));
	}
	
	static void pedidoFechas() throws ParseException {
		//Onjeto Scanner
		Scanner scn = new Scanner(System.in);
		//Objet SimpleDateFormat
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Fecha primera dd/MM/yyyy:");
		Date fecha = format.parse(scn.nextLine());//Pasar de cadena a fecha
		System.out.println("Fecha segunda dd/MM/yyyy:");
		Date fecha2 = format.parse(scn.nextLine());//Pasar de cadena a fecha
		ArrayList<Pedidos> pedidos = service.pedidosFechas(fecha,fecha2);
		for(Pedidos pedido: pedidos) {
			System.out.println("Producto : " + pedido.getProducto());
			System.out.println("Unidades: " + pedido.getUnidades());
			System.out.println("fecha: " + format.format(pedido.getFecha()));
			System.out.println("---------------------");
			}
	}

}

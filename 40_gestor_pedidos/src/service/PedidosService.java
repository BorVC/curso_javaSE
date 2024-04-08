package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

import model.Pedidos;

public class PedidosService {

	/*Programa para manejar pedidos. Un pedido se caracteriza por producto,unidades,fechaPedido.
Se presenta el siguiente menú:
1.- Nuevo pedido
2.- Pedido más reciente
3.- Pedidos entre dos fechas
4.- Salir

2: Muestra los datos del pedido más reciente
3: Se solicitan dos fechas, y se muestran los pedidos realizados
en ese rango de fechas*/
	
	//HashsSet
	HashSet <Pedidos> pedidos= new HashSet <Pedidos>();
	
	public void  nuevoPedido(Pedidos pedido) {
		//Añadir al HashSet pedidos el objeto pedido generado
		pedidos.add(pedido);
	}
	
	public Pedidos pedidoReciente() {//Devuelve el objeto Pedidos con toda su información
		Pedidos pedidoAux = null;//Objeto Pedidos
		Date fechaMax = new Date(0);//1/1/1970//Inicializar al mas bajo
		for(Pedidos pedido : pedidos) {//Recorrer HashSet
			if(pedido.getFecha().after(fechaMax)) {
				//Actualizar la fecha y el pedido
				fechaMax = pedido.getFecha();
				pedidoAux = pedido;
			}
		}
		
		return pedidoAux;
	}
	
	public ArrayList<Pedidos> pedidosFechas(Date fecha1, Date fecha2) {//Devuelve un ArryList con los objetos Pedidos encontrados en la busqueda
		ArrayList<Pedidos> pedidos = new ArrayList<>();//Guarda los pedidos encontrados entre el rango de fechas
		for (Pedidos pedido: pedidos) {//Recorrer HashSet
			//Si la fecha del pedido es >= a fecha1 y fecha del pedido es <= fecha2
			if(pedido.getFecha().compareTo(fecha1) >= 0 && pedido.getFecha().compareTo(fecha2) <= 0){
				pedidos.add(pedido);
			}
		}
		return pedidos;//ArrayList
	}
}

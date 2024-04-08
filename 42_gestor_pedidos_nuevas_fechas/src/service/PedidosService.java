package service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashSet;

import model.Pedidos;

public class PedidosService {

	/*Programa para manejar pedidos. Un pedido se caracteriza por producto,unidades,fechaPedido.
Se presenta el siguiente menú:
1.- Nuevo pedido
2.- Pedido más reciente
3.- Pedidos entre dos fechas
4.- Pedido proximo a fecha
4.- Salir

2: Muestra los datos del pedido más reciente
3: Se solicitan dos fechas, y se muestran los pedidos realizados
4: Se solicita una fecha y nos muestra el pedido mas cercano a dicha fecha yyy
en ese rango de fechas*/

	//HashsSet
	HashSet <Pedidos> pedidos= new HashSet <>();

	public void  nuevoPedido(Pedidos pedido) {
		//Añadir al HashSet pedidos el objeto pedido generado
		pedidos.add(pedido);
	}

	public Pedidos pedidoReciente() {//Devuelve el objeto Pedidos con toda su información
		Pedidos pedidoAux = null;//Objeto Pedidos
		LocalDate fechaMax = LocalDate.of(0,1,1);//1/1/1970//Inicializar al mas bajo
		for(Pedidos pedido : pedidos) {//Recorrer HashSet
			if(pedido.getFecha().isAfter(fechaMax)) {
				//Actualizar la fecha y el pedido
				fechaMax = pedido.getFecha();
				pedidoAux = pedido;
			}
		}

		return pedidoAux;
	}

	public ArrayList<Pedidos> pedidosFechas(LocalDate fecha1, LocalDate fecha2) {//Devuelve un ArryList con los objetos Pedidos encontrados en la busqueda
		ArrayList<Pedidos> pedidos = new ArrayList<>();//Guarda los pedidos encontrados entre el rango de fechas
		for (Pedidos pedido: pedidos) {//Recorrer HashSet
			//Si la fecha del pedido es >= a fecha1 y fecha del pedido es <= fecha2
			if(pedido.getFecha().compareTo(fecha1) >= 0 && pedido.getFecha().compareTo(fecha2) <= 0){
				pedidos.add(pedido);
			}
		}
		return pedidos;//ArrayList
	}
	
	public ArrayList<Pedidos> pedidosProximosFechas(LocalDate fecha1, LocalDate fecha2) {//Devuelve un ArryList con los objetos Pedidos encontrados en la busqueda
		ArrayList<Pedidos> pedidos = new ArrayList<>();//Guarda los pedidos encontrados entre el rango de fechas
		for (Pedidos pedido: pedidos) {//Recorrer HashSet
			//Si la fecha del pedido es >= a fecha1 y fecha del pedido es <= fecha2
			if(pedido.getFecha().compareTo(fecha1) >= 0 && pedido.getFecha().compareTo(fecha2) <= 0){
				pedidos.add(pedido);
			}
		}
		return pedidos;//ArrayList
	}
	
	/*public Pedidos pedidoproximo(LocalDate fecha){
	
		Pedidos pedidoBuscado = null;
		long dias = 0;
		long dias2 = 0;
		for(Pedidos pedido : pedidos) {
			/*if(pedidoBuscado == null) {
				//Calular dias d la fecha al pedido
				dias = ChronoUnit.DAYS.between(fecha, pedido.getFecha());
				pedidoBuscado = pedido;
				if(dias < 0) {
					dias = dias * -1;
				}
			}
			else {
				dias2 = ChronoUnit.DAYS.between(fecha, pedido.getFecha());
				pedidoBuscado = pedido;
				if(dias2 < 0 ) {
					dias = dias * -1;
				}
				if (dias2 < dias){
					pedidoBuscado = pedido;
					dias = dias2;
				}
			}
			
		}
			
	}*/
			
			public Pedidos pedidoProximoFecha(LocalDate fecha) {
				Pedidos pAux=new Pedidos();
				pAux.setFecha(LocalDate.of(1, 1, 1));
				//comparamos la diferencia de días entre la fecha de cada pedido y la 
				//parámetro, con la diferencia de días entre la fecha auxiliar y la parámetro
				//si la del pedido es inferior, actualizamos la variable pedido auxiliar
				for(Pedidos p:pedidos) {
					if(Math.abs(ChronoUnit.DAYS.between(p.getFecha(), fecha))<
							Math.abs(ChronoUnit.DAYS.between(pAux.getFecha(), fecha))) {
						pAux=p;
					}
				}
				return pAux;
			}
	
	
	
	
}

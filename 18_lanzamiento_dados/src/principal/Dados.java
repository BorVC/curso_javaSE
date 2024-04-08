package principal;

import java.util.Random;

public class Dados {

	public static void main(String[] args) {
		/*int dado =(int)(Math.random() * 6 +1);
		System.out.println(dado);*/
		//lanzar dado 10000 veces y mostrar el porcentaje obtenido en cada cara
		/*
		//YO
		int dado;
		int contador1 = 0;
		int contador2 = 0;
		int contador3 = 0;
		int contador4 = 0;
		int contador5 = 0;
		int contador6 = 0;
		
		for(int i = 1; i <=10000;i++) {
			dado = (int)(Math.random() * 6 +1);
			switch(dado) {
			case 1:
				contador1++;
			break;
			case 2:
				contador2++;
			break;
			case 3:
				contador3++;
			break;
			case 4:
				contador4++;
			break;
			case 5:
				contador5++;
			break;
			case 6:
				contador6++;
			break;
			default:
				System.out.println("este número no existe en un dado de 6 caras");
			}
		}
		System.out.println("Porcentaje del lado 1: "  + contador1 * 100.00 / 10_000+ " %");
		System.out.println("Porcentaje del lado 2: "  + contador2 * 100.00 / 10_000+ " %");
		System.out.println("Porcentaje del lado 3: "  + contador3 * 100.00 / 10_000+ " %");
		System.out.println("Porcentaje del lado 4: "  + contador4 * 100.00 / 10_000+ " %");
		System.out.println("Porcentaje del lado 5: "  + contador5 * 100.00 / 10_000+ " %");
		System.out.println("Porcentaje del lado 6: "  + contador6 * 100.00 / 10_000+ " %");
		*/
		
		//PROFE
		final int LANZAMIENTOS = 10_000;
		int [] contadores = new int[6];
		//Objeto random
		var rnd = new Random();
		for(int i = 1; i<=LANZAMIENTOS;i++) {
			//Lanzamiento dado
			//int dado = (int)(Math.random() * 6 +1);
			//utilizar objeto random
			int dado = rnd.nextInt(6) + 1;
			//incrementa la posicion del array.Indice valor dado -1
			contadores[dado -1]++;
		}
		for(int i=0;i<contadores.length;i++) {
			System.out.println("porcentaje de "+(i+1)+": "+contadores[i]*100.0/LANZAMIENTOS);
		}
		
		

	}

}

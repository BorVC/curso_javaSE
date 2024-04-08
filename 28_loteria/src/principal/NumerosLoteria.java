package principal;

import java.util.Arrays;
import java.util.Random;

public class NumerosLoteria {
	
	public static void main(String[] args) {
		System.out.println("Tus números son: ");
		numeroLoto();
	}
	
	//Función q buscará 6 números aleatorios y los guardará en un array
	static void  numeroLoto(){
		//Crear objeto random
		Random rnd = new Random();
		//Variable q guarda cada número q sale aleatoriamente
		int numero = 0;
		int numerosTotales = 0;
		//Array donde guardamos cada uno de los números generados
		int arrayNums [] = new int [6];
		
		//Generamos un número aleatorio
		do {
			numero = rnd.nextInt(49) + 1;
			//llamar a una función q compruebe si existe el número en el array
			//Si el resultado es false entonces añade el número al array
			if(!repetido(arrayNums,numero,numerosTotales)) {
				arrayNums[numerosTotales] = numero;
				numerosTotales++;
			}
		}while(numerosTotales < 6);
		//Ordenar array
		Arrays.sort(arrayNums);
		//Bucle para ver todos los números del array
		for(int num : arrayNums) {
			System.out.println(num);
		}
		//return arrayNums;
	}
	
	//Función q comprueba si están repetidos los números
	static boolean repetido(int [] array,int numero,int numerosTotales) {
		//Variable de control
		boolean resultado = false;
		//Bucle recorre array comprobar si hay numeros repetidos
		for(int i = 0 ; i < numerosTotales; i++) {
			if(array[i] == numero) {
				resultado = true;
				break;
			}
		}
		return resultado;
	}

}

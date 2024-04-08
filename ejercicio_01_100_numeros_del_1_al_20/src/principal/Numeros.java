package principal;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		//1-Array q guarda los 100 numeros aleatorios entre 1 y 20
		int [] arrayNumeros = primerosNumeros();
		//solicitar numero al usuario
		//Objeto Scanner
		Scanner scn = new Scanner(System.in);
		//Variable q guarda el número introducido por el usuario
		int numUsu = 0;
		do {
			//Pedir al usuario un número
		    System.out.println("Introduce un número entre 1 y 20 incluidos:");
		    numUsu = scn.nextInt();	
			}while(!(numUsu >= 1 && numUsu <=20));
		
		for(int i : arrayNumeros) {
			System.out.print(i + " ");
		}
	
		
		//2-Mostrar cuantas veces se incluye el número solicitado al usuario
		int contador = numeroUsuario(arrayNumeros,numUsu);
		System.out.println("\nEl número " + numUsu + " aparece " + contador + " veces");
		
		System.out.println("ARRAY NUMEROS MENORES AL NÚMERO " + numUsu);
		for (int n : numerosMenores1(contadorNumerosMenores(arrayNumeros, numUsu),numUsu,arrayNumeros)) {
			System.out.print(n  + " ");
		}
		//3-Mostrar cuantos números son menores que el seleccionado por el usuario
	    System.out.println("\nHay " + numerosMenores(contadorNumerosMenores(arrayNumeros, numUsu), numUsu,arrayNumeros) + " números menores al número " + numUsu);
		
		//4-Ver números menos sin repetirnumerosMenores(numUsu,arrayNumeros)
		System.out.println("Los números son: ");
		for(int numero : verNumeros(contadorNumerosMenores(arrayNumeros, numUsu),numUsu,arrayNumeros,numerosMenores(contadorNumerosMenores(arrayNumeros, numUsu), numUsu,arrayNumeros))) {
				System.out.print(numero + " ");	
		}
	}
	
	
	
	//MÉTODOS
	
	//1-Función Crear Array
	static  int [] primerosNumeros() {
		//Objeto Random
		Random rnd = new Random();
		//Variable guarda numeros
		int numero = 0;
		//Array
		int arrayNumeros[] = new int [100]; 
		for(int i = 0; i < 100;i++) {
			numero = rnd.nextInt(100)+ 1;
			arrayNumeros[i] = numero;
		}
		return arrayNumeros;
	}
	
	//2-Función mostrar cuantas veces aparece el númnero solicitado
	static int numeroUsuario(int []arrayNumeros,int numUsu) {
		//Variable q cuenta cuantas veces aparece el número solicitado en números 
		int contador = 0;
		//Bucle recorre array función primerosNumeros() para ver cuantos veces aparece el número del usuario
		for(int numero : arrayNumeros) {
			if(numUsu == numero) {
				contador++;
			}
		}
		return contador;
	}
	
	//3-Función cuenta los número inferiores al del usuario y muestra cuantos hay sin repetirse
	static int [] numerosMenores1(int tamaño,int numUsu,int []arrayNumeros) {
		//Array con numeros inferiores al número seleccionado
		int [] numeros = new int [tamaño];
		//Variable posicion numero en el array numeros
		int posicion = 0;
		for(int numero : arrayNumeros) {
			if(numUsu > numero) {
				numeros[posicion] = numero;
				posicion++;
			}
		}
		//Función q compara números y devulve cuantos son menores y no repetidos
		//return contadorNumeros(numeros);
		return numeros;
	}
	
	//3-Función cuenta los número inferiores al del usuario y muestra cuantos hay sin repetirse
		static int numerosMenores(int tamaño,int numUsu,int []arrayNumeros) {
			//Array con numeros inferiores al número seleccionado
			int [] numeros = new int [tamaño];
			//Variable posicion numero en el array numeros
			int posicion = 0;
			for(int numero : arrayNumeros) {
				if(numUsu > numero) {
					numeros[posicion] = numero;
					posicion++;
				}
			}
			//Función q compara números y devulve cuantos son menores y no repetidos
			return contadorNumeros(numeros);
			
		}
	
	//3A-Función cuenta los números menores del número del usuario
	static int contadorNumerosMenores(int [] array,int numUsu) {
		int contador = 0;
		for(int numero : array) {
			if(numUsu > numero) {
				contador++;
			}
		}
		return contador;
	}
	
	//3B-Método contador de números no repetidos
	static int contadorNumeros(int [] arrayNumeros) {
		//Variable contador
		int contador = 0;
		//Itera sobre cada elemento del array
		for(int i = 0; i < arrayNumeros.length; i++) {
			//Variable control boolean
			boolean esUnico = true;
			//Comprueba si el elemento actual ya está presente antes en el array
			for(int j = i + 1; j < arrayNumeros.length; j++) {
				if(arrayNumeros[i] == arrayNumeros[j]) {
					esUnico = false;
					break;
				}
			}
			if(esUnico) {
				contador++;
			}
		}
		return contador;
	}
	
	//4-Ver numeros no repetidos
		static int [] verNumeros(int tamaño1,int numUsu,int[] arrayNumeros,int tamaño2) {
			//Array con numeros inferiores al número seleccionado
			int [] numeros = new int [tamaño1];//Todos incluidos repes
			//Variable posicion numero en el array numeros
			int posicion = 0;
			for(int numero : arrayNumeros) {
				if(numUsu > numero) {
					numeros[posicion] = numero;
					posicion++;
				}
			}
					
			//Array para los numeros no repetidos
			int[] numerosUnicos = new int[tamaño2];
	        int index = 0;

	        // Recorrer el array original para agregar los números únicos al nuevo array
	        for (int i = 0; i < numeros.length; i++) {
	            boolean encontrado = false;
	            for (int j = 0; j < numerosUnicos.length; j++) {
	                if (numeros[i] == numerosUnicos[j] ) {
	                    encontrado = true;
	                    break;
	                }
	            }
	            if (!encontrado ) {
	                numerosUnicos[index] = numeros[i];
	                index++;
	            }
	        }
	        Arrays.sort(numerosUnicos);
	        return numerosUnicos;
		}

}

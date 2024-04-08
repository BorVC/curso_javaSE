package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class NotasArryList {

	public static void main(String[] args) {
		/*Realizar programa solicite las notas de un grupode alumnos.
		 * Al iniciar el programa se solicita una nota y se pregunta si quiere ingresar otra.Si 
		 * dice si ,se inicia otra hasta q se diga no.
		 * Al finalozar el programa muestra:
		 * -Nota media
		 * -Aprobados
		 * -Nota mas alta
		 */
		pedirNotas();

	}
	
	//Método que pide notas al usuario
	static void pedirNotas() {
		//objeto scanner
		Scanner scn = new Scanner(System.in);
		//ArrayList donde guardar las notas
		ArrayList <Integer> notas = new ArrayList<>(); 
		//Variable guarda la nota
		int nota = 0;
		//variable continuar
		String continuar = "";
		//Pedir notas
		do {
			System.out.println("Introduce una nota");
			nota = Integer.parseInt(scn.nextLine());
			notas.add(nota);
			//Pregunta si quiere continuar pidiendo notas
			System.out.println("Quieres introducir alguna nota más?");
			continuar = scn.nextLine();
		}while(continuar.equalsIgnoreCase("si"));
		
		//Mostrar nota media
		System.out.println("NOTA MEDIA: " + notaMedia(notas));
		System.out.println("Número de aprobados:  " + aprobados(notas));
		System.out.println("NOTA MAS ALTA: " +  notaMasAlta(notas));
		 
	}
	
	//Método muestra nota media
	static int   notaMedia(ArrayList<Integer>notas) {
		//Variable suma de notas
		int suma = 0;
		//Bucle recorre arrayList
		for(int nota : notas) {
			suma += nota;
		}
		//Variable nota media
		int notaMedia = suma / notas.size();
        return notaMedia;
	}
	
	//Aprobados
	static int aprobados(ArrayList<Integer>notas) {
		//Variable número de aprobados
		int numAprobados = 0;
		//Bucle recorre ArrayList
		for(int nota : notas) {
			if(nota > 5) {
				numAprobados++;
			}
		}
		return numAprobados;
	}
	
	//Nota mas alta
	static int notaMasAlta(ArrayList<Integer>notas) {
		//Variable nota mas alta
		int notaMasAlta = 0;
		//Bucle recorre ArrayList
		/*for(int i = 0; i < notas.size();i++) {
			//Bucle anidadorecorre siguientes posiciones ArrayList
			for(int j = i +1; i < notas.size();i++) {
				if(notas.get(i) > notas.get(j)) {
					notaMasAlta = notas.get(i);
				}
			}		
		}*/
		for(int nota : notas) {
			if(nota > notaMasAlta) {
				notaMasAlta = nota;
			}
		}
		return notaMasAlta;
	}
}

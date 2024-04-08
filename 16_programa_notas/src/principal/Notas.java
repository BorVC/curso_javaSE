package principal;
import java.util.Scanner;
public class Notas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//Variables
		double nota;
		int posicion = 0;
		double media = 0;
		double notaAlta = 0;
		
		//Array
		double[] notas = new double[6];
		
		do {
			System.out.println("Introduce una nota");
			nota = entrada.nextDouble();
			notas[posicion] = nota;
			posicion++;
		}while(posicion <6);
		
		for(double n : notas) {
			System.out.println(n);	
			media +=  n;
			
			if(n > notaAlta){
				notaAlta = n;
			}
		}
		System.out.println("Nota media: " + media / 6);
		System.out.println("Nota mas alta : " + notaAlta);
		
		for(double n : notas) {
			if(n >= 5) {
				System.out.println("Aprobados: " + n);
			}
		}
		
		/*for(double n : notas) {
			if(n > notaAlta) {
				notaAlta = nota;
			}
		}
		System.out.println("La nota mas alta es: " + notaAlta);*/
	}

}

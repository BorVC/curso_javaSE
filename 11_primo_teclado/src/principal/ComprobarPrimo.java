package principal;
import java.util.Scanner;
public class ComprobarPrimo {

	public static void main(String[] args) {
		int num;
		//Leer numero por teclado
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		num = sc.nextInt();//Objeto scanner llama a la función para introducir numero
		boolean esPrimo = true;	
		for(int i  = 2;i<num;i++) {
			if(num%i==0) {
				esPrimo = false;
			}
		}
		System.out.println("El numero " + num + " es primo?" + esPrimo);
		
		
		

	}

}

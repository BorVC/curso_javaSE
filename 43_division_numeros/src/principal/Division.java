package principal;

import java.awt.im.InputContext;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		// Programa q solicite la introducciion de numeros enteros y muestre el resultado de dividir un o entre otro
		
		try {
			Scanner scn = new Scanner (System.in);
			int n1,n2,div;
			System.out.println("Introduce un numero");
			n1 = scn.nextInt();
			System.out.println("Otro número");
			n2 = scn.nextInt();
			div = n1 /n2;
			System.out.println("Resultdo " + div);
		}
		catch(InputMismatchException ex) {
			System.out.println("Debe de ser un uúmero");
		}
		catch(ArithmeticException ex) {
			System.out.println("La divisón entre 0 no es posible");
		}
		//Multicatch
		/*catch(InputMismatchException | ArithmeticException ex) {
			System.out.println("Error en los datos");
		}*/

	}

}

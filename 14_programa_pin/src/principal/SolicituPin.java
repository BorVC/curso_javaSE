package principal;
import java.util.Scanner;
public class SolicituPin {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		final int PIN_VALIDO = 1234;
		//Solución
		//Variables de alcance global
		int pin;
		int contador = 0;
		
		do {
			System.out.println("Introduce un pin");
			pin = entrada.nextInt();
			if(pin != PIN_VALIDO) {
				contador++;
				System.out.println("Error.Introduce de nuevo el pin.Número de intentos restantes: " +  (3 - contador));
			}
			}while(pin != PIN_VALIDO && contador <= 3);
		if(contador <= 3) {
			System.out.println("Acceso permitido");
		}else {
			System.out.println("Exceso de intentos");
		}
		
		//Solución profe
		/*int pin;
		int intentos = 3;
		
		while(intentos > 0) {
			System.out.println("Introduce pin");
			pin = entrada.nextInt();
			if(pin == PIN_VALIDO) {
				System.out.println("Pin correcto");
				intentos = 0;
				//break;
			}else {
				intentos--;
				if(intentos > 0) {
					System.out.println("Error.Introduce de nuevo el pin.Intentos: " + intentos);
				}else {
					System.out.println("Has utiizado todos tus intentos");
				}*/
		

	}

}

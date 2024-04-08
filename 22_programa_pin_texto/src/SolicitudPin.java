import java.util.Scanner;
public class SolicitudPin {

	public static void main(String[] args) {
    
		Scanner entrada = new Scanner(System.in);
		final String PIN_VALIDO = "1234";
		String pin;
		int intentos = 3;
		
		while(intentos > 0) {
			System.out.println("Introduce pin");
			pin = entrada.nextLine();
			if(pin.equals(PIN_VALIDO)) {
				System.out.println("Pin correcto");
				intentos = 0;
				//break;
			}else {
				intentos--;
				if(intentos > 0) {
					System.out.println("Error.Introduce de nuevo el pin.Intentos: " + intentos);
				}else {
					System.out.println("Has utiizado todos tus intentos");
				}

	        }

      }
}
}
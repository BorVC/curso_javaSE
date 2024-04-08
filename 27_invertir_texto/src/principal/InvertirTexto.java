package principal;
import java.util.Scanner;public class InvertirTexto {
	public static void main(String[] args) {
		//Solicitar texto y mostrar invertido
		Scanner scr = new Scanner(System.in);
		System.out.println("Introduce un texto ");
		String texto = scr.nextLine();
		System.out.println(invertir(texto));
		
	}
	
	static String invertir(String cad) {
		StringBuilder cadenaReves = new StringBuilder("");
		for(int i = cad.length() -1; i>=0;i--) {
			 cadenaReves.append(cad.charAt(i));
		}
		return cadenaReves.toString();
	}

}

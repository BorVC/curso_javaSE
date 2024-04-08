package principal;

public class ContarVocales {

	public static void main(String[] args) {
		String cad = "Esto es un nuevo texto";
		cad = cad.toLowerCase()
;		char letra;
		int contador= 0;
		cad = cad.toLowerCase();
		for(int i = 0; i < cad.length();i++) {
			
			letra = cad.charAt(i);
			switch (letra) {
			/*case a,e,i,o,u:
				System.out.println(letra);
			    contador++;
			break;*/
			case 'a':
				System.out.println(letra);
				contador++;
				break;
			case 'e':
				System.out.println(letra);
				contador++;
				break;
			case 'i':
				System.out.println(letra);
				contador++;
				break;
			case 'o':
				System.out.println(letra);
				contador++;
				break;
			case 'u':
				System.out.println(letra);
				contador++;
				break;
			}
			
			
		}
		System.out.println("Hay " + contador + " vocales");
		

	}

}

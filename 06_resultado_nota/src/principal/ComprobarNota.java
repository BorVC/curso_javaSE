package principal;

public class ComprobarNota {

	public static void main(String[] args) {
		int nota = 6;
		
		/*switch (nota) {
		
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Suspenso");
			break;
		case 5:
		case 6:
			System.out.println("Aprobado");
			break;
		case 7:
		case 8:
			System.out.println("Notable");
			break;
		case 9:
		case 10:
			System.out.println("Sobresaliente");
			break;
		default:
			System.out.println("error al introducir la nota");
		}*/
		
/*switch (nota) {//Java 14
		case 1,2,3,4:
			System.out.println("Suspenso");
			break;
		case 5,6:
			System.out.println("Aprobado");
			break;
		case 7,8:
			System.out.println("Notable");
			break;
		case 9,10:
			System.out.println("Sobresaliente");
			break;
		default:
			System.out.println("error al introducir la nota");
	}*/
		
 String resultado;
 resultado = switch(nota) {//Java 14
     case 1,2,3,4->"Suspenso";
     case 5,6 ->"Aprobado";
     case 7,8 -> "Notable";
     case 9,10 -> "Sobre";
     default -> "Error";
 };
 System.out.println(resultado);
}

}

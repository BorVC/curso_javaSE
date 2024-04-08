package principal;

public class PruebaTexto {

	public static void main(String[] args) {
		String n = "hello";// Variable de tipo objeto
		n.toUpperCase();
		System.out.println("Objeto inmutable de como resultado: " + n);
		
		
		/*n=n.toUpperCase();//Variable primitiva mismo nombre contiene la referencia al objeto
		System.out.println("Al meter el resultado en una variable con el mismo nombre: " + n);*/
		
		var m=n.toUpperCase();
		System.out.println("Al meter el resultado en una variable con distinto nombre: " + m);
		
		System.out.println("Variable de tipo objeto " + n);
		
		String a  = new String ("mitexto");
		String b  = new String ("mitexto");
		
		String resultado = (a == b) ? "Iguales" : "Distintos";//Apuntan a objetos distintos por sus direcciones
		System.out.println(resultado + " Apuntan a objetos distintos por sus direcciones");
		//Método equals o equalsIgnorecase en caso de no tener en cuenta mayúsculas o minúsculas
		
		//Java ahorra memoria cuando se crean literales al ser la misma cadena
		String c = "hola";
		String d = "hola";
		String resul = (a == b) ? "Iguales" : "Distintos";//Pool de cadenas
		System.out.println(resul + " POOL de cadenas");
		

	}

}

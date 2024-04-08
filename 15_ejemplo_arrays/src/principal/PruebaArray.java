package principal;

public class PruebaArray {

	public static void main(String[] args) {
		int notas[] = {3,5,8,4,9};
		//Suma un punto  las notas y muestralas al final
		
		for(int i = 0; i<notas.length;i++) {
			notas[i]++;
			//System.out.println(notas[i]);
		}
		//Bucle for each
		for (int nota : notas) {
			System.out.println(nota);
		}

	}

}

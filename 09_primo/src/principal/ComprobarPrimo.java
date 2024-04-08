package principal;

public class ComprobarPrimo {

	public static void main(String[] args) {
		int num= 13;
		boolean esPrimo = true;
		
		for(int i  = 2;i<num;i++) {
			if(num%i==0) {
				esPrimo = false;
			}
		}
		System.out.println("El numero " + num + " es primo?" + esPrimo);
		
		
		

	}

}

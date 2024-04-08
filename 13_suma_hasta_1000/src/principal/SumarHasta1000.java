package principal;

public class SumarHasta1000 {

	public static void main(String[] args) {
		int num1 = 0;
		int resultado = 0;
		
		while(resultado <= 1000) {
			num1++;
			resultado += num1; 
			
		}
		
System.out.println("Para llegar a mil he tenido que sumar hasta " + num1);
	}

}

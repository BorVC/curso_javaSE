package principal;

public class Factorial {

	public static void main(String[] args) {
		int num = 7;
		int resultado = 1;
		for(int i = 1;i <=num;i++) {
			resultado *= i; 
		}
		System.out.println(resultado);
	}

}

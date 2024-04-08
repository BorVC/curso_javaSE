package principal;
import java.util.Scanner;
public class Multiplos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int resultado = 0;
		//Hacer que no pueda meter un numero negativo
		do {
			System.out.println("Introduce un número: ");
			num1 = sc.nextInt();
		}while(num1 < 0);
		
	
		do {
			System.out.println("Introduce otro número: ");
			num2 = sc.nextInt();		
		}while(num2 < 0);
		
		
		if(num1 < num2) {
			for(int i = num1;i <=num2;i++) {
				if(i%5 == 0) {
					resultado ++;
				}
			}
		}else {
			for(int i = num2;i <= num1;i++) {
				if(i%5 == 0) {
					resultado ++;
				}
			}
		}
		System.out.println("Los multiplos de 5 son " + resultado);
		

	}

}

package principal;

public class Sumador {

	public static void main(String[] args) {
		int n1 = 20;
		int n2 = 11;
		int suma = 0;
		String text;
		
		/*for(int i = n2 + 1; i<n1;i++) {
				suma += i;
		}
		System.out.println(suma);*/
		
		
		if(n1 < n2) {
			for(int i = n1 + 1;i < n2; i++) {
				suma += i;
			}
			System.out.println("Resultado n1 menor n2" + suma);
		}else {
			for(int i = n2 + 1; i<n1;i++) {
				suma += i;
			}
		}
		System.out.println(suma + "En numero menor es num1");
		

	}

}

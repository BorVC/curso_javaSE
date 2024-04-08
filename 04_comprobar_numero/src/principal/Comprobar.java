package principal;

public class Comprobar {

	public static void main(String[] args) {
		int num = 4;//Simula número introducido desde fuera
		int num1 = 5 ;
		
		if(num%2 == 0) {
		
		System.out.println(num / 2);

	}else {
		System.out.println(--num /2 );
	}
		
	//Operador ternario
		System.out.println(num%2 == 0 ? num1 / 2 : (num1 - 1 / 2));//10
		
		int a=10;
		int b=a++;
		int c=++b;
		System.out.println(a<b?b>c?a--:c++:--b); //10

		if(a<b){
			if(b>c){
				a--;
			}else{
				c++;
			}
		}else{
			--b;
		} 
}
	

}

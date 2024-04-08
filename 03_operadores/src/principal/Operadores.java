package principal;

public class Operadores {

	public static void main(String[] args) {
		int a  = 3;
		int b = 5;
		System.out.println(b/a);
		b++;//b = b + 1
		--a;// a  = a -1
		
		int c = 10;
		System.out.println(c++);//No se le suma 1 en este print
		System.out.println(c);//Si se le sumó el anterior
		int n = --c;//Se imprime en primer lugar
		System.out.println(n);
		
		int x = 5;
		int y = 4;
		int z = 8;
		System.out.println(x == y++);//False xq el incremento es posterior a la variable
		boolean rs = x>y || z>2;
		System.out.println(z);

	}

}

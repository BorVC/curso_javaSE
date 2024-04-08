package principal;
import java.util.Scanner;
public class BuscarProdudcto {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		String cesta = "Tomates,Patatas,Vino,Peras,Tomates,Azucar,Vino,Tomates,Limones";
		cesta = cesta.toLowerCase();
		int stock = 0;
		//Array en el que guardar el producto
		String[] productos = cesta.split(",");
		
		//pedir producto del que saber cantidad
		System.out.println("Indica el producto");
		String producto = scr.nextLine();
		
		//Ver cuantos prductos hay del indicado
		for(String alimento : productos) {
			if(alimento.equals(producto)) {
				stock++;
			}
		}
		System.out.println("Cantidad de " + producto + " es " + stock);
		
		
		
		
	}

}

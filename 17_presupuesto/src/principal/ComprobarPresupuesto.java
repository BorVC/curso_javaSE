package principal;
import java.util.Scanner;
public class ComprobarPresupuesto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//double [] precios = {19_500,23_890,33_000,30_550,40_900};
		var precios = new double[]{19_500,23_890,33_000,30_550,40_900};//Utilizar var en variables locales INICIALIZADAS
		
		//Variables
		double presupuesto;//NO se puede utilizar xq no está inicializada
		//int contador = 0;
		var contador = 0;
		System.out.println("Introduce cual es tu presupuesto:");
		presupuesto = entrada.nextDouble();
		
		for(double precio : precios) {
			if(presupuesto >= precio ) {
				contador++;
				System.out.println( "Coche disponible.Precio: " + precio);
			}
			
		}
		System.out.println("Tienes presupuesto para " + contador + " coches");
		
		
		

	}

}

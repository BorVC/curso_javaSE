import java.util.Random;
public class Premios {

	public static void main(String[] args) {
		// Array de premios
		 int arrayPremios[][] = new int [10][10];
		 int [] []arrayPremios1 = introducePremio(arrayPremios);
		 int contador =0;
		 //Mostrar array
		 for(int i = 0 ;i <arrayPremios1.length;i++) {
			 for(int j = 0; j < arrayPremios1[i].length;j++) {
				 //System.out.println("Posicion: [" + i + "]["+ j + "]"+ arrayPremios1[i][j]);
				 if(arrayPremios1[i][j] == 1) {
					 System.out.println("En la posición [" + i + "][" + j + "] Premio" );
					 contador++;	 
				 }
			 }
		 }
		 System.out.println("Veces q aparece el 1: " + contador);
		 
		 //Moistrar panel
		 mostrarPanel(arrayPremios1);

	}
	
	//Método q introduce un premios en posiciones aleatorias
	static int [][] introducePremio(int array[][]) {
		//Variables posiciones en el array
		int pos1 = 0;
		int pos2 = 0;
		int premios = 0;
		int total = 0;
		//Objeto random q generará número de posición aleatoria
		Random rnd = new Random();
		//Generar posiciones
		do {
			pos1 = rnd.nextInt(10);//filas
			pos2 = rnd.nextInt(10);//coloumnas
			
				if(array[pos1] [pos2] == 1) {
			           pos1 = rnd.nextInt(10);
			           pos2 = rnd.nextInt(10);
				} 
				array[pos1][pos2] = 1;
				premios++;
			
			
			
		}while(premios < 5 );
		return array;		
	}
	
	static void mostrarPanel(int [][] array) {
		for(int i = 0; i < array.length;i++) {
			for(int j = 0; j < array[i].length;j++) {
				System.out.print("[" + array[i][j] + "]");
			}
			System.out.println();
		}
	}
	
	

}

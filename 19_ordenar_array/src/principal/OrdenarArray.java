package principal;

import java.util.Arrays;

public class OrdenarArray {

	public static void main(String[] args) {
		int edades[]= {19,24,14,38,27,30};
		int auxiliar;//Varible q guarda el valor mayor
		
		/*for(int i = 0;i < edades.length;i++) {
			for(int j= i+1;j<edades.length;j++) {//Siguiente posición en el array
	            //Ordena de < a >		
				if(edades[i] > edades[j]) {//Intercambio de posiciones en caso de que el anterior sea mayor al siguiente
					auxiliar = edades[i];
					edades[i] = edades[j];
					edades[j] = auxiliar;
				}
			}
		}*/
		//Clase array metodo short
		Arrays.sort(edades);
		for(int edad : edades) {
			System.out.println(edad);
		}

	}

}

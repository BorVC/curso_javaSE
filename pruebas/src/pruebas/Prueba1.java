package pruebas;

public class Prueba1 {

	    public static void main(String[] args) {
	    	 // Crear un array con los números proporcionados
	        int[] numeros = {1, 2, 3, 4, 5, 2, 3, 4, 6, 7, 8, 9, 5};

	        // Contador para almacenar la cantidad de números únicos
	        int contador = 0;

	        // Variable para verificar si un número ya ha sido encontrado
	        boolean encontrado;

	        // Recorrer el array para contar la cantidad de números únicos
	        for (int i = 0; i < numeros.length; i++) {
	            encontrado = false;
	            for (int j = 0; j < contador; j++) {
	                if (numeros[i] == numeros[j]) {
	                    encontrado = true;
	                    break;
	                }
	            }
	            if (!encontrado) {
	                contador++;
	            }
	        }

	        // Crear un nuevo array para almacenar los números únicos
	        int[] numerosUnicos = new int[contador];
	        int index = 0;

	        // Recorrer el array original para agregar los números únicos al nuevo array
	        for (int i = 0; i < numeros.length; i++) {
	            encontrado = false;
	            for (int j = 0; j < contador; j++) {
	                if (numeros[i] == numerosUnicos[j]) {
	                    encontrado = true;
	                    break;
	                }
	            }
	            if (!encontrado) {
	                numerosUnicos[index] = numeros[i];
	                index++;
	            }
	        }

	        // Imprimir el array de números únicos
	        System.out.print("Array de números únicos: ");
	        for (int numero : numerosUnicos) {
	            System.out.print(numero + " ");
	        }
	        
	    }


}

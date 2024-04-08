package principal;

public class ComprobarDireccionesCompletoEjercicio {

	public static void main(String[] args) {
		String email = "aaa@gmail.com,bbb@tel.es,"
				+ "ccc@gmail.es,ddd@gmail.com,"
				+ "abcd@gmail.net,"
				+ "bvc@gmail.org,"
				+ "abced@gmail.com,"
				+ "bvvce@gmail.net,"
				+ "bvwc@gmail.gor,"
				+ "bvec@gmail.org,"
				+ "bvdce@gmail.uk,"
				+ "bvce@gmail.org,"
				+ "bvce@gmail.jp";
		
		//Pasar el String 'email' a un array 'emails' quitando la coma de separacón entre las direcciones
		String emails[] = email.split(",");
		
		//FORMA1 Mostrar dominios con función 'dominiosTipos' y las direcciones de cada dominio
		System.out.println("FORMA1: Tipos de dominios que hay :" + dominiosTipos(emails));
		//Array q guarda dominios del String devuelto por 'dominiosTipos'
		String arrayDominios []  = dominiosTipos(emails).split(" ");
		for(String dominio : arrayDominios) {
			System.out.println("Del dominio " + dominio + " hay :" + contadorDirecciones(emails,dominio));
		}
		//FORMA2 Mostrar dominios con función 'dominios' y las direcciones de cada dominio
		System.out.println("FORMA2: Tipos de dominios que hay :" );
		for(String dominio : dominios(emails)) {
			if(dominio != "") {
				System.out.println(dominio + " Del dominio " + dominio + " hay: " + contadorDirecciones(emails,dominio));
			}
		}

	}
	
	//FORMA 1 Función q devuelve una cadena con los TIPOS de dominio de los emails del array 'emails'
    static String dominiosTipos (String direcciones []) {
    	//Variable q guarda el dominio de cada email
    	String dominio = "";
    	//Array q guarda los dominios instanciado con el tamaño del array q pasamos por parámetro
    	String arrayDom[] = new String[direcciones.length];  	
    	//Variable q guarda todos los dominios como una cadena
    	StringBuilder dominios = new StringBuilder("");
    	
    	//Bucle q recorre el array pasado por parámetro
    	for(int i = 0 ; i < direcciones.length; i++) {
    		//Guaradamos en dominio la subcadena con el dominio extraido de cada email
    		dominio = direcciones[i].substring(direcciones[i].indexOf("."),direcciones[i].length());
    		//En cada posición del 'arrayDom' guardamos el dominio extraido
    		arrayDom[i] = dominio;
    	}
    	
    	//Bucle q recorre arrayDom para comparar cada domininio con el resto para ver si esta repetido
    	for(int j = 0; j < arrayDom.length; j++) {
    		//Bucle anidado q mostrará los dominios guardados en la posiciones posteriores al mostrado en el anterior array
    		for(int k = j + 1; k < arrayDom.length; k++) {
    			//Si los dominios son iguales eliminará los posteriores
    			if(arrayDom[j].equals(arrayDom[k])) {
    				arrayDom[k] = "";
    			}
    		}
    	}
    	
    	//Bucle q recorre arrayDom y guarda en cadena 'dominios'
    	for(String dom : arrayDom) {
    		if(dom != "") {
    			dominios.append(dom + " ");
    		}
    	}
    	return dominios.toString();
    }
    
    //FORMA2 Función q devuelve array con TODOS los  dominios de los emails del array 'emails'
    static String  [] dominios (String direcciones[]){
    	//Variable q guarda cada dominio encontrado
    	String dominio  ="";
    	//Array q guardará todos los dominios encontrados
    	String [] arrayDom = new String [direcciones.length];
    	
    	//Bucles recorre array de direcciones pasado por parámetro 
    	for(int i = 0; i < direcciones.length; i++) {
    		//Guardamos en la variable dominio el dominio de cada dirección
    		dominio = direcciones[i].substring(direcciones[i].indexOf("."),direcciones[i].length());
    		arrayDom[i] = dominio;
    	}
    	
    	//Bucles q comparan si cada tipo de dominio se repite en el array
    	for(int j = 0; j < arrayDom.length; j++) {
    		//Bucle q recorre el resto de posiciones en la q se pueda encontrar un dominio repetido
    		for(int k = j + 1; k < arrayDom.length; k++) {
    			if(arrayDom[j].equals(arrayDom[k])) {
    				arrayDom[k] = "";
    			}
    		}
    	}
    	return arrayDom;	    	
    }
    
    //Función contará la cantidad de direcciones de cada dominio
    static int contadorDirecciones(String direcciones [],String dominio) {
    	int contador = 0;
    	for(String email : direcciones) {
    		if(email.endsWith(dominio)) {
    			contador++;
    		}
    	}
    	return contador;
    }

}

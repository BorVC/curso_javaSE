package principal;

public class ComprobarDireccionesCompleto {

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
		String emails []= email.split(",");//Método q crea un array con las direciones del String quitando las comas
		//Muestra el tipo de dominio que existe en el array. Sin repetir ninguno
		System.out.println(dominiosDistintos(emails));
		//Array con los tipos de dominio q hay.Se eliminan los espacios de las posiciones vacias que hay en el String creado x pa función
		String arrayTipoDom[] = dominiosDistintos(emails).split(" ");
		System.out.println("Estos son todos los dominios de cada tipo que hay : ");
		String arrayDominios [] = dominios(emails);
		//Bucle que recorre array con tipos de dominio
		for (String dominio : arrayDominios) {
			if(dominio !="") {//Si no es un valor vacio se imprime y se llama a la función contador
				System.out.println("Del dominio " + dominio + " hay :" + contadorDominio(emails,dominio));//Función q contabiliza la cantidad de direcciones de cada dominio;
			}
		}
		
	}
	 
	//FORMA1
	//Función devuelve string con tipos de dominios que hay  
			static String dominiosDistintos(String dirs[]) {
				String dominio = "";
				int contador = 0;
				StringBuilder resul = new StringBuilder("");
				String arrayDom [] = new String[dirs.length];
				//Se crea una subcadena con el dominio y se guarda en un array nuevo
				for(int i = 0 ; i < dirs.length;i++) {
					dominio = dirs[i].substring(dirs[i].indexOf(".") , dirs[i].length());//Variable q guarda cada dominio del array ".loqsea"	
					arrayDom[i] = dominio;
				}
				//Itera cada posición del array
				for(int j = 0; j <arrayDom.length;j++) {
					//Itera las posiciones posteriores a la encontrada por el primer bucle
					for(int z = j + 1; z < arrayDom.length; z++) {
						//Si coinciden los valores de ambas posiciones
						if(arrayDom[j].equals(arrayDom[z])) {
						    arrayDom[z] = "";//Sustituye las posteriores por un String vacio
						}
					}				
				}
				for(String dom : arrayDom) {
					if(dom != "") {
						contador++;
					    resul.append(dom + " " );
					}
				}
				
				//return "Hay " + contador + " dominios diferentes: " + resul.toString() ;
				return resul.toString();
			}
			
			//FORMA2
			//Función que devuelve un array con todos los tipos de dominio
			static String [] dominios(String [] direcciones){
				//Variable donde guarda el domninio q se guardará en el array
				String dominio = "";
				//Variable guarda cuantos dominios hay
				int contador = 0;
				//Array donde guardar los dominios de las direcciones
				String arrayDominios[] = new String[direcciones.length];
				//Bucle que recorrera el array mostrando cada dirección q hay en el array
				for(int i = 0; i < direcciones.length; i++) {
					//De cada dirección sacamos la subcadena con solo su dominio y lo guardamos en la variable dominio
					dominio = direcciones[i].substring(direcciones[i].indexOf("."),direcciones[i].length());
					arrayDominios[i] = dominio;
				}
				//Bucles q rcomprueba si existe el mismo dominio en el array
				for(int j = 0; j < arrayDominios.length; j++) {
					for(int k = j + 1; k < arrayDominios.length; k++) {
						//Si existe sustituye los posteriores por un valor vacio
						if(arrayDominios[j].equals(arrayDominios[k])) {
							arrayDominios[k] = "";
						}
					}
				}
				return arrayDominios;
			}
			
			//Función q cuenta la cantidad de direcciones de cada dominio
			static int contadorDominio(String [] dominios,String dominio) {
				int contador = 0;
				for(String dom : dominios) {
					//si la diracción termina en el dominio recibido, incrementamos contador
					if(dom.endsWith(dominio)) {
						contador++;
					}
				}
				return contador;
			}

	


}

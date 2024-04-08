package principal;

public class ComprobarDireccionesModular {

	public static void main(String[] args) {
		String email = "aaa@gmail.com,bbb@tel.es,ccc@gmail.es,ddd@gmail.com,abc@gmail.com";
		String emails[] = email.split(",");
		int contador1 = 0;
		int contador2 = 0;
		//Llamada al método guardar en variable
		contador1 = contarDominio("es",emails);
		contador2 = contarDominio("com",emails);
		System.out.println("Dominios .com: " + contarDominio("es",emails));
		System.out.println("Dominios .es: " + contarDominio("com",emails));
		//Llamda directamente al método
		System.out.println("Dominios .es: " + contador1);
		System.out.println("Dominios .com: " + contador2);
		

	}
	//Método static porque es llamada por una función main que también lo es
	static int contarDominio(String dominio,String[]dirs) {
		int contador= 0;
		for(String em : dirs) {
			if(em.endsWith(dominio)) {
				contador++;
			}
		}
		return contador;
	}

}

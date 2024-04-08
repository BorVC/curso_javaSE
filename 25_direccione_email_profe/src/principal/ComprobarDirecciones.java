package principal;

public class ComprobarDirecciones {

	public static void main(String[] args) {
		String email = "aaa@gmail.com,bbb@tel.es,ccc@gmail.es,ddd@gmail.com,abc@gmail.com";
		String emails[] = email.split(",");//Quita las comas del String y devuelve las direcciones las cuales se guardan en un array
		int contador1 = 0;
		int contador2 = 0;
		
		for(String em : emails) {
			if(em.endsWith(".com")) {//Si acaba en .com guardar en el contador1
				contador1++;
			}else {
				contador2++;//Si son .es guardar en el contador2
			}
			/*
			//Profe
			switch(em.substring(em.indexOf(".") , em.length())) {
			case "com":
				contador1++;
			break;
			case "es":
				contador2++;
			break;
			}*/
		}
		
		System.out.println("Dominios .com: " + contador1);
		System.out.println("Dominios .es: " + contador2);
		
		
	}

}

package principal;

public class VariablesTipos {
	static int r;//Variables de tipo atibuto se inicializan a 0 por defecto
	public static void main(String[] args) {
		int s,v,d = 10;//Variable locales si no son inicializadas y se impimen de error
		s= 6;//Inicialiuzación de variable ya declarada
		float x = 45.6f;//>Todo decimal es de tipodouble .Añadir f al final del a inicialización
		System.out.println("Solo la variable d está inicializada y su valos es " + d );
		System.out.println("Valor de la variable declada fuera de la clase sin inicializar es  = a "  + r);
		System.out.println(s + " es el valor de s");
	}

}

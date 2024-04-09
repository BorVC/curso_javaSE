package principal;

import java.time.LocalDateTime;

public class Prueba2 {

	public static void main(String[] args) {
		//mostrar la fecha y horá que será dentro de 
		//1 mes, 11 dias y 4 horas
		System.out.println(LocalDateTime
				.now()
				.plusMonths(1)
				.plusDays(11)
				.plusHours(4));

	}

}

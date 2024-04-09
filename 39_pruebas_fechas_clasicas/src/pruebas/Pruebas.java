package pruebas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Pruebas {

	public static void main(String[] args) throws ParseException {
		// Fecha del momento actual
		//Constructor sin parámetros del objeto Date
		Date f1=new Date();
		System.out.println(f1);
		
		//Fecha y hora concreta
		Calendar cal = Calendar.getInstance();//Objeto Calendar
		cal.set(2022, 0,30,20,35);
		//Objeto Date
		Date f2 = cal.getTime();
		System.out.println(f2);
		//Fecha a partir de cadena de caracteres
		String fecha = "4/10/1999";
		   //Calse de apoyo SimpleDateFormat
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date f3 = format.parse(fecha);
		System.out.println(f3);
		

	}

}

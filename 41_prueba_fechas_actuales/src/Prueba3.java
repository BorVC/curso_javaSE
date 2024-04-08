import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Prueba3 {

	public static void main(String[] args) {
		LocalDate f1 =LocalDate.of(2023,11,4);
		LocalDate f2 = LocalDate.of(2024, 3, 7);
		//Periodo para establecer un periodo entre dos fechas
		Period p = Period.between(f1, f2);
		System.out.println(p);
		System.out.println("Meses " + p.getMonths());
		System.out.println("Días " + p.getDays());
		long dias1 = ChronoUnit.DAYS.between(f1, f2);//Días totales de un periodo
		System.out.println("total dias del periodo 1 " + dias1);
		
		LocalDate f3 = LocalDate.of(2023, 04, 04);
		LocalDate f4 = LocalDate.of(2023, 8, 7);
		Period p1 = Period.between(f3, f4);
		System.out.println(p1);
		System.out.println("Meses " + p1.getMonths());
		System.out.println("Días " + p1.getDays());
		long dias2 = ChronoUnit.DAYS.between(f3, f4);//Días totales de un priodo
		System.out.println("total días del periodo 2 " + dias2);

	}
}

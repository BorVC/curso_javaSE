package principal;

import java.util.HashSet;

public class PruebaConjunto {

	public static void main(String[] args) {
		HashSet <Double> nums = new HashSet<Double>();
		nums.add(30.7);
		nums.add(80.0);
		nums.add(21.3);
		
		for(Double s : nums) {
			s = s+1;//Los números del conjuntos siguen siendo los mismos aunq dentro del buvle se realice la operación
			//s es una variable q no se encuentra en la colección
			System.out.println(s);
		}
		for(Double s : nums) {
			System.out.println(s);//Los números del conjuntos siguen siendo los mismos q l principio
		
		}

	}

}

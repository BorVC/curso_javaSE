package service;

import java.util.ArrayList;

public class NotasService {
	ArrayList<Double> notas = new ArrayList<>();
	
	//Métodos
	//Método agregar nota
	public void agregarNota(double nota) {
		notas.add(nota);
	}
	
	//Calcular media
	public double calcularMedia() {
		//Variable suma de notas
				double suma = 0;
				//Bucle recorre arrayList
				for(double nota : notas) {
					suma += nota;
				}
				//Variable nota media
				double notaMedia = suma / notas.size();
		        return notaMedia;
	}
	
	//Calcular nota máxima
	public double notaMax() {
		//Variable nota mas alta
	    double notaMasAlta = 0;
	  //Bucle recorre ArrayList
	    for(double nota : notas) {
			if(nota > notaMasAlta) {
				notaMasAlta = nota;
			}
		}
		return notaMasAlta;
	}
	
	//Calcular nota mínima
	public double notaMin() {
		double notaMinima = 10;
		for(double nota : notas) {
			if(nota < notaMinima) {
				notaMinima = nota;
			}
		}
		return notaMinima;
	}
	
	//Mostrar notas como un array
	public Double[]obtenerNotas(){
		//FORMA tradicional. Ha de devolver un array primitivo(double)
		/*//Array donde guardar las notas del ArrayList
		double [] todas = new double[notas.size()];
		//Bucle q recorre el ArrayList
		for(int i = 0; i < notas.size();i++) {
			todas[i] = notas.get(i);
		}
		return todas;*/
		
		//Utilizando función toArray.Combierte ArrayList en arry de objetos
		return notas.toArray(new Double[0]);//Devuelve array de objetos dobles
	}
}

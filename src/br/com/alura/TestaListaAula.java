package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestaListaAula {

	public static void main(String[] args) {
		
		Aula aula1 = new Aula("Aula 50", 30);
		Aula aula2 = new Aula("Aula 2", 20);
		Aula aula3 = new Aula("Aula 3", 21);
		
		List<Aula> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		Collections.sort(aulas);
		aulas.sort(Comparator.comparing(Aula::getTempo));

		System.out.println(aulas);
	}

}

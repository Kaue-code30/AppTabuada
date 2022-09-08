package br.sp.senai.jandira;

import java.util.ArrayList;

public class Tabuada {
	public int numeroMultiplicado;
	public int minMultiplicador;
	public int maxMultiplicador;
	public ArrayList<String> resultadoTabuada = new ArrayList<>();
	
	
	
	
	public int getresultado() {
		return numeroMultiplicado * minMultiplicador;
	}
		
	
	public ArrayList <String> getTabuada() {
		while (minMultiplicador <= maxMultiplicador) {
			resultadoTabuada.add(numeroMultiplicado + "x" + minMultiplicador + "=" + getresultado());
			minMultiplicador++;
			
		}
		return resultadoTabuada;
	}
	
	
			
			
}

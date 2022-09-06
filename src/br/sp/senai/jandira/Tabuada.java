package br.sp.senai.jandira;

import java.util.ArrayList;

public class Tabuada {
	public int numeroMultiplicado;
	public int minMultiplicador;
	public int maxMultiplicador;
	public ArrayList<String> conta = new ArrayList<>();
	
	
	public int getresultado() {
		return numeroMultiplicado * minMultiplicador;
	}
	
	public ArrayList<String> getTabuada() {
		while (minMultiplicador < maxMultiplicador) {
			conta.add(numeroMultiplicado + "x" + minMultiplicador + "=" + getresultado());
			minMultiplicador++;
		}
		return conta;
	}
			
			
}

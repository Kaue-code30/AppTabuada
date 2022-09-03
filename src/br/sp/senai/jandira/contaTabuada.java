package br.sp.senai.jandira;

import java.util.ArrayList;

public class contaTabuada {
	public int numeroMultiplicado;
	public int minMultiplicador;
	public int maxMultiplicador;
	public ArrayList<String> conta = new ArrayList<>();
	public int resultado = numeroMultiplicado * minMultiplicador; 
	
	public void getTabuada() {
		while (minMultiplicador < maxMultiplicador) {
			conta.add(numeroMultiplicado + " x " + minMultiplicador + " = " + resultado);
			minMultiplicador++;
		}
	}
			
			
}

package br.sp.senai.jandira.model;


import br.sp.senai.jandira.Tabuada;
import br.sp.senai.jandira.gui.fraimeTabuada;

public class appTabuada {

	public static void main(String[] args) {
		
		Tabuada tabuada = new Tabuada();
		
		fraimeTabuada tela = new fraimeTabuada();
		tela.titulo = "Tabuada";
		tela.altura = 650;
		tela.largura = 510;
		
		
			
		tela.criartela();
		
		

	}

}

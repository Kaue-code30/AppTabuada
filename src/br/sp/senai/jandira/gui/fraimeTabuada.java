package br.sp.senai.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class fraimeTabuada {
	
	public String titulo;
	public int largura;
	public int altura;
	
	public void criartela() {
		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		
	// criar o container para colocar os objetos dentro \\
		
		Container painel = tela.getContentPane();
		painel.setBackground(Color.WHITE);
		
		
	// Criação das fontes \\
		
		Font fonteTitulo = new Font("SansSerif", Font.BOLD, 17);
		Font fonteSubTitulo = new Font("SansSerif", Font.BOLD, 12);
		Font fonteRotulos = new Font("SansSerif", Font.BOLD, 15);
		Font fonteTextfiled = new Font("SansSerif", Font.BOLD, 15);
		
		
		
	// criando os rotulos com o Jlabel \\
		
		JLabel tituloPrincipal = new JLabel("Tabuada 1.0");
		tituloPrincipal.setBounds(120, 30, 100, 50);
		tituloPrincipal.setForeground(Color.RED);
		tituloPrincipal.setFont(fonteTitulo);
		
		
		JLabel subTitulo = new JLabel();
		subTitulo.setText(" Com a tabuada 1.0 seus problemas acabarm."
		+ "Calcule a tabuada que desejar em segundos!!");
		subTitulo.setBounds(120, 5, 700, 150);
		subTitulo.setForeground(Color.gray);
		
		
		
		JLabel rotuloMultiplicando = new JLabel();
		rotuloMultiplicando.setText("Multiplicando: ");
		rotuloMultiplicando.setBounds(100, 60, 190, 180);
		rotuloMultiplicando.setFont(fonteRotulos);
		
		JLabel rotuloMinMultiplicador = new JLabel();
		rotuloMinMultiplicador.setText("Mínimo Multiplicador: ");
		rotuloMinMultiplicador.setBounds(100, 60, 210, 300);
		rotuloMinMultiplicador.setFont(fonteRotulos);
		
		JLabel rotuloMaxMultiplicador = new JLabel();
		rotuloMaxMultiplicador.setText("Máximo Multiplicador: ");
		rotuloMaxMultiplicador.setBounds(100, 60, 230, 420);
		rotuloMaxMultiplicador.setFont(fonteRotulos);
		
		JLabel rotuloResultado = new JLabel();
		rotuloResultado.setText("Resultado: ");
		rotuloResultado.setBounds(20, 350, 100, 30);
		rotuloResultado.setFont(fonteRotulos);
		
		
		
		
	// Criando as caixas de entrada com jtextfiled \\
		
		JTextField textfiledMultiplicando = new JTextField();
		textfiledMultiplicando.setBounds(260, 135, 140, 34);
		textfiledMultiplicando.setFont(fonteTextfiled);
		
		
		JTextField textFieldMinMultiplicador = new JTextField();
		textFieldMinMultiplicador.setBounds(260, 195, 140, 34);
		textFieldMinMultiplicador.setFont(fonteTextfiled);
		
		JTextField textFieldMaxmultiplicador = new JTextField();
		textFieldMaxmultiplicador.setBounds(260, 255, 140, 34);
		textFieldMaxmultiplicador.setFont(fonteTextfiled);
		
		// Criando button \\
		
		JButton buttonCalcular = new JButton("Calcular");
		buttonCalcular.setBackground(Color.green);
		buttonCalcular.setBounds(260, 320, 100, 30);
		buttonCalcular.setFont(fonteTextfiled);
		
		JButton buttonLimpar = new JButton("Limpar");
		buttonLimpar.setBackground(Color.YELLOW);
		buttonLimpar.setBounds(380, 320, 100, 30);
		buttonLimpar.setFont(fonteTextfiled);
		
		
		
		
		
		painel.add(tituloPrincipal);
		painel.add(subTitulo);
		painel.add(rotuloMultiplicando);
		painel.add(rotuloMinMultiplicador);
		painel.add(rotuloMaxMultiplicador);
		painel.add(rotuloResultado);
		
		
		painel.add(textfiledMultiplicando);
		painel.add(textFieldMinMultiplicador);
		painel.add(textFieldMaxmultiplicador);
		
		painel.add(buttonCalcular);
		painel.add(buttonLimpar);
		
		tela.setVisible(true);
		
		
		
		

		
		
		
		
	}

}

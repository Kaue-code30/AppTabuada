package br.sp.senai.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import br.sp.senai.jandira.Tabuada;

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
		
		URL url = getClass().getResource("/image/calc.png");
		ImageIcon icon = new ImageIcon(url);
		JLabel labelTabuada = new JLabel(icon);
		labelTabuada.setBounds(-20, 30, 150, 80);
		
		
	// criar o container para colocar os objetos dentro \\
		
		Container painel = tela.getContentPane();
		painel.setBackground(Color.WHITE);
		
		
	// Criação das fontes \\
		
		Font fonteTitulo = new Font("SansSerif", Font.BOLD, 17);
		Font fonteRotulos = new Font("SansSerif", Font.BOLD, 15);
		Font fonteTextfiled = new Font("SansSerif", Font.BOLD, 14);
		
		
	// criando os rotulos com o Jlabel \\
		
		JLabel tituloPrincipal = new JLabel("Tabuada 1.0");
		tituloPrincipal.setBounds(120, 30, 100, 50);
		tituloPrincipal.setForeground(Color.RED);
		tituloPrincipal.setFont(fonteTitulo);
		
		JLabel subTitulo = new JLabel();
		subTitulo.setText(" Com a tabuada 1.0 seus problemas acabarm."
		+ " Calcule a tabuada ");
		subTitulo.setBounds(120, 5, 370, 150);
		subTitulo.setForeground(Color.gray);
		JLabel continuação = new JLabel("que desejar em segundos!!");
		continuação.setBounds(122, 20, 200, 150);
		continuação.setForeground(Color.gray);
		
		
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
		
	// criando a caixa para aparecer o resultado \\
		
		Color verde = new Color(74,108,94);
	
		JList resultadoTabuada = new JList();
		JScrollPane caixaResultado = new JScrollPane(resultadoTabuada);
		caixaResultado.setBounds(10, 380, 480, 220);
		resultadoTabuada.setBackground(verde);
		resultadoTabuada.setForeground(Color.white);
		resultadoTabuada.setFont(fonteTextfiled);
		
	// Criando as caixas de entrada com jtextfiled \\
		
		JTextField textfiledMultiplicando = new JTextField();
		textfiledMultiplicando.setBounds(260, 135, 140, 34);
		textfiledMultiplicando.setFont(fonteTextfiled);
		textfiledMultiplicando.setHorizontalAlignment(JTextField.RIGHT);
		
		
		JTextField textFieldMinMultiplicador = new JTextField();
		textFieldMinMultiplicador.setBounds(260, 195, 140, 34);
		textFieldMinMultiplicador.setFont(fonteTextfiled);
		textFieldMinMultiplicador.setHorizontalAlignment(JTextField.RIGHT);
		
		JTextField textFieldMaxmultiplicador = new JTextField();
		textFieldMaxmultiplicador.setBounds(260, 255, 140, 34);
		textFieldMaxmultiplicador.setFont(fonteTextfiled);
		textFieldMaxmultiplicador.setHorizontalAlignment(JTextField.RIGHT);
		
		// Criando button \\
		
		JButton buttonCalcular = new JButton("Calcular");
		buttonCalcular.setBackground(Color.green);
		buttonCalcular.setBounds(260, 320, 100, 30);
		buttonCalcular.setFont(fonteTextfiled);
		
		JButton buttonLimpar = new JButton("Limpar");
		buttonLimpar.setBackground(Color.YELLOW);
		buttonLimpar.setBounds(380, 320, 100, 30);
		buttonLimpar.setFont(fonteTextfiled);
		
		
	// colocando os atributos no container \\
		
		painel.add(tituloPrincipal);
		painel.add(subTitulo);
		painel.add(continuação);
		painel.add(rotuloMultiplicando);
		painel.add(rotuloMinMultiplicador);
		painel.add(rotuloMaxMultiplicador);
		painel.add(rotuloResultado);
		painel.add(caixaResultado);
		painel.add(labelTabuada);
		painel.add(textfiledMultiplicando);
		painel.add(textFieldMinMultiplicador);
		painel.add(textFieldMaxmultiplicador);
		painel.add(buttonCalcular);
		painel.add(buttonLimpar);
		
		tela.setVisible(true);
		
		
		
		
		
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (textfiledMultiplicando.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "O multiplicando é obrigatório!");
				} 
				else if(textFieldMinMultiplicador.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "O Minímo multiplicador é obrigatório");
				}
				else if(textFieldMaxmultiplicador.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "O Máximo multiplicador é obrigatório!");
			
				} else {
					Tabuada tabuada = new Tabuada();
					tabuada.numeroMultiplicado = Integer.parseInt(textfiledMultiplicando.getText());
					tabuada.minMultiplicador = Integer.parseInt(textFieldMinMultiplicador.getText());
					tabuada.maxMultiplicador = Integer.parseInt(textFieldMaxmultiplicador.getText());
					DefaultListModel<String> limpar1 = new DefaultListModel<String>();
					limpar1.clear();
					
					resultadoTabuada.setBackground(verde);
					resultadoTabuada.setForeground(Color.white);
					resultadoTabuada.setFont(fonteTextfiled);
			
					DefaultListModel<String> novo = new DefaultListModel<String>();
					for( String percorrer : tabuada.getTabuada()) {
						novo.addElement(percorrer);
						resultadoTabuada.setModel(novo);
					}
				}
				
				
				
			
			}
		});
		
		buttonLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				textfiledMultiplicando.setText("");
				textFieldMinMultiplicador.setText("");
				textFieldMaxmultiplicador.setText("");
				
				DefaultListModel<String> limpar = new DefaultListModel<String>();	
				limpar.clear();
				textFieldMinMultiplicador.setText("");
				textfiledMultiplicando.setText("");
				textFieldMaxmultiplicador.setText("");
				resultadoTabuada.setModel(limpar);
				
				
			}
			
			
		});
		
		
		
		

		
		
		
		
	}

}

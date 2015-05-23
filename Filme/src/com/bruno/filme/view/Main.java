package com.bruno.filme.view;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import com.bruno.filme.contrato.IFilme;
import com.bruno.filme.contrato.IFilmeController;
import com.bruno.filme.contrato.IFilmeDAO;
import com.bruno.filme.controller.FilmeControlador;
import com.bruno.filme.dao.FilmeDAO;
import com.bruno.filme.factory.ConnectionFactory;
import com.bruno.filme.modelo.Filme;


public class Main extends JFrame{

	private JTextField ipBanco;
	private JButton botaoConfirmar;
	
	public Main(){
		this.setTitle("Teste");
		this.setSize(300, 300);
		this.setLocation(200,200);
		this.getContentPane().setLayout(new FlowLayout());
		ipBanco = new JTextField();
		ipBanco.setPreferredSize(new Dimension(100,20));
		botaoConfirmar = new JButton();
		botaoConfirmar.setText("ENVIAR");
		
		botaoConfirmar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					Connection conexao = new ConnectionFactory(ipBanco.getText()).getConnection();
					IFilmeDAO dao = new FilmeDAO(ipBanco.getText());
					IFilme filme = new Filme();
					filme.setTitulo("Mauro");
					filme.setGenero("Pornô");
					filme.setSinopse("Mauro pegando as novinha");
					filme.setAnoFilmagem("2015");
					filme.setAnoLancamento("2015");
					filme.setEstudioDeFilmagem("Quixadá");
					
					dao.salvar(filme);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		this.add(ipBanco);
		this.add(botaoConfirmar);
		
	}
	
	public static void main(String[] args){
		new Main().setVisible(true);;
	}
	
	
}
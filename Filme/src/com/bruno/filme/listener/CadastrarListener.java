package com.bruno.filme.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import com.bruno.filme.contrato.IFilmeController;
import com.bruno.filme.controller.FilmeControlador;

public class CadastrarListener implements ActionListener{

	private String titulo;
	private String sinopse;
	private String genero;
	private String estudioDeFilmagem;
	private String anoLancamento;
	private String anoFilmagem;
	
	
	public CadastrarListener(String titulo, String sinopse, String genero, String estudioDeFilmagem, String anoLancamento, String anoFilmagem) {
		// TODO Auto-generated constructor stub
		this.titulo = titulo;
		this.sinopse = sinopse;
		this.genero = genero;
		this.estudioDeFilmagem = estudioDeFilmagem;
		this.anoFilmagem = anoFilmagem;
		this.anoLancamento = anoLancamento;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		IFilmeController controlador = new FilmeControlador();
		System.out.println(titulo);
		try {
			controlador.criarFilme(titulo, sinopse, genero, anoFilmagem, anoLancamento, estudioDeFilmagem);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}

package com.bruno.filme.controller;

import java.sql.SQLException;
import java.util.Iterator;

import com.bruno.filme.contrato.IFilme;
import com.bruno.filme.contrato.IFilmeController;
import com.bruno.filme.contrato.IFilmeDAO;
import com.bruno.filme.contrato.IPessoa;
import com.bruno.filme.dao.FilmeDAO;
import com.bruno.filme.iterator.FilmeIterator;
import com.bruno.filme.modelo.Filme;

public class FilmeControlador implements IFilmeController{

	@Override
	public void criarFilme(String titulo, String sinopse, String genero,
			String anoFilmagem, String anoLancamento, String estudioDeFilmagem) throws SQLException {
		
		IFilme filme = new Filme();
		filme.setTitulo(titulo);
		filme.setSinopse(sinopse);
		filme.setGenero(genero);
		filme.setAnoFilmagem(anoFilmagem);
		filme.setAnoLancamento(anoLancamento);
		filme.setEstudioDeFilmagem(estudioDeFilmagem);
		
		IFilmeDAO filmeDAO = new FilmeDAO();
		filmeDAO.salvar(filme);
	}

	@Override
	public void editarFilme(String titulo, String sinopse, String genero,
			String anoFilmagem, String anoLancamento, String estudioFilmagem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adicionarAtor(IPessoa ator) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adicionarDiretor(IPessoa diretor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removerAtor(int idAtor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removerDiretor(int idDiretor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removerFilme(int idFilme) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IFilme buscarFilmePorId(int id) throws SQLException {
		IFilmeDAO filmeDAO = new FilmeDAO();
		Iterator<IFilme> filmes = filmeDAO.listar();
		
		while(filmes.hasNext()){
			if(filmes.next().getId() == id)
				return filmes.next();
		}
		
	}

	@Override
	public Iterator<IFilme> buscarFilmePorTitulo(String titulo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<IFilme> listarFilmes() throws SQLException {
		IFilmeDAO filmeDAO = new FilmeDAO();
		Iterator<IFilme> filmes = filmeDAO.listar();
		return filmes;
	}

		
}

package com.bruno.filme.controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bruno.filme.contrato.IFilme;
import com.bruno.filme.contrato.IFilmeController;
import com.bruno.filme.contrato.IFilmeDAO;
import com.bruno.filme.contrato.IPessoa;
import com.bruno.filme.contrato.IPessoaFilmeDAO;
import com.bruno.filme.dao.FilmeDAO;
import com.bruno.filme.dao.PessoaFilmeDAO;
import com.bruno.filme.factory.ConnectionFactory;
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
	public void editarFilme(int id,String titulo, String sinopse, String genero,
			String anoFilmagem, String anoLancamento, String estudioFilmagem) throws SQLException {
		
		IFilme filme = new Filme();
		filme.setId(id);
		filme.setTitulo(titulo);
		filme.setSinopse(sinopse);
		filme.setGenero(genero);
		filme.setAnoFilmagem(anoFilmagem);
		filme.setAnoLancamento(anoLancamento);
		filme.setEstudioDeFilmagem(estudioFilmagem);
		
		IFilmeDAO filmeDAO = new FilmeDAO();
		filmeDAO.editar(filme);
		
	}
	
	
	
	@Override
	public void removerFilme(int idFilme) throws SQLException {
		
		IFilmeDAO filmeDAO = new FilmeDAO();
		filmeDAO.remover(idFilme);
		
	}

	@Override
	public IFilme buscarFilmePorId(int id) throws SQLException {
		IFilmeDAO filmeDAO = new FilmeDAO();
		Iterator<IFilme> filmes = filmeDAO.listar();
		
		while(filmes.hasNext()){
			IFilme aux = filmes.next();
			if(aux.getId() == id)
				return aux;
		}
		
		return null;
	}

	@Override
	public IFilme buscarFilmePorTitulo(String titulo) throws SQLException {
		IFilmeDAO filmeDAO = new FilmeDAO();
		Iterator<IFilme> filmesListados = filmeDAO.listar();
		
		while(filmesListados.hasNext()){
			IFilme aux = filmesListados.next();
			if(aux.getTitulo().equals(titulo))
				return aux;
		}
		
		return null;
	}

	@Override
	public Iterator<IFilme> listarFilmes() throws SQLException {
		IFilmeDAO filmeDAO = new FilmeDAO();
		Iterator<IFilme> filmes = filmeDAO.listar();
		return filmes;
	}

	@Override
	public void setAtoresDoFilme(int idFilme, Iterator<IPessoa> atores) throws SQLException {
		// TODO Auto-generated method stub
		IFilme filme = this.buscarFilmePorId(idFilme);
		if(filme!=null)
			filme.setAtores(atores);
	}

	@Override
	public Iterator<IPessoa> getAtoresDoFilme(int idFilme) throws SQLException {
		// TODO Auto-generated method stub
		IFilme filme = this.buscarFilmePorId(idFilme);
		return filme.getAtores();
		
	}

	@Override
	public void setDiretorDoFilme(int idFilme, IPessoa diretor) throws SQLException {
		// TODO Auto-generated method stub
		IFilme filme = this.buscarFilmePorId(idFilme);
		if(filme!=null)
			filme.setDiretor(diretor);
	}

		
}

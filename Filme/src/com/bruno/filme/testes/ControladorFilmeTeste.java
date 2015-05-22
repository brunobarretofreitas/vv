package com.bruno.filme.testes;

import java.sql.SQLException;
import java.util.Iterator;

import junit.framework.TestCase;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnit4Mockery;

import com.bruno.filme.contrato.IFilme;
import com.bruno.filme.contrato.IFilmeController;
import com.bruno.filme.contrato.IFilmeDAO;
import com.bruno.filme.contrato.IPessoa;
import com.bruno.filme.controller.FilmeControlador;
import com.bruno.filme.dao.FilmeDAO;



public class ControladorFilmeTeste extends TestCase{
	
	
	public void testeCriarFilmeEVerificarSeFoiIncluidoNoBanco() throws SQLException{
		
		IFilmeController controlador = new FilmeControlador();
		controlador.criarFilme("Harry", "legal", "aventura",
				"1999", "2001", "Warner");
		
		assertEquals(controlador.listarFilmes().hasNext(), true);		
	}
	
	public void testeRemoverFilmeEVerificarSeFoiExcluidoDoBanco() throws SQLException{
		IFilmeDAO filmeDAO = new FilmeDAO();
		Iterator<IFilme> filmes = filmeDAO.listar();
		
		
		IFilme filmeTeste = null;
		
		filmeTeste = filmes.next();
		
		filmeDAO.remover(filmeTeste.getId());
		
		
		
		
	}

}

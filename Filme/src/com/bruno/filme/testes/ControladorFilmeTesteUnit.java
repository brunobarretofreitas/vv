package com.bruno.filme.testes;

import java.sql.SQLException;
import java.util.Iterator;

import junit.framework.TestCase;


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
import com.bruno.filme.iterator.FilmeIterator;



public class ControladorFilmeTesteUnit extends TestCase{
	
	
	public void testeAdicionarDoisFilmesAoBancoEVerificarSeOsDoisSaoListados() throws SQLException{
		IFilmeDAO filmeDAO = new FilmeDAO();
		IFilmeController controlador = new FilmeControlador();
		
		controlador.criarFilme("Youasd", "legal", "aventura",
				"1999", "2001", "Warner");
		
		controlador.criarFilme("dasdas", "legal", "aventura",
				"1999", "2001", "Mossoro Pictures");
		
		
		Iterator<IFilme> filmes = filmeDAO.listar();
		
		IFilme aux1 = controlador.buscarFilmePorTitulo("Youasd");
		IFilme aux2 = controlador.buscarFilmePorTitulo("dasdas");
		
		controlador.removerFilme(aux1.getId());
		controlador.removerFilme(aux1.getId());
		
		assertEquals(aux1 != null && aux2 != null, true);
	}

	
	
	public void testeCriarFilmeEVerificarSeFoiIncluidoNoBanco() throws SQLException{
		
		IFilmeController controlador = new FilmeControlador();
		controlador.criarFilme("Harry", "legal", "aventura",
				"1999", "2001", "Warner");
		IFilme aux = controlador.listarFilmes().next();
		
		
		controlador.removerFilme(aux.getId());
		assertEquals(controlador.listarFilmes().hasNext(), true);	
		

	}
		
	public void testeEditarFilmeEVerificarSeSeuTituloFoiAlterado() throws SQLException{
		IFilmeDAO filmeDAO = new FilmeDAO();
		IFilmeController controlador = new FilmeControlador();
		controlador.criarFilme("Har", "legal", "aventura",
				"1999", "2001", "Warner");
		
		
		Iterator<IFilme> filmes = controlador.listarFilmes();
		
		IFilme teste = null;
		while(filmes.hasNext())
			teste = filmes.next();
		
		controlador.editarFilme(teste.getId(), "Hermione", "Harry Potter",
				"romance", "2000", "2001", "warner");
		
		teste.setTitulo("Hermione");
		
		IFilme filmeAlterado = controlador.buscarFilmePorId(teste.getId());
		
		
		assertEquals(teste.getTitulo(), filmeAlterado.getTitulo());
	}

	public void testeRemoverFilmeEVerificarSeFoiExcluidoDoBanco() throws SQLException{
		IFilmeDAO filmeDAO = new FilmeDAO();
		IFilmeController controlador = new FilmeControlador();
		controlador.criarFilme("hello", "legal", "aventura",
				"1999", "2001", "Warner");
		Iterator<IFilme> filmes = controlador.listarFilmes();
		IFilme teste = filmes.next();
		
		controlador.removerFilme(teste.getId());
		
		assertEquals(controlador.buscarFilmePorId(teste.getId()), null);
	}

	public void testeAdicionarUmFilmeEBuscarEleNoBancoPeloTitulo() throws SQLException{
		IFilmeDAO filmeDAO = new FilmeDAO();
		IFilmeController controlador = new FilmeControlador();
		
		controlador.criarFilme("leonardo", "legal", "aventura",
				"1999", "2001", "Warner");
	
		IFilme filmeBuscado = controlador.buscarFilmePorTitulo("leonardo");
		controlador.removerFilme(filmeBuscado.getId());
		
		assertEquals(filmeBuscado != null, true);
		
	}
	

}

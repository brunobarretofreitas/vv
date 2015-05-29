package com.bruno.filme.contrato;

import java.sql.SQLException;
import java.util.Iterator;

public interface IFilmeController {
	
	public void criarFilme(String titulo, String sinopse, String genero, 
			String anoFilmagem, String anoLancamento, String estudioFilmagem) throws SQLException;
	
	public void editarFilme(int id,String titulo, String sinopse, String genero,
			String anoFilmagem, String anoLancamento, String estudioFilmagem) throws SQLException;
		
	public void removerFilme(int idFilme) throws SQLException;
	
	public void setAtoresDoFilme(int idFilme, Iterator<IPessoa> atores) throws SQLException;
	
	public Iterator<IPessoa> getAtoresDoFilme(int idFilme) throws SQLException;
	
	public void setDiretorDoFilme(int idFilme, IPessoa diretor) throws SQLException;
	
	public IFilme buscarFilmePorId(int id) throws SQLException;

	public IFilme buscarFilmePorTitulo(String titulo) throws SQLException;
	
	public Iterator<IFilme> listarFilmes() throws SQLException;
}

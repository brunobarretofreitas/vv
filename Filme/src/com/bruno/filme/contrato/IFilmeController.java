package com.bruno.filme.contrato;

import java.sql.SQLException;
import java.util.Iterator;

public interface IFilmeController {
	
	public void criarFilme(String titulo, String sinopse, String genero, 
			String anoFilmagem, String anoLancamento, String estudioFilmagem) throws SQLException;
	
	public void editarFilme(String titulo, String sinopse, String genero,
			String anoFilmagem, String anoLancamento, String estudioFilmagem);
	
	public void adicionarAtor(IPessoa ator);
	
	public void adicionarDiretor(IPessoa diretor);
	
	public void removerAtor(int idAtor);
	
	public void removerDiretor(int idDiretor);
	
	public void removerFilme(int idFilme);
	
	public IFilme buscarFilmePorId(int id);

	public Iterator<IFilme> buscarFilmePorTitulo(String titulo);
	
	public Iterator<IFilme> listarFilmes() throws SQLException;
}

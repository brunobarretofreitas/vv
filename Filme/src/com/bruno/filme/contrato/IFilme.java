package com.bruno.filme.contrato;
import java.util.Iterator;

/**
 * Interface responsável por disponibilizar acesso à informações de um filme.
 * 
 */
public interface IFilme{

	/**
	 * Retorna o Id do filme.
	 * 
	 */
	public int getId();
	
	/**
	 * Altera o Id do filme.
	 * 
	 */
	public void setId(int id);
	
	/**
	 * Retorna o título do filme.
	 * 
	 */
	public String getTitulo();
	
	/**
	 * Altera o título do filme.
	 * 
	 */
	public void setTitulo(String titulo);
	
	/**
	 * Retorna a sinópse do filme.
	 * 
	 */
	public String getSinopse();
	
	/**
	 * Altera a sinópse do filme.
	 * 
	 */
	public void setSinopse(String sinopse);
	
	/**
	 * Retorna o gênero do filme.
	 * 
	 */
	public String getGenero();
	
	/**
	 * Altera o gênero do filme.
	 * 
	 */
	public void setGenero(String genero);
	
	/**
	 * Retorna informações do diretor do filme.
	 * 
	 */
	public IPessoa getDiretor();
	
	/**
	 * Altera o diretor do filme.
	 * 
	 */
	public void setDiretor(IPessoa diretor);
	
	/**
	 * Retorna os atores que participam do filme.
	 * 
	 */
	public Iterator<IPessoa> getAtores();
	
	/**
	 * Altera os atores que participam do filme.
	 * 
	 */
	public void setAtores(Iterator<IPessoa> atores);
	
	/**
	 * Retorna o ano de filmagem do filme.
	 * 
	 */
	public String getAnoFilmagem();
	
	/**
	 * Altera o ano de filmagem do filme.
	 * 
	 */
	public void setAnoFilmagem(String anoFilmagem);
	
	/**
	 * Retorna o ano de lançamento do filme.
	 * 
	 */
	public String getAnoLancamento();
	
	/**
	 * Altera o ano de lançamento do filme.
	 * 
	 */
	public void setAnoLancamento(String anoLancamento);
	
	/**
	 * Retorna o estúdio de filmagem do filme.
	 * 
	 */
	public String getEstudioDeFilmagem();
	
	/**
	 * Altera o estúdio de filmagem do filme.
	 * 
	 */
	public void setEstudioDeFilmagem(String estudioDeFilmagem);
	
}
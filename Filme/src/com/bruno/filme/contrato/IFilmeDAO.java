package com.bruno.filme.contrato;
import java.util.Iterator;

/**
 * Interface responsável por disponibilizar CRUD no módulo Filmes.
 */
public interface IFilmeDAO {
	
	/**
	 * Método responsável por inserir um filme no banco de dados.
	 * 
	 */
	public void salvar(IFilme filme);
	
	/**
	 * Método responsável por alterar informações de um filme do banco de dados.
	 * 
	 */
	public void editar(IFilme filme);
	
	/**
	 * Método responsável por remover um filme do banco de dados.
	 * 
	 */
	public void remover(IFilme filme);
	
	/**
	 * Método responsável por retornar a lista de todos os filmes do banco de dados. 
	 * 
	 */
	public Iterator<IFilme> listar();
	
}
package com.bruno.filme.contrato;
import java.sql.SQLException;
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
	public void editar(IFilme filme) throws SQLException;
	
	/**
	 * Método responsável por remover um filme do banco de dados.
	 * 
	 */
	public void remover(int idFilme) throws SQLException; //Modificado de IFilme filme para int idFilme.
	
	/**
	 * Método responsável por retornar a lista de todos os filmes do banco de dados. 
	 * 
	 */
	public Iterator<IFilme> listar();
	
}

package com.bruno.filme.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bruno.filme.contrato.IFilme;
import com.bruno.filme.contrato.IFilmeDAO;
import com.bruno.filme.factory.ConnectionFactory;
import com.bruno.filme.iterator.FilmeIterator;
import com.bruno.filme.modelo.Filme;

public class FilmeDAO implements IFilmeDAO{

	private Connection conexao;
	
	public FilmeDAO(String host) throws SQLException{
		this.conexao = new ConnectionFactory(host).getConnection();
	}
	
	public FilmeDAO() throws SQLException{
		this.conexao = new ConnectionFactory().getConnection();
	}
	
	@Override
	public void salvar(IFilme filme) {
		// TODO Auto-generated method stub
		String sql = "insert into Filme(titulo, sinopse, genero, anoFilmagem, anoLancamento, estudioFilmagem) values(?,?,?,?,?,?)";
		PreparedStatement stmt = null;
		
		try{
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, filme.getTitulo());
			stmt.setString(2, filme.getSinopse());
			stmt.setString(3, filme.getGenero());
			stmt.setString(4, filme.getAnoFilmagem());
			stmt.setString(5, filme.getAnoLancamento());
			stmt.setString(6, filme.getEstudioDeFilmagem());
			
			stmt.execute();
		
		}catch(Exception e){
			e.printStackTrace();
		
			try{
				conexao.rollback();
			}catch(SQLException e1){
				System.out.println(e1.getStackTrace());
			}
		}
	}

	@Override
	public void editar(IFilme filme) {
		// TODO Auto-generated method stub
		int id_filme = filme.getId();
		String titulo = filme.getTitulo();
		String sinopse = filme.getSinopse();
		String genero = filme.getGenero();
		String ano_filmagem = filme.getAnoFilmagem();
		String ano_lancamento = filme.getAnoLancamento();
		String estudio_filmagem = filme.getEstudioDeFilmagem();
		try {
		
		String sql = "update Filme set titulo = ?,sinopse = ?,genero = ?,anoFilmagem = ?,"
				+ "anoLancamento = ?,estudioFilmagem = ? where id = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, titulo);
		stmt.setString(2, sinopse);
		stmt.setString(3, genero);
		stmt.setString(4, ano_filmagem);
		stmt.setString(5, ano_lancamento);
		stmt.setString(6, estudio_filmagem);
		stmt.setInt(7, id_filme);		
		
		stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Iterator<IFilme> listar() {
		// TODO Auto-generated method stub
		PreparedStatement stmt = null;

		
		try{

			stmt = conexao.prepareStatement("SELECT * FROM Filme");
			ResultSet result = stmt.executeQuery();
			
			List<IFilme> filmes = new ArrayList<IFilme>();
			
			while(result.next()){
				IFilme filme = new Filme();
				filme.setId(result.getInt("id"));
				filme.setTitulo(result.getString("titulo"));
				filme.setSinopse(result.getString("sinopse"));
				filme.setGenero(result.getString("genero"));
				filme.setAnoFilmagem("anoFilmagem");
				filme.setAnoLancamento("anoLancamento");
				filme.setEstudioDeFilmagem("estudioDeFilmagem");
			
				filmes.add(filme);
				
			}
			
			Iterator<IFilme> iterator = new FilmeIterator(filmes);
			
			return iterator;
			
		}catch(SQLException e){e.printStackTrace();}
	
		return null;
	}

	@Override
	public void remover(int idFilme) throws SQLException {
		
		String sql = "DELETE FROM Filme WHERE id = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, idFilme);
		
		stmt.execute();
		
	}

}

package com.bruno.filme.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;

import com.bruno.filme.contrato.IFilme;
import com.bruno.filme.contrato.IFilmeDAO;
import com.bruno.filme.factory.ConnectionFactory;

public class FilmeDAO implements IFilmeDAO{

	private Connection conexao;
	
	public FilmeDAO() throws SQLException{
		this.conexao = new ConnectionFactory().getConnection();
	}
	
	@Override
	public void salvar(IFilme filme) {
		// TODO Auto-generated method stub
		String sql = "insert into filme(titulo, sinopse, genero, anoFilmagem, anoLancamento, estudioFilmagem) values(?,?,?,?,?,?)";
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
		String sql = "update filme set  "
	}

	@Override
	public void remover(IFilme filme) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Iterator<IFilme> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}

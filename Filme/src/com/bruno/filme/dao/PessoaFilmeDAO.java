package com.bruno.filme.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bruno.filme.contrato.IPessoaFilmeDAO;
import com.bruno.filme.factory.ConnectionFactory;

public class PessoaFilmeDAO implements IPessoaFilmeDAO{

	public Connection conexao;
	
	public PessoaFilmeDAO() throws SQLException {
		// TODO Auto-generated constructor stub
		conexao = new ConnectionFactory().getConnection();
	}
	
	@Override
	public void adicionarDiretorFilme(int idDiretor, int idFilme) {
		String sql = "insert into DiretorDoFilme (id_filme, id_diretor) values(?,?)";
		PreparedStatement stmt = null;
		
		try{
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, idFilme);
			stmt.setInt(2, idDiretor);
			
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
	public void adicionarAtorFilme(int idAtor, int idFilme) {
		// TODO Auto-generated method stub

		String sql = "insert into AtorDoFilme (id_filme, id_ator) values(?,?)";
		PreparedStatement stmt = null;
		
		try{
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, idFilme);
			stmt.setInt(2, idAtor);
			
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
	public void removerDiretorFilme(int idDiretor, int idFilme) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM DiretorDoFilme WHERE id_filme = ? and id_diretor = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, idFilme);
		stmt.setInt(2, idDiretor);
		
		stmt.execute();

	}

	@Override
	public void removerAtorFilme(int idAtor, int idFilme) throws SQLException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
			String sql = "DELETE FROM DiretorDoFilme WHERE id_filme = ? and id_ator = ?";
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, idFilme);
			stmt.setInt(2, idAtor);				
			
			stmt.execute();

	}

}

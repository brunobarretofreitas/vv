package com.bruno.filme.contrato;

import java.sql.SQLException;

public interface IPessoaFilmeDAO {

	public void adicionarDiretorFilme(int idDiretor, int idFilme);
	public void adicionarAtorFilme(int idAtor, int idFilme);
	public void removerDiretorFilme(int idDiretor, int idFilme) throws SQLException;
	public void removerAtorFilme(int idAtor, int idFilme) throws SQLException;
	
}

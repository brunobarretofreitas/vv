package com.bruno.filme.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private String host = "localhost";
	private String user = "root";
	private String password = "pamellahayana";
	private String db = "vv";
	
	//carrega o driver jdbc
	static{
		try{
			Class.forName("com.mysql.jdbc.Driver");
		} catch(ClassNotFoundException e){
			throw new RuntimeException();	
		}
	}
	
	//obtem conexao com banco de dados
	public Connection getConnection() throws SQLException{
		return DriverManager.getConnection("jdbc:mysql://"+host+"/"+db+"", user, password);
	}
}

package com.nutricao.sistemaNutricional.dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	private String url = "jdbc:mysql://127.0.0.1:3306/nutricao?useSSL=false";
	private String usuario = "root";
	private String senha = "z3r0c4ll";

	public Connection obertConexao() {
		Connection cn = null;
		try {
			cn = DriverManager.getConnection(url, usuario, senha);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return cn;
	}

	//outra forma de criar metodo de conexao com o banco 
	public Connection obertConexao2() throws SQLException {
		return DriverManager.getConnection(url, usuario, senha);
	}
}

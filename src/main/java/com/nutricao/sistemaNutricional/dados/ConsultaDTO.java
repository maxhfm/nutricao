package com.nutricao.sistemaNutricional.dados;



import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.SQLException;

import com.nutricao.sistemaNutricional.model.Consulta;


public class ConsultaDTO {
		
		private Connection conexao = null;
		
		public ConsultaDTO() {
			conexao = new Conexao().obertConexao();
		}
	
		public void salvar(Consulta consulta) throws SQLException{
			PreparedStatement ps = conexao.prepareStatement("INSERT INTO consulta (dataConsulta, idPaciente) values (?,?);");	
		ps.setString(1, consulta.getDataConsulta());
		ps.setLong(2, consulta.getPaciente().getId());
		ps.execute();
		}

		
	

}

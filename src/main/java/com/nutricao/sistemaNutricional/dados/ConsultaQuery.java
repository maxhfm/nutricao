package com.nutricao.sistemaNutricional.dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.nutricao.sistemaNutricional.converter.ConvertDateLocalDate;
import com.nutricao.sistemaNutricional.model.Consulta;
import com.nutricao.sistemaNutricional.model.Paciente;


public class ConsultaQuery {
	private Connection conection = null;
	ConvertDateLocalDate conversaoData = new ConvertDateLocalDate();

	public ConsultaQuery() {
		conection = new Conexao().obertConexao();
	}
	
	public List<Consulta> proximasConsultas() throws SQLException{
		Long id = null;
		String nome, telefone = null;
		LocalDate dataConsulta, proximaConsulta = null; 
		List<Consulta> consultas = new ArrayList<>();
		
		PreparedStatement ps = conection.prepareStatement("select c.id, p.nome,p.telefone1, c.data_consulta,c.proxima_consulta from paciente p inner join consulta c on p.id=c.paciente_id order by proxima_consulta asc");
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			id = rs.getLong("id");
			nome = rs.getString("nome");
			telefone = rs.getString("telefone1");
			dataConsulta = conversaoData.toLocalDate(rs.getDate("data_consulta"));
			proximaConsulta = conversaoData.toLocalDate(rs.getDate("proxima_consulta"));			
			consultas.add(new Consulta(id, new Paciente(nome, telefone), dataConsulta, proximaConsulta));
		}
		
		
		return consultas;
	}

	

}

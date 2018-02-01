package com.nutricao.sistemaNutricional.dados;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import com.nutricao.sistemaNutricional.model.Paciente;

public class PacienteDTO {
	
	private Connection conection = null;
	
	
	
	public PacienteDTO() {
		conection = new Conexao().obertConexao();
	}

	public void salvar(Paciente paciente) throws SQLException {
		PreparedStatement ps = conection.prepareStatement("insert into paciente (nome, dataNascimento, sexo, telefone1, telefone2, email, objetivo, cpf) values (?,?,?,?,?,?,?,?)");
		ps.setString(1, paciente.getNome());
		
		ps.setString(3, paciente.getSexo());
		ps.setString(4, paciente.getTelefone1());
		ps.setString(5, paciente.getTelefone2());
		ps.setString(6, paciente.getEmail());
		ps.setString(7, paciente.getObjetivo());
		ps.setString(8, paciente.getCpf());
		ps.execute();
	}
	
	public List<Paciente> consultaTodos() throws SQLException{
		Long id = null;
		String nome, cpf, telefone1, sexo, email, objetivo, telefone2 = null;
		List<Paciente> pacientes = new ArrayList<>();
		PreparedStatement ps = conection.prepareStatement("select * from paciente");
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			id = rs.getLong("id");
			nome = rs.getString("nome");
			cpf = rs.getString("cpf");
			Date data = rs.getDate("dataNascimento");
	
			telefone1 = rs.getString("telefone1");
			telefone2 = rs.getString("telefone2");
			objetivo = rs.getString("objetivo");
			email = rs.getString("email");
			sexo = rs.getString("sexo");			
			//pacientes.add(new Paciente(id, nome, cpf, dataNascimento, sexo, telefone1, telefone2, email, objetivo));
		}
		return pacientes;
	}
}

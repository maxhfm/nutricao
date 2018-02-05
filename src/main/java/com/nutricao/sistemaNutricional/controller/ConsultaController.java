package com.nutricao.sistemaNutricional.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.nutricao.sistemaNutricional.dados.ConsultaPersistencia;
import com.nutricao.sistemaNutricional.dados.PacientePersistencia;
import com.nutricao.sistemaNutricional.model.Consulta;

@Controller
public class ConsultaController {
	
	@Autowired
	private ConsultaPersistencia consultasPersiste; 
	@Autowired
	private PacientePersistencia paciente;
	
	@GetMapping("/nutri/consulta/cadastro")
	public String cadastroConsulta(Model model, Consulta consulta) {
		model.addAttribute("consulta", consulta);
		model.addAttribute("pacientes", paciente.findAll());		
		return "/nutri/consulta/cadastro";
	}
	
	@PostMapping("/nutri/consulta/cadastro")
	public String cadastradoConsulta(Model model, Consulta consulta) throws SQLException {
		consulta.setProximaConsulta(consulta.adiciona30diasConsulta(consulta.getDataConsulta()));
		consultasPersiste.save(consulta);
		return "redirect:/nutri/consulta/cadastro";
	}
	
	@GetMapping("/nutri/consulta/pesquisar")
	public String consultaConsulta(Consulta consulta, BindingResult errors, Model model) throws SQLException {
		model.addAttribute("consultas", paciente.consultaPaciente());
		return "/nutri/consulta/pesquisar";
	}

}

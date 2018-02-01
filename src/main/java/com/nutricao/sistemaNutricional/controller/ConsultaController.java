package com.nutricao.sistemaNutricional.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.nutricao.sistemaNutricional.dados.ConsultaPersistencia;
import com.nutricao.sistemaNutricional.model.Consulta;
import com.nutricao.sistemaNutricional.model.Paciente;


@Controller
public class ConsultaController {
	
	private ConsultaPersistencia consultasPersiste; 
	
	@GetMapping("/nutri/consulta/cadastro")
	public String cadastroConsulta(Model model, Consulta consulta, Paciente paciente) {
		model.addAttribute("consulta", consulta);
		model.addAttribute("paciente", paciente);
		return "/nutri/consulta/cadastro";
	}
	
	@PostMapping("/nutri/consulta/cadastro")
	public String cadastradoConsulta(Model model, Consulta consulta) throws SQLException {
		
		return "redirect:/nutri/consulta/cadastro";
	}
	
	@GetMapping("/nutri/consulta/pesquisar")
	public String consultaConsulta(Consulta consulta, BindingResult errors, Model model) throws SQLException {
		
	
		return "/nutri/consulta/pesquisar";
	}

}

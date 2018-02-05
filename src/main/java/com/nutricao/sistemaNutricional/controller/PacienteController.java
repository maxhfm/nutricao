package com.nutricao.sistemaNutricional.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.nutricao.sistemaNutricional.dados.PacientePersistencia;
import com.nutricao.sistemaNutricional.model.Consulta;
import com.nutricao.sistemaNutricional.model.Paciente;



@Controller

public class PacienteController {
	
	@Autowired
	private PacientePersistencia pacientes;
	
	
	@GetMapping("/nutri/paciente/cadastro")
	public String cadastroPaciente(Model model, Paciente paciente, Consulta consulta) {
		model.addAttribute("paciente", paciente);
		model.addAttribute("consulta", consulta);
		
		for (Paciente p : pacientes.findAll()) {
			System.out.println(p.getNome());
		}
		return "/nutri/paciente/cadastro";
	}
	
	@PostMapping("/nutri/paciente/cadastro")
	public String cadastradoPaciente(Model model, Paciente paciente, Consulta consulta) throws SQLException {
		pacientes.save(paciente);
		return "redirect:/nutri/paciente/cadastro";
	}
	
	@GetMapping("/nutri/paciente/pesquisar")
	public String consultaPaciente(Paciente paciente, BindingResult errors, Model model) throws SQLException {
		model.addAttribute("pacientes", pacientes.findAll());
		return "/nutri/paciente/pesquisar";
	}

}

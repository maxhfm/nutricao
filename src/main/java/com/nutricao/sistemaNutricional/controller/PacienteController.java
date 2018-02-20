package com.nutricao.sistemaNutricional.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.nutricao.sistemaNutricional.dados.PacienteDTO;
import com.nutricao.sistemaNutricional.dados.PacientePersistencia;
import com.nutricao.sistemaNutricional.model.Consulta;
import com.nutricao.sistemaNutricional.model.Paciente;



@Controller

public class PacienteController {
	
	@Autowired
	private PacientePersistencia pacientes;
	
	PacienteDTO pacienteDTO = new PacienteDTO();
	
	
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
	
	@GetMapping("/nutri/paciente/cadastro/{id}")
	public String fichaPaciente(@PathVariable Long id, Model model) {
		model.addAttribute("paciente", pacientes.findOne(id));
		return "/nutri/paciente/editar";
	}
	
	@GetMapping("/nutri/paciente/pesquisar")
	public String consultaPaciente(Paciente paciente, BindingResult errors, Model model) throws SQLException {
		model.addAttribute("pacientes", pacientes.findAll());
		return "/nutri/paciente/pesquisar";
	}
	
	@PostMapping("/nutri/paciente/editar")
	public String ediatrPaciente(Model model, Paciente paciente, Consulta consulta) throws SQLException {
		pacienteDTO.editar(paciente);
		return "redirect:/nutri/paciente/pesquisar";
	}
	
	
	@GetMapping("/nutri/paciente/delete/{id}")
	public String deletePaciente(@PathVariable Long id) {
		pacientes.delete(id);
		return "redirect:/nutri/paciente/pesquisar";
	}

}

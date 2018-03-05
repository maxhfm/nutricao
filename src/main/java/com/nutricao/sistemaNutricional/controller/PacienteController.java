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
		return "nutri/paciente/cadastro";
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
	
	@GetMapping("/nutri/paciente/aniversariante/jan")
	public String aniversarioPaciente01(Paciente paciente, BindingResult errors, Model model) {
		model.addAttribute("pacientes", pacientes.aniversarianteJan());
		return "/nutri/paciente/aniversariante/jan";
	}
	
	@GetMapping("/nutri/paciente/aniversariante/fev")
	public String aniversarioPaciente02(Paciente paciente, BindingResult errors, Model model) {
		model.addAttribute("pacientes", pacientes.aniversarianteFev());
		return "/nutri/paciente/aniversariante/fev";
	}
	
	@GetMapping("/nutri/paciente/aniversariante/mar")
	public String aniversarioPaciente03(Paciente paciente, BindingResult errors, Model model) {
		model.addAttribute("pacientes", pacientes.aniversarianteMar());
		return "/nutri/paciente/aniversariante/mar";
	}
	
	@GetMapping("/nutri/paciente/aniversariante/abr")
	public String aniversarioPaciente04(Paciente paciente, BindingResult errors, Model model) {
		model.addAttribute("pacientes", pacientes.aniversarianteAbr());
		return "/nutri/paciente/aniversariante/abr";
	}
	
	@GetMapping("/nutri/paciente/aniversariante/maio")
	public String aniversarioPaciente05(Paciente paciente, BindingResult errors, Model model) {
		model.addAttribute("pacientes", pacientes.aniversarianteMaio());
		return "/nutri/paciente/aniversariante/maio";
	}
	
	@GetMapping("/nutri/paciente/aniversariante/jun")
	public String aniversarioPaciente06(Paciente paciente, BindingResult errors, Model model) {
		model.addAttribute("pacientes", pacientes.aniversarianteJun());
		return "/nutri/paciente/aniversariante/jun";
	}
	
	@GetMapping("/nutri/paciente/aniversariante/jul")
	public String aniversarioPaciente07(Paciente paciente, BindingResult errors, Model model) {
		model.addAttribute("pacientes", pacientes.aniversarianteJul());
		return "/nutri/paciente/aniversariante/jul";
	}
	
	@GetMapping("/nutri/paciente/aniversariante/ago")
	public String aniversarioPaciente08(Paciente paciente, BindingResult errors, Model model) {
		model.addAttribute("pacientes", pacientes.aniversarianteAgo());
		return "/nutri/paciente/aniversariante/ago";
	}
	
	@GetMapping("/nutri/paciente/aniversariante/set")
	public String aniversarioPaciente09(Paciente paciente, BindingResult errors, Model model) {
		model.addAttribute("pacientes", pacientes.aniversarianteSet());
		return "/nutri/paciente/aniversariante/set";
	}
	
	@GetMapping("/nutri/paciente/aniversariante/out")
	public String aniversarioPaciente10(Paciente paciente, BindingResult errors, Model model) {
		model.addAttribute("pacientes", pacientes.aniversarianteOut());
		return "/nutri/paciente/aniversariante/out";
	}
	
	@GetMapping("/nutri/paciente/aniversariante/nov")
	public String aniversarioPaciente11(Paciente paciente, BindingResult errors, Model model) {
		model.addAttribute("pacientes", pacientes.aniversarianteNov());
		return "/nutri/paciente/aniversariante/nov";
	}
	
	@GetMapping("/nutri/paciente/aniversariante/dez")
	public String aniversarioPaciente12(Paciente paciente, BindingResult errors, Model model) {
		model.addAttribute("pacientes", pacientes.aniversarianteDez());
		return "/nutri/paciente/aniversariante/dez";
	}

}

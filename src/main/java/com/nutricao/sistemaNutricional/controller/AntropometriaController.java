package com.nutricao.sistemaNutricional.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.nutricao.sistemaNutricional.dados.AntropometriaPersistencia;
import com.nutricao.sistemaNutricional.dados.PacientePersistencia;
import com.nutricao.sistemaNutricional.model.Antropometria;

@Controller
public class AntropometriaController {
	
	@Autowired
	PacientePersistencia pacientePersistencia;
	
	@Autowired
	AntropometriaPersistencia antropometriaPersistencia; 
	
	@GetMapping("/nutri/antropometria/cadastro")
	public String cadastrar(Antropometria antropometria, Model model){
		model.addAttribute("antropometria", antropometria);
		model.addAttribute("pacientes", pacientePersistencia.findAll());
		return "/nutri/antropometria/cadastro";
	}

	@PostMapping("/nutri/antropometria/cadastro")
	public String salvar(Antropometria antropometria){
		antropometriaPersistencia.save(antropometria);
		return "redirect:/";
	}
}

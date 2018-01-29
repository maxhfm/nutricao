package com.nutricao.sistemaNutricional.controller;

import java.sql.SQLException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.nutricao.sistemaNutricional.dados.ConsultaDTO;
import com.nutricao.sistemaNutricional.model.Consulta;


@Controller
public class ConsultaController {
	
	@GetMapping("/nutri/consulta/cadastro")
	public String cadastroConsulta(Model model, Consulta consulta) {
		model.addAttribute("consulta", consulta);
		return "/nutri/consulta/cadastro";
	}
	
	@PostMapping("/nutri/consulta/cadastro")
	public String cadastradoConsulta(Model model, Consulta consulta) throws SQLException {
		ConsultaDTO consultaDTO = new ConsultaDTO();
		consultaDTO.salvar(consulta);
		return "redirect:/nutri/consulta/cadastro";
	}
	
	@GetMapping("/nutri/consulta/pesquisar")
	public String consultaConsulta(Consulta consulta, BindingResult errors, Model model) throws SQLException {
		ConsultaDTO consultaDTO = new ConsultaDTO();
	//	model.addAttribute("consultas", consultaDTO.consultaTodos());
	
		return "/nutri/consulta/pesquisar";
	}

}

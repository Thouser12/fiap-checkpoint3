package com.github.acnaweb.mvc_rh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("departamentos")
public class DepartamentoController {

	@GetMapping()
	public String list() {
		return "departamento/list";
	}
	
	@GetMapping("cargos")
	public String cargosByDepartamento() {
		return "departamento/list_cargos";
	}
	
	@GetMapping("form")
	public String form() {
		return "departamento/form";
	}
}

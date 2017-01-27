package br.lehmkuhl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.lehmkuhl.model.ProfesionalBase;
import br.lehmkuhl.service.ProfessionalService;

@Controller
public class ProfessionalController {
	
	@Autowired
	private ProfessionalService service;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody List<ProfesionalBase> list() {
		return service.list();
	}

	@RequestMapping(value = "/", method = RequestMethod.POST, produces = { "application/json" })
	public @ResponseBody String save(@RequestBody ProfesionalBase professional) {
		service.save(professional);
		return "{\"message\":\"Solicitação enviada com sucesso!\"}";
	}

}
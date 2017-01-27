package br.lehmkuhl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.lehmkuhl.service.ServiceService;

@Controller
public class ServiceController {
	
	@Autowired
	private ServiceService service;
	
	@RequestMapping(value = "/service", method = RequestMethod.GET)
	public @ResponseBody List<String> list() {
		return service.list();
	}

}
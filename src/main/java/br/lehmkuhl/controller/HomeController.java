package br.lehmkuhl.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@ResponseStatus(HttpStatus.OK)
    @RequestMapping(method = RequestMethod.GET)
    public String home() {
        return "forward:/index.html";
    }

}

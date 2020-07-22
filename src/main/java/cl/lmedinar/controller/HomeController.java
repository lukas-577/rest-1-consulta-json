package cl.lmedinar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.lmedinar.model.entity.Persona;
import cl.lmedinar.service.PersonaService;

@Controller
@RequestMapping("/")
public class HomeController {
	
	PersonaService servicio;
	
	
	@Autowired
	public HomeController(PersonaService servicio) {
		this.servicio = servicio;
	}
	
	@GetMapping
	public String home (ModelMap modelo) {
		List<Persona> personas = servicio.obtenerPersonas();
		
		modelo.put("personas", personas);
		
		return "home";
	}

}

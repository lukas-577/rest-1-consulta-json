package cl.lmedinar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.lmedinar.model.dao.PersonaDao;
import cl.lmedinar.model.entity.Persona;

@Service
public class PersonaService {
	
	@Autowired
	PersonaDao personaDao;
	
	
	public List<Persona> obtenerPersonas(){
		
		return personaDao.findAll();
	}
	

}

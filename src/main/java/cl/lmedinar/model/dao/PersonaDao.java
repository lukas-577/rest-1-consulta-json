package cl.lmedinar.model.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import cl.lmedinar.model.entity.Persona;


@Repository
public class PersonaDao {
	
	@Value("${servicio.personas.url}")
	private String urlServicio;
	
	@Autowired
	private RestTemplate libreriaRestClient;
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	 public List<Persona> findAll() {
	        Persona[] personasArray = libreriaRestClient.getForObject(urlServicio, Persona[].class);
	        
	        return Arrays.asList(personasArray);
	    }
	

}

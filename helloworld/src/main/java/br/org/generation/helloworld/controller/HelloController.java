package br.org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello()
	{
		return "Olá Mundo!";	
	}
	
	@GetMapping
	public String ola()
	{
		return "Olá Gen!";	
	}
	
	@GetMapping("/Mentalidades")
	public String mentalidades()
	{
		return "Eu utilizei da mentalidade de crescimento e persistência para conseguir finalizar esse exercício."; 
	}
	
	@GetMapping("/Objetivos")
	public String objetivos()
	{
		return "Meu objetivo essa semana é me esforçar para entender melhor o que ainda não domino, e estudar mais o que já sei."; 
	}
	
}
	



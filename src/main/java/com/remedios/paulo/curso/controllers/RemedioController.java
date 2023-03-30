package com.remedios.paulo.curso.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.remedios.paulo.curso.remedio.DadosCadastroRemedio;
import com.remedios.paulo.curso.remedio.Remedio;
import com.remedios.paulo.curso.remedio.RemedioRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/remedios")
public class RemedioController {
	
	@Autowired
	private RemedioRepository repository;

	@PostMapping
	public void cadastrar(@RequestBody @Valid DadosCadastroRemedio dados) {
		repository.save(new Remedio(dados));
	}
}

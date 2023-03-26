package com.remedios.paulo.curso.remedio;

public record DadosCadastroRemedio(
		String nome, 
		Via via,
		String lote,
		String quatidade,
		String validade,
		Laboratorio laboratorio) {
	
}

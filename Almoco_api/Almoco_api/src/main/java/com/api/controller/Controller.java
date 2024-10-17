package com.api.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.model.PratoModel;
import com.api.repository.Pratorepository;

@RestController
@RequestMapping("api")
public class Controller {

	@GetMapping
	public String teste() {
		return "Prato feito";

	}

	@Autowired
	Pratorepository repository;

	@PostMapping("cadastrar")
	public ResponseEntity<?> salvarPrato(@RequestBody UsuarioDTO Prato) {
		PratoModel refeicao = new PratoModel(Prato);
		repository.save(refeicao);
		return ResponseEntity.ok("Prato feito");

	}

}

package com.servico.global;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	private ServicoRepository repository;
	
	@GetMapping("/Servico")
	public List<ServicoModel> pegarTodos(){
		return repository.findAll();
	}
	
	@PostMapping("/Servico")
	public ServicoModel criar (@RequestBody ServicoModel model) {
		repository.save(model);
		return model;
	}
}

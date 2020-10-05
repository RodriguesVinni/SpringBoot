package com.minha.escola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.minha.escola.model.AlunoModel;
import com.minha.escola.repository.AlunoRepository;


@RestController
public class AlunoController {
	
	@Autowired
	private AlunoRepository repository;
	
	@GetMapping("/alunos")
	public List<AlunoModel> pegarTodos(){
		return repository.findAll();
	}
	
	@PostMapping("/alunos")
	public AlunoModel criar (@RequestBody AlunoModel model) {
		repository.save(model);
		return model;
	}
	
	@GetMapping ("/alunos/nome/{nome}")
	public List<AlunoModel> buscaPorNome(@PathVariable String nome){
		return repository.findByNome(nome);
	}
	
	@PutMapping AlunoModel atualizar(@PathVariable Long id, @RequestBody AlunoModel model) {
		model.setId(id);
		repository.save(model);
		return model;
	}
	@DeleteMapping("/alunos/Servico/{id}") 
		public String remover (@PathVariable long id) {
			repository.deleteById(id);
			return "sucesso";
		}

}

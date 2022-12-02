package br.com.aprendendo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.aprendendo.eneity.Aluno;
import br.com.aprendendo.repositorys.AlunoRepository;

@RestController
@RequestMapping(value = "/aluno")
public class AlunoController {
	
	@Autowired
	private AlunoRepository repo;
	
	@GetMapping
	public List<Aluno> findAll(){
		List<Aluno> rest = repo.findAll();
		return rest;
	}
	
	@PostMapping
	public Aluno salvar(@RequestBody Aluno aluno) {
		Aluno rest = repo.save(aluno);
		return rest;
		
	}

}

package com.example.blogPessoal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.blogPessoal.model.Postagem;
import com.example.blogPessoal.repository.PostagemRepository;

@RestController              //Essa anotação infroma para o Spring que essa classe trata-se de um controlador
@RequestMapping("/postagem") //Por qual uri essa classe srá acessada
@CrossOrigin("*")            //Aceitar requisição de qualquer origem
public class PostagemController {

	@Autowired				 //Injeção de independencias do Spring, garantimos que todos os serviços desta interface, do tipo Repository sejam aceitadas apartir do Controller
	private PostagemRepository repository;
	@GetMapping             //Sempre que vier uma requisição externa ele disparará o método abaixo
	public ResponseEntity<List<Postagem>> GetAll () {
		return ResponseEntity.ok(repository.findAll());
	}
	@GetMapping ("/getById1/{id}")
	public Optional <Postagem> encontrarUm (@PathVariable long id){
		return repository.findById(id);
		}
	
	









}

package com.example.blogPessoal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@GetMapping            	 //Sempre que vier uma requisição externa ele disparará o método abaixo
	public ResponseEntity<List<Postagem>> GetAll () {
		return ResponseEntity.ok(repository.findAll());
	}
	@GetMapping ("/getById1/{id}")
	public Optional <Postagem> encontrarUm (@PathVariable long id){
		return repository.findById(id);
		}

    //___________________________________________________________Inserir POST___________________________________________________________________________________________________________________________________________________________________________________________________
	//______________________________________________________localhost:8080/postagem___________________________________________________________________________________________________________________________________________________________________________________________________________
	
	@PostMapping
	public ResponseEntity<Postagem> post(@RequestBody Postagem postagem) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(postagem));
	}
	
	//_____________________________________________________________Updates PUT_______________________________________________________________________________________________________________________________________________________________________________________________________________________
	//_____________________________________________________Para Put passamos o Id do recurso que queremos alterar____________________________________________________________________________________________________________________________________________________________________________________________________________________________________________
	//Retornara um objeto do tipo ResponseEntity, com o recurso Postagem dentro dele, receberemos como parametro um objeto via @RequestBody postagem, Receberemos ResponseEntity.status com status de ok  e detro teremos o metodo save  
	
	@PutMapping 				
	public ResponseEntity<Postagem> put(@RequestBody Postagem postagem) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(postagem));
	}
	//_____________________________________________________________Deletar DELETE_________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________
	//Fizemos um metodo void, ou seja, ele não retorna nada, utilizamos um PathVariael, capturamos o Id dentro da variave long, chamamos o repository com o metodo DeleteById, e em delete, não passamos o return.
	
	@DeleteMapping("/{id}")		
	public void delete (@PathVariable long id ) {
		repository.deleteById(id);
	}








}

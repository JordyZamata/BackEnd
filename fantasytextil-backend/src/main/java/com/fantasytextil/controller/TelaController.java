package com.fantasytextil.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fantasytextil.exception.ModeloNotFoundException;
import com.fantasytextil.model.Tela;
import com.fantasytextil.service.ITelaService;

@RestController
@RequestMapping("/telas")
public class TelaController {

	@Autowired
	ITelaService service;
	
	@GetMapping()
	public ResponseEntity<List<Tela>> listar() throws Exception{
		List<Tela> lista = service.listar();
		
		return new ResponseEntity<List<Tela>>(lista, HttpStatus.OK);
	} 

	@GetMapping("/{id}")
	public ResponseEntity<Tela> listarPorId(@PathVariable("id") Integer id) throws Exception {
		
		Tela tela = service.listarPorId(id);
		if(tela == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO " + id);
		}
		return new ResponseEntity<Tela>(tela, HttpStatus.OK);
	}


	@PostMapping
	public ResponseEntity<Tela> registrar( @RequestBody Tela p) throws Exception{
		Tela tela =  service.registrar(p);
		return new ResponseEntity<Tela>(tela, HttpStatus.CREATED);
	}	

	
	@PutMapping
	public ResponseEntity<Tela> modificar( @RequestBody Tela p) throws Exception {
		Tela tela = service.modificar(p);
		return new ResponseEntity<Tela>(tela, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar (@PathVariable Integer id)  throws Exception{

		Tela tela = service.listarPorId(id);
		
		if(tela == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO " + id);
		}
		
		service.eliminar(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
}

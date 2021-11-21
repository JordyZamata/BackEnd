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
import com.fantasytextil.model.Corte;
import com.fantasytextil.service.ICorteService;


@RestController
@RequestMapping("/cortes")
public class CorteController {

	@Autowired
	ICorteService service;
	
	@GetMapping()
	public ResponseEntity<List<Corte>> listar() throws Exception{
		List<Corte> lista = service.listar();
		
		return new ResponseEntity<List<Corte>>(lista, HttpStatus.OK);
	} 

	@GetMapping("/{id}")
	public ResponseEntity<Corte> listarPorId(@PathVariable("id") Integer id) throws Exception {
		
		Corte corte = service.listarPorId(id);
		if(corte == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO " + id);
		}
		return new ResponseEntity<Corte>(corte, HttpStatus.OK);
	}


	@PostMapping
	public ResponseEntity<Corte> registrar( @RequestBody Corte p) throws Exception{
		Corte corte =  service.registrar(p);
		return new ResponseEntity<Corte>(corte, HttpStatus.CREATED);
	}	

	
	@PutMapping
	public ResponseEntity<Corte> modificar( @RequestBody Corte p) throws Exception {
		Corte corte = service.modificar(p);
		return new ResponseEntity<Corte>(corte, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar (@PathVariable Integer id)  throws Exception{

		Corte corte = service.listarPorId(id);
		
		if(corte == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO " + id);
		}
		
		service.eliminar(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
}

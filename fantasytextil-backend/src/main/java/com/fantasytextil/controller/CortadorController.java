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
import com.fantasytextil.model.Cortador;
import com.fantasytextil.service.ICortadorService;


@RestController
@RequestMapping("/cortadores")
public class CortadorController {

	@Autowired
	ICortadorService service;
	
	@GetMapping()
	public ResponseEntity<List<Cortador>> listar() throws Exception{
		List<Cortador> lista = service.listar();
		
		return new ResponseEntity<List<Cortador>>(lista, HttpStatus.OK);
	} 

	@GetMapping("/{id}")
	public ResponseEntity<Cortador> listarPorId(@PathVariable("id") Integer id) throws Exception {
		
		Cortador cortador = service.listarPorId(id);
		if(cortador == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO " + id);
		}
		return new ResponseEntity<Cortador>(cortador, HttpStatus.OK);
	}


	@PostMapping
	public ResponseEntity<Cortador> registrar( @RequestBody Cortador p) throws Exception{
		Cortador cortador =  service.registrar(p);
		return new ResponseEntity<Cortador>(cortador, HttpStatus.CREATED);
	}	

	
	@PutMapping
	public ResponseEntity<Cortador> modificar( @RequestBody Cortador p) throws Exception {
		Cortador cortador = service.modificar(p);
		return new ResponseEntity<Cortador>(cortador, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar (@PathVariable Integer id)  throws Exception{

		Cortador cortador = service.listarPorId(id);
		
		if(cortador == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO " + id);
		}
		
		service.eliminar(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
}

package com.fantasytextil.controller;


import java.net.URI;
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
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fantasytextil.exception.ModeloNotFoundException;
import com.fantasytextil.model.Cliente;
import com.fantasytextil.service.IClienteService;



@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	IClienteService service;
	
	@GetMapping()
	public ResponseEntity<List<Cliente>> listar() throws Exception{
		List<Cliente> lista = service.listar();
		return new ResponseEntity<List<Cliente>>(lista, HttpStatus.OK);
	} 

	@GetMapping("/{id}")
	public ResponseEntity<Cliente> listarPorId(@PathVariable("id") Integer id) throws Exception {
		
		Cliente cliente = service.listarPorId(id);

		if(cliente == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO " + id);
		}
		return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
	}


	@PostMapping
	public ResponseEntity<Cliente> registrar( @RequestBody Cliente p) throws Exception{
		Cliente cliente =  service.registrar(p);
		return new ResponseEntity<Cliente>(cliente, HttpStatus.CREATED);
	}	

	
	@PutMapping
	public ResponseEntity<Cliente> modificar( @RequestBody Cliente p) throws Exception {
		Cliente cliente = service.modificar(p);
		return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar (@PathVariable Integer id)  throws Exception{

		Cliente cliente = service.listarPorId(id);
		
		if(cliente == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO " + id);
		}
		
		service.eliminar(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	
}

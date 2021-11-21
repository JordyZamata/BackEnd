package com.fantasytextil.controller;

import java.net.URI;
import java.util.ArrayList;
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

import com.fantasytextil.dto.PedidoListaCortadorDTO;
import com.fantasytextil.exception.ModeloNotFoundException;
import com.fantasytextil.model.Cortador;
import com.fantasytextil.model.Corte;
import com.fantasytextil.model.DetallePedido;
import com.fantasytextil.model.Pedido;
import com.fantasytextil.model.Tela;
import com.fantasytextil.service.IPedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {


	@Autowired
	IPedidoService service;
	
	@GetMapping()
	public ResponseEntity<List<Pedido>> listar() throws Exception{
		List<Pedido> lista = service.listar();

		return new ResponseEntity<List<Pedido>>(lista, HttpStatus.OK);
	} 


	@GetMapping("/{id}")
	public ResponseEntity<Pedido> listarPorId(@PathVariable("id") Integer id) throws Exception {
		
		Pedido pedido = service.listarPorId(id);

		if(pedido == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO " + id);
		}
		return new ResponseEntity<Pedido>(pedido, HttpStatus.OK);
	}


	@PostMapping
	public ResponseEntity<Pedido> registrar( @RequestBody PedidoListaCortadorDTO dto) throws Exception{
		
		
		Pedido pedido =  service.registrarTransaccional(dto);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(pedido.getIdPedido()).toUri();
		return ResponseEntity.created(location).build();
	}	

	
	/*@PutMapping
	public ResponseEntity<Pedido> modificar( @RequestBody Pedido p) throws Exception {
		Pedido pedido = service.modificar(p);
		return new ResponseEntity<Pedido>(pedido, HttpStatus.OK);
	}*/
	
	@PutMapping
	public ResponseEntity<Pedido> modificar( @RequestBody Pedido p) throws Exception {
		Pedido pedido = service.modificarTransaccional(p);
		return new ResponseEntity<Pedido>(pedido, HttpStatus.OK);
	}
	
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar (@PathVariable Integer id)  throws Exception{

		Pedido pedido = service.listarPorId(id);
		
		if(pedido == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO " + id);
		}
		
		service.eliminar(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	
	
}

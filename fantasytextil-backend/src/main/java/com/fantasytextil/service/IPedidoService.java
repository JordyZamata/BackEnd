package com.fantasytextil.service;

import com.fantasytextil.dto.PedidoListaCortadorDTO;
import com.fantasytextil.model.Pedido;

public interface IPedidoService extends ICRUD<Pedido, Integer>{

	Pedido registrarTransaccional(PedidoListaCortadorDTO dto) throws Exception;
	Pedido modificarTransaccional(Pedido pedido) throws Exception;
	
}

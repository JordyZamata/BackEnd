package com.fantasytextil.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fantasytextil.dto.PedidoListaCortadorDTO;

import com.fantasytextil.model.Pedido;

import com.fantasytextil.repo.IGenericRepo;
import com.fantasytextil.repo.IPedidoCortadorRepo;
import com.fantasytextil.repo.IPedidoRepo;

import com.fantasytextil.service.IPedidoService;

@Service
public class PedidoServiceImpl extends CRUDImpl<Pedido, Integer> implements IPedidoService{

	
	@Autowired
	private IPedidoRepo repo;

	
	@Autowired
	private IPedidoCortadorRepo ceRepo;
	
	@Override
	protected IGenericRepo<Pedido, Integer> getRepo() {
		return repo;
	}
	
	@Transactional
	@Override
	public Pedido registrarTransaccional(PedidoListaCortadorDTO dto) throws Exception {
		
		dto.getPedido().getDetallePedido().forEach(det -> det.setPedido(dto.getPedido()));
		repo.save(dto.getPedido());
		dto.getLstCortador().forEach(ex -> ceRepo.registrar(dto.getPedido().getIdPedido(), ex.getIdCortador()));
		return dto.getPedido();
	}
	
	@Override
	public Pedido modificarTransaccional(Pedido pedido) throws Exception {
		pedido.getDetallePedido().forEach(det -> det.setPedido(pedido));
		
		return repo.save(pedido);
	}
	
}

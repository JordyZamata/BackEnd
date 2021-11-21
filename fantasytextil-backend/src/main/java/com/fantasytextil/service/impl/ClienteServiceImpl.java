package com.fantasytextil.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fantasytextil.model.Cliente;
import com.fantasytextil.repo.IClienteRepo;
import com.fantasytextil.repo.IGenericRepo;
import com.fantasytextil.service.IClienteService;

@Service
public class ClienteServiceImpl extends CRUDImpl<Cliente, Integer> implements IClienteService{
	
	@Autowired
	private IClienteRepo repo;

	@Override
	protected IGenericRepo<Cliente, Integer> getRepo() {
		return repo;
	}
	
	

}
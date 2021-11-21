package com.fantasytextil.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fantasytextil.model.Corte;
import com.fantasytextil.repo.ICorteRepo;
import com.fantasytextil.repo.IGenericRepo;
import com.fantasytextil.service.IClienteService;
import com.fantasytextil.service.ICorteService;

@Service
public class CorteServiceImpl extends CRUDImpl<Corte, Integer> implements ICorteService{
	
	@Autowired
	private ICorteRepo repo;

	@Override
	protected IGenericRepo<Corte, Integer> getRepo() {
		return repo;
	}
	
}

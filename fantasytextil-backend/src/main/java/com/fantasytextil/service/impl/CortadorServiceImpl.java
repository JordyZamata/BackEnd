package com.fantasytextil.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fantasytextil.model.Cortador;
import com.fantasytextil.repo.ICortadorRepo;
import com.fantasytextil.repo.IGenericRepo;

import com.fantasytextil.service.ICortadorService;

@Service
public class CortadorServiceImpl extends CRUDImpl<Cortador, Integer> implements ICortadorService{
	
	@Autowired
	private ICortadorRepo repo;

	@Override
	protected IGenericRepo<Cortador, Integer> getRepo() {
		return repo;
	}
}

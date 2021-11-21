package com.fantasytextil.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fantasytextil.model.Tela;
import com.fantasytextil.repo.ITelaRepo;
import com.fantasytextil.repo.IGenericRepo;
import com.fantasytextil.service.ITelaService;

@Service
public class TelaServiceImpl extends CRUDImpl<Tela, Integer> implements ITelaService{
	
	@Autowired
	private ITelaRepo repo;

	@Override
	protected IGenericRepo<Tela, Integer> getRepo() {
		return repo;
	}
	
	

}
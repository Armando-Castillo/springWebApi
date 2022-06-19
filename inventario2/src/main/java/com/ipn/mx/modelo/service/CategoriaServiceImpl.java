package com.ipn.mx.modelo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ipn.mx.modelo.dao.ICategoriaDAO;
import com.ipn.mx.modelo.entidades.Categoria;

@Service
public class CategoriaServiceImpl implements ICategoriaService{
	@Autowired
	private ICategoriaDAO dao;
	
	public CategoriaServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	@Transactional(readOnly = true)
	public List<Categoria> findAll() {
		return (List<Categoria>) dao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Categoria findById(Long id) {
		return dao.findById(id).orElse(null);
	}

	@Override
	public Categoria save(Categoria categoria) {
		// TODO Auto-generated method stub
		return dao.save(categoria);
	}

	@Override
	public void delete(Long id) {
		dao.deleteById(id);
		
	}

}

package com.ipn.mx.modelo.service;

import java.util.List;

import com.ipn.mx.modelo.entidades.Categoria;

public interface ICategoriaService {
	public List<Categoria> findAll();
	public Categoria findById(Long id);
	public Categoria save(Categoria categoria);
	public void delete(Long id);
	
}

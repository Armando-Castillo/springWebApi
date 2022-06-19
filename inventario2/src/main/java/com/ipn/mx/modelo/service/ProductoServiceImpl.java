package com.ipn.mx.modelo.service;

import java.io.ByteArrayInputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ipn.mx.modelo.dao.IProductoDAO;

import com.ipn.mx.modelo.entidades.Producto;
@Service
public class ProductoServiceImpl implements IProductoService{
	@Autowired
	private IProductoDAO dao;
	
	
	public ProductoServiceImpl() {
		// TODO Auto-generated constructor stub
	}


	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return (List<Producto>) dao.findAll();
	}


	@Override
	@Transactional(readOnly = true)
	public Producto findById(Long id) {
		return dao.findById(id).orElse(null);
	}


	@Override
	public Producto save(Producto producto) {
		// TODO Auto-generated method stub
		return dao.save(producto);
	}


	@Override
	public void delete(Long id) {
		dao.deleteById(id);
		
	}


	@Override
	public ByteArrayInputStream reporte(List<Producto> productos) {
		// TODO Auto-generated method stub
		return null;
	}

}

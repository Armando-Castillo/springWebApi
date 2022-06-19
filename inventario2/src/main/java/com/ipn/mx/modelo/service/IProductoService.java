package com.ipn.mx.modelo.service;

import java.io.ByteArrayInputStream;
import java.util.List;

import com.ipn.mx.modelo.entidades.Producto;



public interface IProductoService {
	public List<Producto> findAll();
	public Producto findById(Long id);
	public Producto save(Producto producto);
	public void delete(Long id);
	
	//Se queda para algun día
	public ByteArrayInputStream reporte(List<Producto> productos);
}

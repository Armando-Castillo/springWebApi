package com.ipn.mx.modelo.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.ipn.mx.modelo.entidades.Producto;

public interface IProductoDAO  extends JpaRepository<Producto, Long>{
	
	
}

package com.ipn.mx.modelo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ipn.mx.modelo.entidades.Categoria;

public interface ICategoriaDAO  extends JpaRepository<Categoria, Long>{

		@Query("from Categoria")
		public List<Categoria> findAllCategoria();
}

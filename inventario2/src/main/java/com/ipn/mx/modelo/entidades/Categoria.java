package com.ipn.mx.modelo.entidades;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Categoria")
public class Categoria  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCategoria;
	
	@NotEmpty(message = "No puede estar vacio")
	@Size(min = 5, max = 50, message = "Debe de estar entre 5 y 50")
	@NotBlank(message = "Es obligatorio")
	@Column(name = "nombreCategoria",length = 50, nullable = false)
	
	private String nombreCategoria;
	
	@NotEmpty(message = "No puede estar vacio")
	@Size(min = 5, max = 150, message = "Debe de estar entre 10 y 150")
	@NotBlank(message = "Es obligatorio")
	@Column(name = "descripcionCategoria",length = 150, nullable = false)
	private String descripcionCategoria;

	@JsonIgnoreProperties(value = {"idCategoria",
			"hibernateLazyInitializer","handler"}, allowSetters =true)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "idCategoria", 
			cascade = CascadeType.ALL)
	
	
	public Long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNombreCategoria() {
		return nombreCategoria;
	}

	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}

	public String getDescripcionCategoria() {
		return descripcionCategoria;
	}

	public void setDescripcionCategoria(String descripcionCategoria) {
		this.descripcionCategoria = descripcionCategoria;
	}

	/*
	 * public List<Producto> getLosProductos() { return losProductos; }
	 */

	/*
	 * public void setLosProductos(List<Producto> losProductos) { this.losProductos
	 * = losProductos; }
	 */


	
//	private List<Producto> losProductos;
}



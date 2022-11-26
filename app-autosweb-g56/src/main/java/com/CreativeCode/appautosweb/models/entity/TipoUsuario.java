package com.CreativeCode.appautosweb.models.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipoUsuarios")

public class TipoUsuario {
	@Id
	@Column(length=5, nullable=false)	
	private int id;
	@Column(length=1, nullable=false)	
	private String tipo;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}

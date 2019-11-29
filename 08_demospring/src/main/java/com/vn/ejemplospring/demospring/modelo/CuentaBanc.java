package com.vn.ejemplospring.demospring.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Required;

import com.sun.istack.NotNull;

@Entity
// @Entity,@Id... decoradores
public class CuentaBanc implements Serializable {

	@Id
	private Integer id;
	@Size(min = 16, max = 16)
	@NotNull
	private String iban;
	@Required
	private String dni;

	// Constructor por defecto necesario
	// Hibernate (junto a JPA) necesita poder construir el objeto y luego mapear las
	// propiedades en tablas
	public CuentaBanc() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	@Override
	public String toString() {
		return "CuentaBanc [id=v" + id + " [iban= "+iban ;
	}

}

package com.vn.ejemplospring.demospring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vn.ejemplospring.demospring.modelo.CuentaBanc;
import com.vn.ejemplospring.demospring.modelo.CuentasDAOpanama;

@RestController
//CORS
public class ServicioBancarioREST {
	
	//Nosotros no inxtanciamos, l hace Spring. no gestinonasmo dependecia,tampofco asignamos valor
	//Inyeccion de dependencias
	@Autowired
	private CuentasDAOpanama repo;
	
	@RequestMapping(path="/cuentas", method= {RequestMethod.POST})
	
	public CuentaBanc crearCuentaAingenuo(@RequestAttribute CuentaBanc cuenta) {
		System.out.println(">>> cuentabanc Recdibida!" + cuenta.toString());
		return repo.save(cuenta);
	}

	@RequestMapping(path="/cuentas", method= {RequestMethod.GET})
	public List<CuentaBanc> obtenerTodas(){
		System.out.println(">>> GET todas cuentas");
		List<CuentaBanc> lista = repo.findAll();
		//TODO: Ordenar lista
		return lista;
	}

	@DeleteMapping ("/cuentas/{id}")
	public void eliminarCuenta(@PathVariable Integer id) {
		repo.deleteById(id);
		System.out.println(">>> DELETE " +id);
		
	}
	
	@PutMapping 
	public void modificarCuenta(@PathVariable Integer id,
			@RequestBody CuentaBanc cuentaModif) {
		if(cuentaModif.getId()== id) {
			repo.save(cuentaModif);
			System.out.println(">>> PUT/Modificar " + id);
		}
		else {
			System.out.println(">>>>>PUT/Modificar" + id + " e " + cuentaModif.getId()+"no son igujales");
			return null;
		}
	}
	
}

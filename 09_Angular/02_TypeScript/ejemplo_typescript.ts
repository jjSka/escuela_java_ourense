"use strict";
var lenguaje = "JavaScript"
console.log("TypeScript es" + lenguaje);

let textoExtra: String = " con Tipado fuerte OPCIONAL";

console.log("TypeScript es " + lenguaje + textoExtra);

class UnaClase {
	private propiedad: String;
	
	constructor(propiedad: String){
		this.propiedad = propiedad;
	}
	
	public getPropiedad()  : String{
		return this.propiedad;
	}
}

let unObjeto: UnaClase = new UnaClase("Tiene POO");

textoExtra = 2000;

console.log("Propiedad: "+unObjeto.getPropiedad());
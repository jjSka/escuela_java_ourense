"use strict";
var lenguaje = "JavaScript";
console.log("TypeScript es" + lenguaje);
var textoExtra = " con Tipado fuerte OPCIONAL";
console.log("TypeScript es " + lenguaje + textoExtra);
var UnaClase = (function () {
    function UnaClase(propiedad) {
        this.propiedad = propiedad;
    }
    UnaClase.prototype.getPropiedad = function () {
        return this.propiedad;
    };
    return UnaClase;
})();
var unObjeto = new UnaClase("Tiene POO");
textoExtra = 2000;
console.log("Propiedad: " + unObjeto.getPropiedad());

var div = document.getElementById("contenido");

var bebida= new Object();
bebida.tipo="Cerveza";
bebida.cantidad="3 litros";
div.innerHTML+="Bebida es " + bebida.tipo + "<br/>";
//en js los objetos son mapas como HashMap
div.innerHTML+="cantidad es " + bebida["cantidad"]+"<br/>";
bebida["propiedades"] = "Tiene alcohol, gas y emborracha";
div.innerHTML+="Propiedades de la "+bebida.tipo+": "+bebida.propiedades+"<br/>";

function suma(x,y){
    return x+y;
}
div.innerHTML+="<br/>suma(5,3)= " + suma(5,3);
div.innerHTML+="<br/>suma('5','3')= " + suma('5','3');
//clases con constructora
function Bebida(tipo,cantidad,propiedades){
    this.tipo=tipo;
    this.cantidad=cantidad;
    this.propiedades=propiedades;
   /* function mostrar(){
        div.innerHTML+="<p>Bebida: " +this.tipo+", " + this.cantidad+", "+this.propiedades;
    }*/
    this.mostrar = function(){
        div.innerHTML+="<p>Bebida: " +this.tipo+", " + this.cantidad+", "+this.propiedades;
    }    
}
var zumo= new Bebida("zumo de naranja","1 L","Vitamina C");
zumo.mostrar();

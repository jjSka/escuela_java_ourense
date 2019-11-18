//Notacion JSON : JavaScript Object Notation
// XML,JSON y viceversa

var unObjeto = { }; //new Object();
var otroObj = {
    "prop_1": "Propiedad uno",
    "prop_2": "Propiedad dos",
    'prop_3': "Propiedad tres",
    prop_4: "Propiedad cuatro",
    toString: function() { return "Propiedades: " + this.prop_1 + "; "
    + this.prop_2 + "; "+ this.prop_3 + "; "+ this.prop_4 + "; "+ this.prop_5},
    toStringAll: function(){
        var cadena;
        for(var i=1;i<20;i++){
            cadena+=this["prop_"+i]+"<br/>";
        }
        return cadena;
    },
    toStringAllProp: function(){
        var cadena;
        for(key in this){
        //    cadena+=this[key]+"<br/>";
            if(key.indexOf("prop_")>=0)
                cadena+=this[key]+"<br/>";
                
        }
        
        return cadena;
    }
    
}
otroObj.prop_5= "Propiedad cinco";
var divTris= document.getElementById("contenido_tris");
divTris.innerHTML+= otroObj.toString();
divTris.innerHTML+= otroObj.toStringAll();
divTris.innerHTML+= otroObj.toStringAllProp();

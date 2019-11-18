var divBis = document.getElementById("contenido_bis");
divBis.style = "background-color: lightgrey";

/*
var mostrarTodosParam = function () { // funcion con parametros dinámicos
    for (argumento of arguments) {
        divBis.innerHTML += "Argumento : "+ argumento + "<br/>";
    }
}
mostrarTodosParam("Un parámetro",50,true, bebida.cantidad);*/

var mostrarTodosParam = function (primerParam) {
    divBis.innerHTML += "<p>Primer parámetro: " + primerParam + "</p>";
    for (argumento of arguments) {
        divBis.innerHTML += "Argumento : " + argumento + "<br/>";
    }
    if (typeof (primerParam) === "undefined")
        divBis.innerHTML += primerParam + " no esta definido."+ "<br/>";
    if(primerParam=="1")
        divBis.innerHTML+= "Pues es \"1\""+ "<br/>";
    else
        divBis.innerHTML+="No es parecido \""+primerParam+"\" <br/>";
    if(primerParam==="1")
        divBis.innerHTML+= "Pues es identico"+ "<br/>";
    else
        divBis.innerHTML+="No es identico"+ "<br/>";        
}
mostrarTodosParam();
mostrarTodosParam("1");
mostrarTodosParam(1);

var intentoConversion=parseFloat("veinte"); //muestra not a number NaN
divBis.innerHTML+="Convirtiendo. Resultado = " + (intentoConversion);
divBis.innerHTML+="<br/>El tipo de dato es " + typeof(intentoConversion);//pero sigue siendo numero
divBis.innerHTML+="<br/>Infinito: " +1/0;
divBis.innerHTML+="<br/>Valor max: " +1.23456789123456789;
/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

window.addEventListener("load", function () {
        document.getElementById("btn_peticion_ajax").onclick = function () {
            
    var objAjax = new XMLHttpRequest();
    objAjax.onreadystatechange = function () {
        console.log("State objAjax: " + this.readyState
                + ", Status peticion HTTP: " + this.status);
        console.log("Texto respuesta: " + this.responseText);
        if (this.readyState === 4 && this.status === 200)
            document.getElementById("div_datos_json").innerHTML = this.responseText;
        var respuestaObj = JSON.parse(this.responseText);
        document.getElementById("div_datos").innerHTML = `
        <br/><b>Nombre: </b>
        ${respuestaObj.nombre}
        <br/><b>Edad: </b>
        ${respuestaObj.edad}
        <br/><b>Fibonacci: </b>
        `;
        for (var numFib of respuestaObj.fibonacci) {
            document.getElementById("div_datos").innerHTML += " - " + numFib;
        }
    };
    objAjax.open("GET", "./datosjson");
    objAjax.send();
    console.log("Peticion Enviada!");
        };
});

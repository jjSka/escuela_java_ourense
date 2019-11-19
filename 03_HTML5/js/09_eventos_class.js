//Manera EcmaScript 5
function GestorEventosES5(inputId, btnId, divInfo) {
    this.input = document.getElementById(inputId);
    this.btn = document.getElementById(btnId);
    this.divInfo = document.getElementById(divInfo);
    this.funCallBackAlPulsar = function (evento) {
        this.input.value = "Tipo evento " + evento.type;
        this.divInfo.innerHTML = JSON.stringify(evento);
        this.divInfo.innerHTML += "id target del evento: " + this.boton.id;
        this.boton.value = "Puedes repetir";
        this.divInfo.className = "div-marco";
        this.boton.removeEventListener("click", this.funCallbackPulsar);

    };
    this.funCallBackAlPulsar2 = (evento) => { //lambda recomendable, no cambia ambitos del this!!!!!!!!!!!
        this.input.style = "background-color: lightblue ";
    };
    this.btn.addEventListener("click", this.funCallBackAlPulsar.bind(this)); // bind necesario en forma de hacerlo antiguo
    this.btn.addEventListener("click", this.funCallBackAlPulsar2);
}


//Manera EcmaScript 2015 o ES6
class GestorEventosES6 {
    constructor(inputId, btnId, divInfo) {
        this.input = document.getElementById(inputId);
        this.btn = document.getElementById(btnId);
        this.divInfo = document.getElementById(divInfo);
        this.btn.addEventListener("click", this.funCallBackAlPulsar.bind(this)); // bind necesario en forma de hacerlo antiguo
        this.btn.addEventListener("click", this.funCallBackAlPulsar2);
    }
    funCallBackAlPulsar(evento) {
        this.input.value = "Tipo evento " + evento.type;
        this.divInfo.innerHTML = JSON.stringify(evento);
        this.divInfo.innerHTML += "id target del evento: " + this.btn.id;
        this.btn.value = "Puedes repetir";
        this.divInfo.className = "div-marco";
        this.btn.removeEventListener("click", this.funCallbackPulsar);

    };
    funCallBackAlPulsar2 = (evento) => { //lambda recomendable, no cambia ambitos del this!!!!!!!!!!!
        this.input.style = "background-color: lightblue ";
    };

}
let array_A = [1, 2, 3, 4, 5];
let array_B = [2, 3, 4, 5, 6];
let arraySumaAB = operarArrays(array_A,array_B, suma);
let arrayMultAB = operarArrays(array_A,array_B, multiplica);
let arrayDivAB = operarArrays(array_A,array_B, divide);
let arrayRestAB = operarArrays(array_A,array_B, resta);
let arrayPuntoAB = operarArrays(array_A,array_B, punto);

function arrayEnTabla(array){
    let tabla= "<table border=2>";
        for (let index = 0; index < array.length; index++) {
            const element = array[index];
            tabla+="<tr><td>"+index+"</td>"+"<td>" + element + "</td></tr>";
        }
        return tabla + "</table>";
}
document.getElementById("contenido").innerHTML += arrayEnTabla(arraySumaAB);
document.getElementById("contenido").innerHTML += arrayEnTabla(arrayMultAB);
document.getElementById("contenido").innerHTML += arrayEnTabla(arrayDivAB);
document.getElementById("contenido").innerHTML += arrayEnTabla(arrayRestAB);
document.getElementById("contenido").innerHTML += arrayEnTabla(arrayPuntoAB);
function operarArrays(arrX, arrY, opera) {
    // tamaño de los arrays =
    if (arrX.length == arrY.length) {
        var arrayResultado = new Array(arrX.length);
        /*for (var i = 0; i < arrX.length; i++) { // var: declaracion de variable ambito de funcion
            arrayResultado[i] = opera(arrX[i],arrY[i]);
        }*/
        for (let i = 0; i < arrX.length; i++) { // let: declaracion de variable ambito de bloque
            arrayResultado[i] = opera(arrX[i],arrY[i]);
        }
    }
    return arrayResultado;
}
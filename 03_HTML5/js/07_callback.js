/*       //var arrayResultado = new Array();
        var arrayResultado = []; //declaracion array JSON, son como ArrayList<Object> o HashMap<Integer,Object>
        arrayResultado.push("Primer elemento");
*/


let suma = function suma(x, y) {
    return x + y;
}
function multiplica(x, y) {
    return x * y;
}
let divide = new Function("x", "y", "return x/y;");
let resta = (x, y) => {
    return x - y;
}

let punto = (x,y) =>{
    return  `(${x},${y})`;
}
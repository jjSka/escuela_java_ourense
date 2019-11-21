$(document).ready(function () {
    $("#btn_peticion_ajax_jquery").click(function () {
        //Peticion AJAX
        $.ajax({
            "url": "./datosjson",
            "type": "GET",
            "success": function (respuestaJson) {
                $("#div_datos_json").html(JSON.stringify(respuestaJson));
            },
            "error": function (jqXHR, textStatus, errorThrown) {
                console.error("No se ha podido obtener la info");
                console.warn(jqXHR);
                console.warn(textStatus);
                console.warn(errorThrown);
                if (jqXHR.status === 404)
                    alert("URL no localizada");
            }
        });
    });
    $("#btn_peticion_ajax_post").click(function () {

        let nombre = document.getElementById("nombre").value;
        let email = document.getElementById("email").value;
        if ("" !== nombre && nombre.length > 1 && email !== "") {
            let expresionNombre = new RegExp("^[A-Z][a-z]+");
            if (expresionNombre.test(nombre)) {
                let datosUsuario = {
                    "nombre": nombre,
                    "email": email
                };
                $.post("./datosjson", datosUsuario, function (respuesta) {
                    $("#div_datos_json").html(JSON.stringify(respuesta));
                });
            }
            else
                alert("eh chavaL estas poniendolo mal.")
        } else
            alert("los datos estan mal.");
    });
});

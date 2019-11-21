$(document).ready(function(){
    $("#btn_peticion_ajax_jquery").click(function(){
       //Peticion AJAX
       $.ajax({
           "url": "./datosjson",
           "success": function(respuestaJson){
               $("#div_datos_json").html(JSON.stringify(respuestaJson));
           },
           "error": function(jqXHR,textStatus,errorThrown){
               console.error("No se ha podido obtener la info");
               console.warn(jqXHR);
               console.warn(textStatus);
               console.warn(errorThrown);
               if(jqXHR.status === 404)
                   alert("URL no localizada");
           }
       });
    });
});

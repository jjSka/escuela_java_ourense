jQuery(document).ready(function(){ //jQuery = $
    jQuery("section").append("<div><p>LEYENDA</p></div>");
    $("tr").append("<td>Info</td>");
    $(".articulo").append("<p>UN PARRAFO por cada articulo</p>");
    $("td:nth-child(5)").attr("style", "background-color: red; color: white");
    $("td:nth-child(5)").click(()=>{alert('un click desde jquery')});
    $("#otro_menu").append("<p>.....</p><br/><br/>");
    /*$("#otro_menu").click(function(){
        $("#otro_menu").append("<p>.....</p><br/><br/>");
        $("#otro_menu").slideDown();
    });*/
    $("#boton_replegar").click(function(){
        $("body").fadeOut();
    });
});


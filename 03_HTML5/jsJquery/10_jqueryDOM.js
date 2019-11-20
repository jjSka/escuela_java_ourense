jQuery(document).ready(function () { //jQuery = $
    jQuery("section").append("<div><p>LEYENDA</p></div>");
    $("tr").append("<td>Info</td>");
    $(".articulo").append("<p>UN PARRAFO por cada articulo</p>");
    $("td:nth-child(5)").attr("style", "background-color: red; color: white");
    $("td:nth-child(5)").click(() => { alert('un click desde jquery') });
    $("#otro_menu").append("<p>.....</p><br/><br/>");
    /*$("#otro_menu").click(function(){
        $("#otro_menu").append("<p>.....</p><br/><br/>");
        $("#otro_menu").slideDown();
    });*/
    $("#boton_replegar").click(function () {
        $("#uolist").fadeOut();
    });
    $("otro_menu").html("<h2>Menu de articulos</h2><br/><br/>");
    $("article").each(function (index) {
        var idArticulo = "articulo_" + index;
        var idEnlaceArticulo = "enlace_" + index;
        $(this).attr("id", idArticulo);
        $(this).hide();
        $("#otro_menu").append("<a id='" + idEnlaceArticulo + "' href='#" + idArticulo + "' class='enlace-articulo'>Articulo nº " + index + "</a>");
        idArticulo = "#" + idArticulo;
        idEnlaceArticulo = "#" + idEnlaceArticulo;
        $(idEnlaceArticulo).click(function (evento) {
            $(idArticulo).toggle();
        });
    }
    );
    $("#titulo_web").click(function () {
        $("#titulo_web").animate({ left: '25%'}, "slow");
        $("#titulo_web").animate({ right: '25%', opacity: '0.2'}, "slow");
        $("#titulo_web").animate({ top: '10%'}, "slow");
        $("#titulo_web").animate({ opacity: '0'}, "slow");
    });




});


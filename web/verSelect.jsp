<%-- 
    Document   : verSelect
    Created on : 24-mar-2017, 13:21:53
    Author     : martaperal
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="entidades.Camarero"%>
<%@page import="dao.camarero.restaurante.DaoCamarero"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ver Select</title>
    </head>
    <body>
        <h1>Comprobar Select</h1>

        <form id="borrarCamarero" action="RestauranteGit/controladorServletCamarero">
        <select name="idcamarero">
     
            <% ArrayList<Camarero> lista_camareros = null;
                lista_camareros = DaoCamarero.buscarTodos();
                for (Camarero camarero : lista_camareros) {

            %>
            <option value="<%=camarero.getNombre()%>">
                <%=camarero.getIdCamarero()%>
            </option>
            <% }%>
        </select>
        <input type="hidden" name="action" value="borrar">
        <input type="submit" name="Borrar" value="Borrar"/>
        </form>
        <a href="registroCamarero.html">Alta Camarero</a>
    </body>
</html>
</body>
</html>


<%@page import="java.util.List"%>
<%@page import="paqueteLogica_clases.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuarios Agregados</title>
    </head>
    <body>
        <h1>Lista de Usuarios: </h1>
        
        <% 
            int contador = 1; 
            List<Usuario> listaUsuarios = (List) request.getSession().getAttribute("usuariosLista");
            for(Usuario u:listaUsuarios){
           
        %>
           
            <p><b>Usuario <%=contador%>: </b></p>
            <p>Nombre:<%=u.getNombre()%> </p>
            <p>Apellido:<%=u.getApellido()%> </p>
            <p>Correo electronico:<%=u.getMail()%></p>
            <p>Telefono:<%=u.getTelefono()%> </p>
            <br>
        <% contador++; 
            } %>
        
        
        
    </body>
</html>

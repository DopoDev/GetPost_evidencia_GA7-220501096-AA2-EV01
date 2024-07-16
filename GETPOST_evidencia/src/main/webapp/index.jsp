<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario creación Usuarios</title>
    </head>
    <body>
        <h1>Ingresar Usuarios</h1>
        
        <form action="SvUsuarios" method="POST">
            <p><label>Cedula: </label> <input type="text" name="cedula"></p>
            <p><label>Nombre: </label> <input type="text" name="nombre"></p>
            <p><label>Apellido: </label> <input type="text" name="apellido"></p>
            <p><label>Telefono: </label> <input type="text" name="telefono"></p>
            <p><label>Correo Electronico: </label> <input type="text" name="mail"></p>
            <button type="submit" >Agregar Usuario</button>
        </form>
        
        <h1>Ver listas de Usuarios</h1>
        <form action="SvUsuarios" method="GET">
            <button type="submit"> Ver listas de usuarios </button>
        </form>
        
    </body>
</html>

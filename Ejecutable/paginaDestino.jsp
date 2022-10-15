<%-- 
    Document   : paginaDestino
    Created on : 25/08/2022, 07:47:01 AM
    Author     : Yessid Murcia
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BOT</title>
    </head>
    <body>
        <p> Este programa fue diseñado por HERNAN YESSID MURCIA SALINAS</p>
        <h1>Iniciamos!</h1> 
         <form >
<p>El ingreso del nombre es opcional<br></p>
 <p>Nombre: <input type="text" name="nombre" > <br></p>
 <p>Peticion: <input type="text" name="peticion"> <br></p>
<input type="submit" value="Ok">
</form>       
        <%@page   import="as.Logica"%>
        <% 
       String nombre = request.getParameter("nombre");
       String peticion = request.getParameter("peticion");
            as.Logica l=new Logica();
             l.robot(nombre,peticion);
             out.println(l.robot(nombre,peticion));
            %>
    </body>
</html>

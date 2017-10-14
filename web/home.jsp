<%-- 
    Document   : home.jsp
    Created on : 14/10/2017, 10:13:56
    Author     : Renan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Projeto 04</title>
        
        <!--INCLUDE CSS -->
        <%@include file="WEB-INF/jspf/includeCssMenu-footer.jspf" %>
        
        <!-- INCLUDE CSS END-->
    </head>
    <body>
        <!-- INCLUDE MENU -->
        <%@include file="WEB-INF/jspf/includeMenu.jspf" %>
        <!-- INCLUDE MENU END -->
        
        <h1>Login </h1>
        <form action="Login" method="post">
            Usuario : <input type="text" name="usuario"><br><br>
            Senha  : <input type="password" name="senha"><br><br>
            <input type="submit" value="Login">
        </form>
        
        <!-- INCLUDE FOOTER -->
        <%@include file="WEB-INF/jspf/includeFooter.jspf" %>
        <!-- INCLUDE FOOTER END -->
    </body>
</html>

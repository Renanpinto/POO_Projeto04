<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Meu Perfil</title>
        <!--INCLUDE CSS -->
        <%@include file="WEB-INF/jspf/includeCssMenu-footer.jspf" %>
        
        <!-- INCLUDE CSS END-->
    </head>
    <body>
        <!-- INCLUDE MENU -->
        <%@include file="WEB-INF/jspf/includeMenuPerfil.jspf" %>
        <!-- INCLUDE MENU END -->
        
    <%
        if(session.getAttribute("user")==null){
            response.sendRedirect("home.jsp");
        }
    %>
    
    <pre style="text-align: center">
Aqui vai mostrar:
    - Média do usuario;
    - Tabela com 10 ultimos teste dele
    </pre>
        
        <!-- INCLUDE FOOTER -->
        <%@include file="WEB-INF/jspf/includeFooter.jspf" %>
        <!-- INCLUDE FOOTER END -->
    </body>
</html>

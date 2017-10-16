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
        <title>Projeto Quizz</title>
        
        <!--INCLUDE CSS -->
        <%@include file="WEB-INF/jspf/includeCssMenu-footer.jspf" %>
        <link rel="stylesheet" type="text/css" href="css/menuFo.css">
        <!-- INCLUDE CSS END-->
    </head>
    <body>
        <!-- INCLUDE MENU -->
        <%@include file="WEB-INF/jspf/includeMenu.jspf" %>
        <!-- INCLUDE MENU END -->
        
        <%if(!(session.getAttribute("user")==null)){%>
        <a href="quizz.jsp" class="btn btn-primary btn-lg btn-block">INICIAR NOVO QUIZZ</a>
        <%}%>
            
        <pre style="text-align: center">
Essa home tem que apresentar:
    - Uma tabela com os 10 ultimos testes realizados; 
    - Uma tabela com o raking com as 10 melhores notas</pre>  
        
        
        <!-- INCLUDE FOOTER -->
        <%@include file="WEB-INF/jspf/includeFooter.jspf" %>
        <!-- INCLUDE FOOTER END -->
    </body>
</html>

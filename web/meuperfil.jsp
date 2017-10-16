<%@page import="java.util.ArrayList"%>
<%@page import="br.com.poo.quiz.BancoUsuarios"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.poo.quiz.Usuario"%>
<%@page import="br.com.poo.quiz.Quiz"%>
<%@page import="br.com.poo.quiz.Questao"%>
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
        ArrayList<Usuario> usuario = BancoUsuarios.getUsuarios();
        if(session.getAttribute("user")==null){
            response.sendRedirect("home.jsp");
        }
    %>
    
    <pre style="text-align: center">
    Aqui vai mostrar: 
    - Média do usuario: 
    - Tabela com 10 ultimos teste dele
    </pre>
    
    <form>
        <table>
            
            
        </table>
    </form>
        
        <!-- INCLUDE FOOTER -->
        <%@include file="WEB-INF/jspf/includeFooter.jspf" %>
        <!-- INCLUDE FOOTER END -->
    </body>
</html>

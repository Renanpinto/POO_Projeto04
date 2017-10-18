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
        <link rel="stylesheet" type="text/css" href="css/estilo.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
        <!-- INCLUDE CSS END-->
    </head>
    <body>
        <!-- INCLUDE MENU -->
        <%@include file="WEB-INF/jspf/includeMenuPerfil.jspf" %>
        <!-- INCLUDE MENU END -->
        
        
    <%
        if(session.getAttribute("user")==null){
            response.sendRedirect("telalogin.jsp");
        }
    %>
    
    <pre style="text-align: center">
    Aqui vai mostrar: 
    - Média do usuario: 
    - Tabela com 10 ultimos teste dele
    </pre>
    
    <form>
        <table border="5">
            <%for(Usuario usuario : BancoUsuarios.getUsuarios()){
                if(usuario.getNmUsuario() == "Vitor"){
                    for(Double pontuacao : usuario.getQtPontuacoesUsuario()){
                        if(pontuacao != usuario.qtPontuacoesUsuario.get(0)){
                            if(usuario.getQtPontuacoesUsuario().size() > 1){
                    %>
                    <tr>
                        <th><p><%=pontuacao%></p></th>
                    </tr>
                    <%}     else{
                                %><p>Não foram realizados nenhum teste.</p><%  
                                break;
                            }
                        }
                    
                       
                    }
                }
            %>
            
                
                
            <%}%>
        </table>
    </form>
        
        <!-- INCLUDE FOOTER -->
        <%@include file="WEB-INF/jspf/includeFooter.jspf" %>
        <!-- INCLUDE FOOTER END -->
    </body>
</html>

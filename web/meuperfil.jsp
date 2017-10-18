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
            if (session.getAttribute("user") == null) {
                response.sendRedirect("telalogin.jsp");
            }
        %>

        <pre style="text-align: center">
    Aqui vai mostrar: 
    - Média do usuario: 
    - Tabela com 10 ultimos teste dele
        </pre>
        
            <div style="text-align: center">

                <table style="text-align: center" class="table table-hover table-responsive textCenter">

                    <tr><th>Média</th></tr>
                            <%--  int c = 1;
                                for (int i = BancoUsuarios.totalQuizzesEfetuados() - 1; i >= 0; i--) {
                                    if (c <= 10) {
                                        Usuario quiz = BancoUsuarios.getQuizEfetuado(i);

                                        if (quiz.getUsuarioTestado().equals(session.getAttribute("user"))) {
                            %>
                    <tr><td><%=quiz.getMedia()%></td></tr>
                    <%
                                    c++;
                                }
                            }
                        }
                    --%>
                </table>
            </div>
        
        <%  String color = "black";
            double mediaGeral = BancoUsuarios.obterMediaUser(String.valueOf((session.getAttribute("user"))));
//            out.print(mediaGeral);
              //double mediaGeral = BancoUsuarios.getUsuarios().get(0).CalculaMediaPontuacao();
             //double mediaGeral = 0;
              
              

            //if (mediaGeral > 0.0) {
        %>
        <h3 class="textCenter">Sua média de todos os quizzes: <span class="span-media" ><%=mediaGeral%></span></h3>
            <%--} else {%>
        <h3 class="textCenter">Não foi encontrado qualquer quiz realizado, vamos lá tentar fazer um !!!<br><br><a href='quizz.jsp' class="btn btn-colors">Quiz</a></h3>
            <%--}--%>




        <!-- INCLUDE FOOTER -->
        <%@include file="WEB-INF/jspf/includeFooter.jspf" %>
        <!-- INCLUDE FOOTER END -->
    </body>
</html>

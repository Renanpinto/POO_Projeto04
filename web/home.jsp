<%-- 
    Document   : home.jsp
    Created on : 14/10/2017, 10:13:56
    Author     : Renan
--%>

<%@page import="br.com.poo.quiz.Quiz"%>
<%@page import="br.com.poo.quiz.Usuario"%>
<%@page import="br.com.poo.quiz.BancoUsuarios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Projeto Quizz</title>

        <!--INCLUDE CSS -->
        <link rel="stylesheet" type="text/css" href="css/estilo.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
        <!-- INCLUDE CSS END-->
    </head>
    <body>
        <!-- INCLUDE MENU -->
        <%@include file="WEB-INF/jspf/includeMenu.jspf" %>
        <!-- INCLUDE MENU END -->

        

        <%if (!(session.getAttribute("user") == null)) {%>
        <a href="quizz.jsp" class="btn btn-primary btn-lg btn-block">INICIAR NOVO QUIZZ</a>
        <%}%>


         <div class="row">
                <div class="col-md-6">
                    <div class="table-ranking">
                        <h2 class="text-center ">Ranking</h2><hr class='bottom-line3'><br><br>
                        <table class="table table-hover table-responsive">
                            <tr>
                                <th scope="row">Nome do jogador</th>
                                <th>Média das Notas</th>
                            </tr>
                            <%
                                double[] notas = new double[BancoUsuarios.getUsuarios().size()];
                                String[] nomes = new String[BancoUsuarios.getUsuarios().size()];
                                for (int i = 0; i < BancoUsuarios.getUsuarios().size(); i++) {
                                    Usuario user = BancoUsuarios.getUser(i);
//                                    Quiz quiz = BancoUsuarios.getQuizEfetuado(i);
//                                    notas[i] = quiz.getMedia();
//                                    nomes[i] = user.getNmUsuario();
                                }
                                double doubleAux = 0;
                                String stringAux;
                                for (int i = 0; i < BancoUsuarios.getUsuarios().size(); i++) {
                                    for (int j = 0; j < BancoUsuarios.getUsuarios().size()-1; j++) {
                                        if (notas[j] < notas[j + 1]) {
                                            doubleAux = notas[j];
                                            notas[j] = notas[j + 1];
                                            notas[j + 1] = doubleAux;

                                            stringAux = nomes[j];
                                            nomes[j] = nomes[j + 1];
                                            nomes[j + 1] = stringAux;
                                        }
                                    }
                                }
                                for (int i = 0; i < BancoUsuarios.getUsuarios().size(); i++) {%>
                            <tr>
                                <td><%=nomes[i]%></td>
                                <td><%=notas[i]%></td>
                            </tr>
                            <%}%>
                        </table>
                    </div>
                </div>
                <div class="col-md-6">
                    <div id="table2">
                        <h2 class="text-center ">Quizzes Efetuados</h2><hr class='bottom-line3'><br><br>
                        <table class="table table-hover table-responsive">
                            <tr>
                                <th scope="row" >Nome do jogador</th>
                                <th>Média</th>
                        </table>
                    </div>
                </div>
            </div>  


        <!-- INCLUDE FOOTER -->
        <%@include file="WEB-INF/jspf/includeFooter.jspf" %>
        <!-- INCLUDE FOOTER END -->

        <!-- WoW Js-->
        <script type="text/javascript" src="js/wow.js"></script>
        <script>
            new WOW().init();
        </script>
    </body>
</html>

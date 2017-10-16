<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.poo.quiz.Questao"%>
<%@page import="br.com.poo.quiz.Quiz"%>
<%@page import="br.com.poo.quiz.Usuario"%>
<%@page import="br.com.poo.quiz.BancoUsuarios"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quizz</title>
        
        <!--INCLUDE CSS -->
        <%@include file="WEB-INF/jspf/includeCssMenu-footer.jspf" %>
        
        <!-- INCLUDE CSS END-->
    </head>
    <body>
        <!-- INCLUDE MENU -->
        <%@include file="WEB-INF/jspf/includeMenu.jspf" %>
        <!-- INCLUDE MENU END -->


<%if(request.getParameter("finalizar") != null){
            int acertos = 0;
            for (Questao q : Quiz.getQuestoes()){
                String resposta = request.getParameter(q.getPergunta());
                if (resposta != null){
                    if(resposta.equals(q.getResposta())){
                        acertos++;
                    }
                }
            }
            
            Quiz.quantidade++;
            Quiz.soma+=(100.0*((double)acertos/10.0));
            for(Usuario usuario : BancoUsuarios.getUsuarios()){
                usuario.setQtPontuacoesUsuario(100.0*((double)acertos/10.0));
            }
            response.sendRedirect(request.getContextPath()+"/home.jsp");
        }%>
        <form>
                <%for(Questao questao : Quiz.getQuestoes()){%>
                <h4><%=questao.getPergunta()%></h4>
                <input type="radio" name="<%=questao.getPergunta()%>" value="<%=questao.getAlternativas()[0]%>">
                <%=questao.getAlternativas()[0]%>
                <input type="radio" name="<%=questao.getPergunta()%>" value="<%=questao.getAlternativas()[1]%>">
                <%=questao.getAlternativas()[1]%>
                <input type="radio" name="<%=questao.getPergunta()%>" value="<%=questao.getAlternativas()[2]%>">
                <%=questao.getAlternativas()[2]%>
                <input type="radio" name="<%=questao.getPergunta()%>" value="<%=questao.getAlternativas()[3]%>">
                <%=questao.getAlternativas()[3]%>
                <%}%>
                <br><br>
                <input type="submit" name="finalizar" value="Finalizar"> 
        </form>
        
        <!-- INCLUDE FOOTER -->
        <%@include file="WEB-INF/jspf/includeFooter.jspf" %>
        <!-- INCLUDE FOOTER END -->
    </body>
</html>
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
        
        <div class="card border-secondary mb-3" 
             style="
             max-width: 20rem;
             margin: 0 auto;
             margin-top: 100px;">
            <div class="card-body">
                <h1 class="display-4 text-center">Login</h1>
                <form action="Login" method="post">
                  <div class="form-group">
                    <label for="loginUsuario">Usuário</label>
                    <input type="text" name="usuario" class="form-control" id="loginUsuario" placeholder="Digite seu nome de usuário">
                  </div>
                  <div class="form-group">
                    <label for="loginSenha">Senha</label>
                    <input type="password" name="senha" class="form-control" id="loginSenha" placeholder="Digite sua senha">
                  </div>
                  <button type="submit" value="login" class="btn btn-primary btn-lg" style="width: 100%">Entrar</button>
                </form>
            </div>
        </div>
        
        
        
        <!-- INCLUDE FOOTER -->
        <%@include file="WEB-INF/jspf/includeFooter.jspf" %>
        <!-- INCLUDE FOOTER END -->
    </body>
</html>

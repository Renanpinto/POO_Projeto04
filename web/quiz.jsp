<%-- 
    Document   : home
    Created on : 13/10/2017, 19:28:35
    Author     : Renan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
<!-- Style CSS -->

    </head>
    <body>
        <h1>Quiz</h1>
    <%
        if(session.getAttribute("user")==null){
            response.sendRedirect("index.html");
        }
    
    %>
	</br>
	</br>
	<form action="Logout" method="post">
		<input type="submit" value="Logout">
	</form>
    </body>
</html>

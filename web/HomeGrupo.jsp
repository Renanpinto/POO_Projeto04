<%-- 
    Document   : HomeGrupo
    Created on : 16/10/2017, 22:43:26
    Author     : Renan
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Projeto Quizz</title>

        <!--INCLUDE CSS -->
        <link rel="stylesheet" type="text/css" href="css/estilo.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
        <link href='https://fonts.googleapis.com/css?family=Kaushan+Script' rel='stylesheet' type='text/css'>
        <link href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
        <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
        <!-- INCLUDE CSS END-->
    </head>
    <body id="home">
       <!-- INCLUDE MENU -->
        <%@include file="WEB-INF/jspf/includeMenu.jspf" %>
        <!-- INCLUDE MENU END -->

        <!--CABEÇALHO-->
        <header >
            <div class="container">
                <div class="titulo">Vamos Jogar?</div>
                <div> <a href="telalogin.jsp"   class="btn btn-success btn-group-lg btn-lg"><h4>Jogar</h4></a></div>

            </div>
        </div>
    </header>

    

    <!-- GRUPO -->
    <section  id="team">
        <div class="container">
            <br>
            <br>
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2 class="section-heading">Grupo</h2>

                </div>
            </div>
            <br/>
            <br/>
            <div class="row">
                <div class="col-md-3">
                    <div class="team-member">
                        <img class="img-fluid rounded-circle" src="img/renan.JPG" alt="">
                        <h4>Renan Pinto</h4>
                        <p class="text-muted">RA: 1290481613036</p>
                        <ul class="list-inline social-buttons">
                            <li class="list-inline-item">
                                <a href="#">
                                    <i class="fa fa-github"></i>
                                </a>
                            </li>
                            <li class="list-inline-item">
                                <a href="#">
                                    <i class="fa fa-facebook"></i>
                                </a>
                            </li>
                            <li class="list-inline-item">
                                <a href="#">
                                    <i class="fa fa-linkedin"></i>
                                </a>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="col-sm-3">
                    <div class="team-member">
                        <img class="img-fluid mx-auto rounded-circle" src="img/vitor.jpg" alt="">
                        <h4>Vitor Yugulis</h4>
                        <p class="text-muted">RA: 12904816113012</p>
                        <ul class="list-inline social-buttons">
                            <li class="list-inline-item">
                                <a href="#">
                                    <i class="fa fa-github"></i>
                                </a>
                            </li>
                            <li class="list-inline-item">
                                <a href="#">
                                    <i class="fa fa-facebook"></i>
                                </a>
                            </li>
                            <li class="list-inline-item">
                                <a href="#">
                                    <i class="fa fa-linkedin"></i>
                                </a>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="col-sm-3">
                    <div class="team-member">
                        <img class="img-fluid mx-auto rounded-circle" src="img/Fabin.jpg" alt="">
                        <h4>Fabio Araujo</h4>
                        <p class="text-muted">RA: 12904816113019</p>
                        <ul class="list-inline social-buttons">
                            <li class="list-inline-item">
                                <a href="#">
                                    <i class="fa fa-github"></i>
                                </a>
                            </li>
                            <li class="list-inline-item">
                                <a href="#">
                                    <i class="fa fa-facebook"></i>
                                </a>
                            </li>
                            <li class="list-inline-item">
                                <a href="#">
                                    <i class="fa fa-linkedin"></i>
                                </a>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="col-sm-3">
                    <div class="team-member">
                        <img class="img-fluid mx-auto rounded-circle" src="img/Victor.jpg" alt="">
                        <h4>Victor Burghi</h4>
                        <p class="text-muted">RA: 12904816113036</p>
                        <ul class="list-inline social-buttons">
                            <li class="list-inline-item">
                                <a href="http://github.com/renanpinto">
                                    <i class="fa fa-github"></i>
                                </a>
                            </li>
                            <li class="list-inline-item">
                                <a href="#">
                                    <i class="fa fa-facebook"></i>
                                </a>
                            </li>
                            <li class="list-inline-item">
                                <a href="http://linkedin.com/renan-pinto">
                                    <i class="fa fa-linkedin"></i>
                                </a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>

        </div>
    </section><br/>
    <!-- WoW Js-->
        <script type="text/javascript" src="js/wow.js"></script>
        <script>
            new WOW().init();
        </script>
</body>
</html>



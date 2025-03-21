<%@page import="Servlets.Ajout_trajet"%>
<%@page import="Beans.Trajet"%>
<%@page import="java.util.ArrayList"%>


<%@page import="java.io.FileOutputStream"%>
<%@page import="java.sql.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tout Les Trajets</title>


<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">


<!-- Bootstrap core CSS -->
<link href="listet/vendor_accueil/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link href="listet/css/creative.min.css" rel="stylesheet">
<!-- _______________fa fa search________________ -->
<link href="listet/vendor_accueil/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">



</head>
<body style="background: grey;">
	

<%
		response.setHeader("cache-control", "no-cache , no-store , must-revalidate");
		if (session.getAttribute("email") == null) {
			request.setAttribute("message", "sorry, you're session is dead");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
		
	%>





	<nav class="navbar navbar-expand-lg navbar-light fixed-top"
		id="mainNav">
	<div class="container">
		<a style="margin: 0px 0px 0px -200px;"
			class="navbar-brand js-scroll-trigger"
			href="AccueilVoyageur.jsp">HAYYA !</a>
		<button class="navbar-toggler navbar-toggler-right" type="button"
			data-toggle="collapse" data-target="#navbarResponsive"
			aria-controls="navbarResponsive" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarResponsive">
			
				</a> <!-- 						_________________________________________ -->
					
<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" data-toggle="dropdown" href="#">GERER
						TRAJET <span class="caret"></span>
				</a> <!-- 						_________________________________________ -->
					<ul class="dropdown-menu">
						<li class="nav-item"><a class="nav-link js-scroll-trigger"
							href="ajouter_trajet.jsp">AJOUTER TRAJET</a></li>
						<li class="nav-item"><a class="nav-link js-scroll-trigger"
							href="SupprimerTrajet.jsp">SUPPRIMER TRAJET</a></li>
						<li class="nav-item"><a class="nav-link js-scroll-trigger"
							href="modifier_trajet.jsp">MODIFIER TRAJET</a></li>
					</ul></li>


				
			<!-- 				<button class="btn btnprimary btn-l js-scroll-trigger" -->
			<!-- 					type="button" name="button" on>Poster annonce</button> -->
		</div>
	</div>
	</nav>
	<!-- 		<header class="masthead text-center text-white d-flex"></header> -->

	<div class="card-deck" style="margin: 120px;">
	<div style="color: green;">${message }</div>
		<div class="row">



<%
	ArrayList<Trajet> a =(ArrayList<Trajet>) request.getAttribute("SelectionConducteurTrajet");
	
	for(int i=0; i<a.size();i++){
		%>
			<div class="col-sm-4" style="margin: 0px 0px 50px 0px">
				<div class="card" style="width:500px;margin-right:500px;">
					<img class="card-img-top" src="home-assets/images/banner.jpg"
						alt="Card image cap">
						<div class="card-header" style="background: #f05f40;" >
						
				<h1 class="card-title" style="color:#fff" ><%=a.get(i).getLieu_départ() %>-<%=a.get(i).getLieu_arrivée()%>
				</h1>
			</div>
					<div class="card-body">
						
						<p class="card-text"> Heure départ <%=a.get(i).getHeure_départ()%> .
						</p>
						
					
				
						
						<p class="card-text"> Prix <%=a.get(i).getPrix()%> DA.
						</p>
						
					
				
						
						<p class="card-text"> Nombre de places <%=a.get(i).getPlace()%> .
						</p>
						
			</div>
				<form action="SelectIDTrajet" method="post" >
					<div class="card-footer">
						<small class="text-muted">Date départ <%=a.get(i).getDate_départ()%></small>
					</div>
					<center>
				<button  style="background: #f05f40;color:#fff; border-radius:5px" class="btn" name="voir" value="<%=a.get(i).getId_trajet() %>">
				Réserver Trajet
				</button>
					</center>
				</form>
				</div>
			</div>


		<%
	}
	%>

		</div>

	</div>

	<!-- 	<!-- Bootstrap core JavaScript -->
	<script src="listet/vendor_accueil/jquery/jquery.min.js"></script>
	<script src="listet/vendor_accueil/bootstrap/js/bootstrap.bundle.min.js"></script>
	<!-- 	<!-- Plugin JavaScript -->
	<script src="listet/vendor_accueil/jquery-easing/jquery.easing.min.js"></script>
	<script src="listet/vendor_accueil/scrollreveal/scrollreveal.min.js"></script>
	<script
		src="listet/vendor_accueil/magnific-popup/jquery.magnific-popup.min.js"></script>
	<!-- 	Custom scripts for this template -->
	<script src="listet/js/creative.min.js"></script>
</body>
</html>>
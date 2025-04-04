<!DOCTYPE html>

<html lang="en">
<head>
<title>Espace Voyageur</title>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Delish Food Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design" />
<script type="application/x-javascript">
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } 
</script>
<!-- //for-mobile-apps -->
<link href="home-assets/css/bootstrap.css" rel="stylesheet"
	type="text/css" media="all" />
<link href="home-assets/css/font-awesome.css" rel="stylesheet">
<link href="home-assets/css/style.css" rel="stylesheet" type="text/css"
	media="all" />
<!--web-fonts-->
<link href="//fonts.googleapis.com/css?family=Montserrat:400,700"
	rel="stylesheet">
<link href="//fonts.googleapis.com/css?family=Lato:300,400,700"
	rel="stylesheet">
<link href="//fonts.googleapis.com/css?family=Tangerine:400,700"
	rel="stylesheet">
<!--//web-fonts-->
</head>
<body>
	
	
<%
		response.setHeader("cache-control", "no-cache , no-store , must-revalidate");
		if (session.getAttribute("email") == null) {
			request.setAttribute("message", "sorry, you're session is dead");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
		
	%>
	
	
	
	

	<!-- banner -->
	<div class="banner" id="home">
		<!-- header -->
		<div class="banner-top">
			<div class="social-bnr-agileits">
				<br>

				<ul>
					<li><a href="#"><i class="fa fa-facebook"
							aria-hidden="true"></i></a></li>
					<li><a href="#"><i class="fa fa-twitter"
							aria-hidden="true"></i></a></li>
					<li><a href="#"><i class="fa fa-google-plus"
							aria-hidden="true"></i></a></li>
					<li><a href="#"><i class="fa fa-linkedin"
							aria-hidden="true"></i></a></li>

				</ul>
			</div>
			<div class="contact-bnr-w3-agile">
				<ul>

					<li class="menu__item menu__item--current"><a
						href="proposer_trajet.jsp"
						style="height: 50px; width: 100px; background: #fd6239"><h2>
								<span class="label label-warning"><i
									class="fa fa-plus-circle" style="color: white"></i>Proposer
									Trajet </span>
							</h2></a></li>

					<li class="menu__item"><a href="services.html"
						class=" menu__link"><a href="Aide.jsp" class=" menu__link">Aide</a></li>
					<li class="dropdown menu__item menu__item--current"><a
						href="#" class="dropdown-toggle menu__link" data-toggle="dropdown"
						role="button" aria-haspopup="true" aria-expanded="false">Profil
							<span class="caret"></span>
					</a>
						<ul class="dropdown-menu">
							<li><a href="profil_voyageur.jsp" style="color: black">Voir
									profil</a></li>
							
							
							<li><a href="listconducteur.jsp" style="color: black">Liste des conducteurs</a></li>
							<li><a href="ToutLesTrajets1.jsp" style="color: black">Trajets</a></li>
							<li>
							<form action="Deconnecte" method="Get">
							<button style="color:black" name="Deconnecte" value="Deconnecte">Deconnexion</button>
							</form>
							</li>

						</ul></li>

				</ul>
			</div>
			<div class="clearfix"></div>
		</div>
		<header>
			<div class="container">

				<!-- navigation -->
				<div class="w3_navigation">
					<nav class="navbar navbar-default">
						<div class="navbar-header navbar-left">
							<button type="button" class="navbar-toggle collapsed"
								data-toggle="collapse"
								data-target="#bs-example-navbar-collapse-1">
								<span class="sr-only">Toggle navigation</span> <span
									class="icon-bar"></span> <span class="icon-bar"></span> <span
									class="icon-bar"></span>
							</button>

						</div>
						<!-- Collect the nav links, forms, and other content for toggling -->

					</nav>
				</div>
				<div class="clearfix"></div>
				<!-- //navigation -->
			</div>
		</header>
		<!-- //header -->
		<!-- banner-text -->
		<div class="banner-text">
			<h2>HAYYA , ROULER MOINS CHER !</h2>
			<div class="book-form">
				<p>Chercher trajet.</p>
			   <form action="ResultatRecherche" method="post">
					<div class="col-md-3 form-time-w3layouts">
							<label><i class="fa  fa-map-marker" aria-hidden="true"></i> De :</label>
							 <input name="lieu_d�part" class="select2_single form-control" tabindex="-1">
                            
							
					</div>
					<div class="col-md-3 form-left-agileits-w3layouts ">
							<label><i class="fa  fa-map-marker" aria-hidden="true"></i> A :</label>
							<input name="lieu_arriv�e" class="select2_single form-control" tabindex="-1">
                          
                          
					</div>
					<div class="col-md-3 form-date-w3-agileits">
						        <label><i class="fa fa-calendar" aria-hidden="true"></i> Date :</label>
<!-- 									<input  id="datepicker1" name="date" type="text" value="dd/mm/yyyy" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'mm/dd/yyyy';}" required=""> -->
									<input   name="date" type="date"  required="">
								</div>
					<div class="col-md-3 form-left-agileits-submit">
						  <input type="submit" value="Chercher">
					</div>
				</form>
			</div>
		</div>
		<!-- gallery -->
		<div class="gallery-ban" id="gallery">
			<div class="container">
				<ul id="flexiselDemo1">
					<li>
						<div class="wthree_testimonials_grid_main">

							<img src="home-assets/images/p1.jpg" alt=" " class="img-responsive" />
						</div>
					</li>
					<li>
						<div class="wthree_testimonials_grid_main">

							<img src="home-assets/images/p2.jpg" alt=" " class="img-responsive" />
						</div>
					</li>
					<li>
						<div class="wthree_testimonials_grid_main">

							<img src="home-assets/images/p3.jpg" alt=" " class="img-responsive" />
						</div>
					</li>
					<li>
						<div class="wthree_testimonials_grid_main">

							<img src="home-assets/images/p6.jpg" alt=" " class="img-responsive" />
						</div>
					</li>
					<li>
						<div class="wthree_testimonials_grid_main">

							<img src="home-assets/images/p4.jpg" alt=" " class="img-responsive" />
						</div>
					</li>
					<li>
						<div class="wthree_testimonials_grid_main">

							<img src="home-assets/images/p5.jpg" alt=" " class="img-responsive" />
						</div>
					</li>
				</ul>

			</div>
		</div>
		<!-- //gallery -->
	</div>
	<!-- //banner -->
	<div class="ab-w3l-about">
		<div class="container">
			<h3 class="tittle-w3">
				<h3 class="tittle-w3"><span>bienvenu dans notre</span> site</h3>
			<p class="para-w3l">Notre site fournir une offre en quasi temps r�el � l'usager covoitureur . La 
personne  souhaitant  effectuer  un  itin�raire  en  covoiturage  contacte  le  service  avant  son 
d�part. Le service va alors chercher le conducteur ad�quat qui est en mesure d'offrir le covoiturage souhait� 
sur l'itin�raire demand�.Avec  une  quantit�  suffisante  de  participants,  le  fonctionnement  est  souple  et  permet  une  bonne  qualit�  de 
service 
			<p><a class="read" href="single.html">Voir Plus</a></p>
	</div>
</div>
	<div class="about" id="about">
      <div class="col-md-6 ab-w3-agile-info">
	   <div class="ab-w3-agile-info-text">
	     <h3 class="tittle-w3">Apropos de<span> Nous</span></h3>
		 <p class="para-w3l">HAYYA rassemble une communaut� de covoiturage longue distance en Alg�rie. Nous mettons en relation des conducteurs voyageant avec des places libres et des passagers souhaitant faire le meme trajet.Les couts des trajets sont partag�s entre les covoitureurs. </p>
			<div class="about-read">
				<a href="aide.jsp">Voir Plus</a>
			</div>
		  </div>
		  <div class="ab-w3-agile-inner">
	       <div class="col-md-6 ab-w3-agile-part">
				<h4>Comment �a marche ?</h4>
		     <p class="para-w3l">Vous �tes passeger ? 
		     R�servez une place , simple et �conomique.
		     R�servez facilement votre place en ligne et voyagez moins cher , en toute confiance.Vite inscrivez vous avec HAYYA,  y a plus de temps � perdre et y a pas mieux</p>
	       </div>
			<div class="col-md-6 ab-w3-agile-part two">
			<h4>Vous �tre conducteur ?</h4>
		     <p class="para-w3l"> Proposez vos trajets et le nombre de places,
		     partagez vos frais,et �conomisez le prix du carburant en collaborant avec des voyageurs sympas lors de vos longs trajets.Vite inscrivez vous avec HAYYA,plus de temps � perdre</p>
	       </div>
			<div class="clearfix"></div>		   
	  </div>	
   </div>	 	  
	  <div class="col-md-6 ab-w3-agile-img">
	     
	  </div>
 
		<div class="clearfix"></div>
</div>
<!--blogs-->

				<div class="clearfix"></div>
		
</div>
<!--//blogs-->

	<!--count-->
			<div class="count-agileits">
				<div id="particles-js"></div>
					
					<div class="count-grids">
					<h3 class="tittle-w3">Prendre <span>en charge</span> vos besoins</h3>
					<div class="count-bgcolor-w3ls">
						<div class="col-md-4 count-grid">
						<i class="fa fa-car" aria-hidden="true"></i>
							<div class="count hvr-bounce-to-bottom">
								<div class='numscroller numscroller-big-bottom' >${nbrConduct}</div>
									<span></span>
									<h5>Conducteurs</h5>
							</div>
						</div>
						<div class="col-md-4 count-grid">
						<i class="fa fa-users" aria-hidden="true"></i>
							<div class="count hvr-bounce-to-bottom">
								<div class='numscroller numscroller-big-bottom' >${nbrVoy}</div>
									<span></span>
									<h5>Voyages</h5>
							</div>
						</div>
						<div class="col-md-4 count-grid">
						<i class="fa fa-user-plus" aria-hidden="true"></i>
							<div class="count hvr-bounce-to-bottom">
								<div class='numscroller numscroller-big-bottom' >${nbrReservation}</div>
									<span></span>
									<h5>Membres</h5>
								</div>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!--count-->
	<!--services-section-->
	<div class="services-w3layouts" id="services">
		<!-- //Stats -->


	</div>
	<div class="clearfix"></div>
	<!-- //Stats -->
	<div class="clearfix"></div>
	</div>
	<!--//services-section-->

	<!-- mail -->
	<div class="mail">
		<div class="mail-grid1">
			<div class="container">
				<h3 class="tittle-w3">
					Contact <span>Info</span>
				</h3>
				<div class="col-md-4 mail-agileits-w3layouts">
					<i class="glyphicon glyphicon-earphone" aria-hidden="true"></i>
					<div class="contact-right">
						<p>Phone</p>
						<span>(+213) 06-65-70-55-72</span>
					</div>
				</div>
				<div class="col-md-4 mail-agileits-w3layouts">
					<i class="glyphicon glyphicon-envelope" aria-hidden="true"></i>
					<div class="contact-right">
						<p>Email</p>
						<a href="mailto:info@example.com">HAYYA.covoiturage@gmail.com</a>
					</div>
				</div>
				<div class="col-md-4 mail-agileits-w3layouts">
					<i class="glyphicon glyphicon-map-marker" aria-hidden="true"></i>
					<div class="contact-right">
						<p>Addresse</p>
						<span>Ali Mendjli, Constantine, Alg�rie.</span>
					</div>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>

	
	</div>
	<!-- //mail -->

	<div class="copyright-wthree">
		<p>&copy; 2018 HAYYA Covoiturage</p>
	</div>
	<!-- //Footer -->

	<a href="#home" class="scroll" id="toTop" style="display: block;">
		<span id="toTopHover" style="opacity: 1;"> </span>
	</a>
	<!-- //smooth scrolling -->
	<script type="text/javascript" src="home-assets/js/jquery-2.1.4.min.js"></script>
	<script type="text/javascript" src="home-assets/js/numscroller-1.0.js"></script>
	<script src="home-assets/js/particles.js"></script>
	<script src="home-assets/js/app.js"></script>
	<!--gallery-->
	<script type="text/javascript">
		$(window).load(function() {
			$("#flexiselDemo1").flexisel({
				visibleItems : 4,
				animationSpeed : 1000,
				autoPlay : true,
				autoPlaySpeed : 3000,
				pauseOnHover : true,
				enableResponsiveBreakpoints : true,
				responsiveBreakpoints : {
					portrait : {
						changePoint : 480,
						visibleItems : 1
					},
					landscape : {
						changePoint : 640,
						visibleItems : 2
					},
					tablet : {
						changePoint : 768,
						visibleItems : 3
					}
				}
			});

		});
	</script>
	<script type="text/javascript" src="home-assets/js/jquery.flexisel.js"></script>
	<!--gallery-->
	<!-- Dropdown-Menu-JavaScript -->
	<script>
		$(document).ready(function() {
			$(".dropdown").hover(function() {
				$('.dropdown-menu', this).stop(true, true).slideDown("fast");
				$(this).toggleClass('open');
			}, function() {
				$('.dropdown-menu', this).stop(true, true).slideUp("fast");
				$(this).toggleClass('open');
			});
		});
	</script>
	<!-- //Dropdown-Menu-JavaScript -->
	<!-- Calendar -->
	<link rel="stylesheet" href="home-assets/css/jquery-ui.css" />
	<script src="home-assets/js/jquery-ui.js"></script>
	<script>
		$(function() {
			$("#datepicker,#datepicker1,#datepicker2,#datepicker3")
					.datepicker();
		});
	</script>
	<!-- //Calendar -->
	<!-- start-smoth-scrolling -->
	<script type="text/javascript" src="home-assets/js/move-top.js"></script>
	<script type="text/javascript" src="home-assets/js/easing.js"></script>
	<script type="text/javascript">
		jQuery(document).ready(function($) {
			$(".scroll").click(function(event) {
				event.preventDefault();
				$('html,body').animate({
					scrollTop : $(this.hash).offset().top
				}, 1000);
			});
		});
	</script>
	<!-- start-smoth-scrolling -->
	<!-- here stars scrolling icon -->
	<script type="text/javascript">
		$(document).ready(function() {
			/*
				var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
				};
			 */

			$().UItoTop({
				easingType : 'easeOutQuart'
			});

		});
	</script>
	<!-- //here ends scrolling icon -->
	<!--js for bootstrap working-->
	<script src="home-assets/js/bootstrap.js"></script>
	<!-- //for bootstrap working -->
	<!-- script-for-menu -->
	<script>
		$("span.menu").click(function() {
			$(".top-nav ul").slideToggle("slow", function() {
			});
		});
	</script>
	<!-- script-for-menu -->
</body>
</html>
<%@page import="Beans.Getuser"%>
<%@page import="Beans.Conducteur"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Ajouter trajet | </title>

    <!-- Bootstrap -->
    <link href="vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="vendors/nprogress/nprogress.css" rel="stylesheet">
    <!-- bootstrap-daterangepicker -->
    <link href="vendors/bootstrap-daterangepicker/daterangepicker.css" rel="stylesheet">
    
    <!-- Custom Theme Style -->
    <link href="build/css/custom.min.css" rel="stylesheet">
  </head>

  <body class="nav-md">

  
    <div class="container body">
      <div class="main_container">
        <div class="col-md-3 left_col">
          <div class="left_col scroll-view">
            <div class="navbar nav_title" style="border: 0;">
              <a href="index.html" class="site_title"><i class="fa fa-car"></i> <span>HAYYA !</span></a>
            </div>

            <div class="clearfix"></div>

           

            <!-- menu profile quick info -->
            <div class="profile clearfix">
              <div class="profile_pic">
                <img src="images/img.jpg" alt="..." class="img-circle profile_img">
              </div>
              <div class="profile_info">
                <span>Bienvenue !</span>
                <h2><%
							out.print(session.getAttribute("nom"));
						%></h2>
              </div>
            </div>
            <!-- /menu profile quick info -->

            
                 <br />
            <!-- sidebar menu -->
             

            <!-- menu profile quick info -->
           
            <!-- /menu profile quick info -->

          

            <!-- sidebar menu -->
            <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
              <div class="menu_section">
                <h3>MENU </h3>
                <ul class="nav side-menu">
                  <li><a href="AccueilConducteur.jsp"><i class="fa fa-home"></i> Acceuil <span class="fa fa-chevron-right"></span></a>
                    <ul class="nav child_menu">
                      
                      <li><a href="index2.html">Aide ?</a></li>
                      
                 
                      
                    </ul>
                  </li>
                  <li><a  href="Autre_trajet.jsp"><i class="fa fa-road"></i> D'autres trajets <span class="fa fa-chevron-right"></span></a>
                    
                  </li>
                    <li><a  href="listconducteur.jsp"><i class="fa fa-road"></i> Liste des conducteurs <span class="fa fa-chevron-right"></span></a>
                    
                  </li>
                  <li><a><i class="fa fa-question-circle"></i> Aide  <span class="fa fa-chevron-right"></span></a>
                    
                  </li>
                                    
                  
                </ul>
              </div>

            </div>
            <!-- /sidebar menu -->

            <!-- /menu footer buttons -->
            <div class="sidebar-footer hidden-small">
              <a data-toggle="tooltip" data-placement="top" title="Settings">
                <span class="glyphicon glyphicon-cog" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="FullScreen">
                <span class="glyphicon glyphicon-fullscreen" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="Lock">
                <span class="glyphicon glyphicon-eye-close" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="Logout" href="login.html">
                <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
              </a>
            </div>
            <!-- /menu footer buttons -->
          </div>
        </div>

        <!-- top navigation -->
         <div class="top_nav">
          <div class="nav_menu">
            <nav>
              <div class="nav toggle">
                <a id="menu_toggle"><i class="fa fa-bars"></i></a>
              </div>
         <ul class="nav navbar-nav navbar-right">
                <li class="">
                  <a href="javascript:;" class="user-profile dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                    <img src="images/img.jpg" alt=""><%
							out.print(session.getAttribute("nom"));
						%>
                    <span class=" fa fa-angle-down"></span>
                  </a>
                  <ul class="dropdown-menu dropdown-usermenu pull-right">
                    <li><a href="javascript:;"> Profile</a></li>
                    <li>
                      <a href="javascript:;">
                        <span class="badge bg-red pull-right">50%</span>
                        <span>Paramètres</span>
                      </a>
                    </li>
                    <li><a href="javascript:;">Aide</a></li>
					
                    <li><a href="login.jsp"><i class="fa fa-sign-out pull-right"></i> Déconnecter</a></li>
                  </ul>
                </li>

                <li role="presentation" class="dropdown">
                  <a href="javascript:;" class="dropdown-toggle info-number" data-toggle="dropdown" aria-expanded="false">
                    <i class="fa fa-envelope-o"></i>
                    <span class="badge bg-green">6</span>
                  </a>
                  <ul id="menu1" class="dropdown-menu list-unstyled msg_list" role="menu">
                    <li>
                      <a>
                        <span class="image"><img src="images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>Kadri Leila</span>
                          <span class="time">y a 3 min</span>
                        </span>
                        <span class="message">
                          A quel heure l'arrivée ??
                        </span>
                      </a>
                    </li>
                    <li>
                      <a>
                        <span class="image"><img src="images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>Taibi Samir</span>
                          <span class="time">y a 1 heure</span>
                        </span>
                        <span class="message">
                          Faites vous des escales ?
                        </span>
                      </a>
                    </li>
                    <li>
                      <a>
                        <span class="image"><img src="images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>Bouras Toufik</span>
                          <span class="time">y a 90 min</span>
                        </span>
                        <span class="message">
                          :::::: ?
                        </span>
                      </a>
                    </li>
                    <li>
                      <a>
                        <span class="image"><img src="images/picture.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>Barik Amira</span>
                          <span class="time">y a 2 heures</span>
                        </span>
                        <span class="message">
                          imprimer votre billet 
                        </span>
                      </a>
                    </li>
                    <li>
                      <div class="text-center">
                        <a>
                          <strong>Voir toutes les allertes</strong>
                          <i class="fa fa-angle-right"></i>
                        </a>
                      </div>
                    </li>
                  </ul>
                </li>
              </ul>
            </nav>
          </div>
        </div>
        <!-- /top navigation -->

        <!-- page content -->
        <div class="right_col" role="main">
          <div class="">
            <div class="page-title">
              <div class="title_left">
                <h3>Profil conducteur</h3>
              </div> 
			  <div class="buttons">
			  <div class="title_left">
			           
						
						
						
                </div>
			     <br>
				 <br>
				       
				       
			           </div>

              
			  
                   
                  </div>
                
             </div>

                      <div class="clearfix"></div>
                    <%ArrayList<Conducteur>ar=new Getuser().getconducteur();
                    for(int i=0;i<ar.size();i++){
                    Conducteur c=ar.get(i);
                    %>       
                      <div class="col-md-4 col-sm-4 col-xs-12 profile_details">
						
                        <div class="well profile_view">
						  
                          <div class="col-sm-12">
						  
                            <div class="left col-xs-7">
                              <h2><%=c.getBdnom()+" "+c.getBdprenom() %></h2>
                              <p><strong>date de naissance : </strong><%=c.getBddate_nais()%>  </p>
                              <ul class="list-unstyled">
                               
                                <li><i class="fa fa-mail"></i> <%=c.getBdemail()%> </li>
                              </ul>
                            </div>
                            <div class="right col-xs-5 text-center">
                              <img src="<%="photo/"+c.getPhoto() %>" alt="" class="img-circle img-responsive">
                            </div>
                          </div>
                          <div class="col-xs-12 bottom text-center">
                            <div class="col-xs-12 col-sm-6 emphasis">
                              <p class="ratings">
                                <a>4.0</a>
                                <a href="#"><span class="fa fa-star"></span></a>                
                                <a href="#"><span class="fa fa-star"></span></a>
                                <a href="#"><span class="fa fa-star"></span></a>
                                <a href="#"><span class="fa fa-star"></span></a>
                                <a href="#"><span class="fa fa-star-o"></span></a>
                              </p>
                            </div>
                            <div class="col-xs-12 col-sm-6 emphasis">
                            <form action="Commentaire.jsp"> 
                              <button type="button" class="btn btn-success btn-xs" value="<%=c.getId_conducteur()%>"><i class="fa fa-user">
                                </i> <i class="fa fa-comments-o"></i> </button></form>
								<button type="button" class="btn btn-success btn-xs" style="background:#FC9405"> <a  href="Commentaire.jsp" > <i class="fa fa-credit-card">
                                </i> <i class="fa fa-check"></i> </button> </a>
                              <button type="button" class="btn btn-primary btn-xs">
                                <i class="fa fa-user"> </i><form action="profil_conducteur.jsp"><input name="id" type="hidden" value="<%=c.getId_conducteur()%>"><button> Voir Profile</button></form>
                              </button>
                            </div>
                          </div>
                        </div>
                      </div>

                  <% } %>
                </div>
              </div>
            </div>
          </div>
        </div>
        <!-- /page content -->

        <!-- footer content -->
        <footer>
          <div class="pull-right">
            <a href="https://colorlib.com">Hayya covoiturage</a>
          </div>
          <div class="clearfix"></div>
        </footer>
        <!-- /footer content -->
      </div>
    </div>

    <!-- jQuery -->
    <script src="vendors/jquery/dist/jquery.min.js"></script>
    <!-- Bootstrap -->
    <script src="vendors/bootstrap/dist/js/bootstrap.min.js"></script>
    <!-- FastClick -->
    <script src="vendors/fastclick/lib/fastclick.js"></script>
    <!-- NProgress -->
    <script src="vendors/nprogress/nprogress.js"></script>

    <!-- Custom Theme Scripts -->
    <script src="build/js/custom.min.js"></script> 
    
  </body>
</html>
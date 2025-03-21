<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="Beans.Voyageur"%>
<%@page import="Beans.Getuser"%>
<%@page import="java.util.ArrayList"%>


<!DOCTYPE html>
<html lang="en">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Profil voyageur | </title>

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
  
<%
		response.setHeader("cache-control", "no-cache , no-store , must-revalidate");
		if (session.getAttribute("email") == null) {
			request.setAttribute("message", "sorry, you're session is dead");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
		
	%>
  
  
  
  
  
  
  
  
  
    <div class="container body">
      <div class="main_container">
        <div class="col-md-3 left_col">
          <div class="left_col scroll-view">
            <div class="navbar nav_title" style="border: 0;">
              <a href="index.html" class="site_title"><i class="fa fa-car"></i> <span>HAYYA !</span></a>
              <%ArrayList<Voyageur>ar=new Getuser().getVoyageur();
                    for(int i=0;i<ar.size();i++){
                    Voyageur c=ar.get(i);
                    %>  
            </div>

            <div class="clearfix"></div>

           

            <!-- menu profile quick info -->
            <div class="profile clearfix">
              <div class="profile_pic">
               <img src="photo/<%=c.getPhoto() %>" alt="..." class="img-circle profile_img">
              </div>
              <div class="profile_info">
                <span>Bienvenue !</span>
                <h2><%=c.getBdnom() %>
						</h2></h2>
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
                  <li><a href="AccueilVoyageur.jsp"><i class="fa fa-home"></i> Acceuil <span class="fa fa-chevron-right"></span></a>
                    <ul class="nav child_menu">
                      
                      
                      
                 
                      
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
                     <img src="photo/<%=c.getPhoto() %>" alt=""><%=c.getBdnom()+" "+c.getBdprenom() %>
                    <span class=" fa fa-angle-down"></span>
                  </a>
                  <ul class="dropdown-menu dropdown-usermenu pull-right">
                    <li><a href="profil_voyageur.jsp"> Profile</a></li>
                    
                    <li><a href="javascript:;">Aide</a></li>
					
                    <li><a href="Accueil.jsp"><i class="fa fa-sign-out pull-right"></i> Déconnecter</a></li>
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
                <h3>Profile voyageur</h3>
              </div> 
			  <div class="buttons">
			  <div class="title_left">
			  <form method="post">
			            <button type="submit" class="btn btn-success btn-lg">
				        <a href="AccueilVoyageur.jsp"><i class="fa fa-search"></i> Rechercher trajet</button></a>
						
						<button type="submit" class="btn btn-success btn-lg">
				        <a href="proposer_trajet.jsp"><i class="fa fa-plus-circle"></i> Proposer trajet</button></a>
						<br>
					</form>	
                </div>
			     <br>
				 <br>
				      
              
			  
                   
                  </div>
                
             </div>
            
            <div class="clearfix"></div>

            <div class="row">
              <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>  Général </h2>
                    <ul class="nav navbar-right panel_toolbox">
                      <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                      </li>
                      <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>
                        <ul class="dropdown-menu" role="menu">
                          <li><a href="#">Settings 1</a>
                          </li>
                          <li><a href="#">Settings 2</a>
                          </li>
                        </ul>
                      </li>
                      <li><a class="close-link"><i class="fa fa-close"></i></a>
                      </li>
                    </ul>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <div class="col-md-3 col-sm-3 col-xs-12 profile_left">
                      <div class="profile_img">
                        <div id="crop-avatar">
                          <!-- Current avatar -->
                          <img class="img-responsive avatar-view" src="photo/<%=c.getPhoto() %>" alt="Avatar" title="Change the avatar">
                        </div>
                      </div>
                      <h3><%=c.getBdnom()+" "+c.getBdprenom() %></h3>

                      <ul class="list-unstyled user_data">
                        

                        <li class="m-top-xs">
                          <i class="fa fa-external-link user-profile-icon"></i>
                          <%=c.getBdemail() %>
                        </li>
                      </ul>
                       <form action="SuppressionCompte" method="post">
                      <a class="btn btn-success" href="modifier_compte.jsp"><i class="fa fa-edit m-right-xs" type="button"></i> modifier Profile</a>
					  </form>
					  <a data-toggle="modal" data-target="#modalRegisterForm" class="btn btn-success" style="background:gray"  type="submit"><i class="fa fa-trash-o"></i>supprimer compte</a>

                      <br />

                      <!-- start skills -->
                      
                      <!-- end of skills -->

                    </div>
                    <div class="col-md-9 col-sm-9 col-xs-12">

                      <div class="profile_title">
                        <div class="col-md-6">
                          <h2>Rapoort des dernnières activitées</h2>
                        </div>
                        <div class="col-md-6">
                          <div id="reportrange" class="pull-right" style="margin-top: 5px; background: #fff; cursor: pointer; padding: 5px 10px; border: 1px solid #E6E9ED">
                            <i class="glyphicon glyphicon-calendar fa fa-calendar"></i>
                            <span>December 30, 2014 - January 28, 2015</span> <b class="caret"></b>
                          </div>
						  
                        </div>
						<br>
                      </div>
						  
				       
                      <!-- start of user-activity-graph -->
                      
                      <!-- end of user-activity-graph -->

                      
                            <!-- start recent activity -->
                            <ul class="messages">
                              <li>
                                <img src="images/img.jpg" class="avatar" alt="Avatar">
                                <div class="message_date">
                                  <h3 class="date text-info">24</h3>
                                  <p class="month">Mai</p>
                                </div>
                                <div class="message_wrapper">
                                  
                                  <blockquote class="message"> De <strong> Constantine </strong> vers <strong> Alger</strong> </blockquote>
                                  <br />
                                  
                                </div>
                              </li>
                              <li>
                                <img src="images/img.jpg" class="avatar" alt="Avatar">
                                <div class="message_date">
                                  <h3 class="date text-error">02</h3>
								   <h4 class="heading">    </h4>
                                  <p class="month">Février</p>
                                </div>
                                <div class="message_wrapper">
                                  
                                  <blockquote class="message"> De <strong> Alger </strong> vers <strong> Annaba</strong></blockquote>
                                  <br />
                                  
                                </div>
                              </li>
                              <li>
                                <img src="images/img.jpg" class="avatar" alt="Avatar">
                                <div class="message_date">
                                  <h3 class="date text-info">29</h3>
								   <h4 class="heading">   </h4>
                                  <p class="month">Decembre</p>
                                </div>
                                <div class="message_wrapper">
                                  
                                  <blockquote class="message"> De <strong> Alger </strong> vers <strong> Oran</strong></blockquote>
                                  <br />
                                  
                                </div>
                              </li>
                              

                            </ul>
                            <!-- end recent activity -->

				<div class="col-md-6 col-sm-6 col-xs-12" style="height: 900px ; width: 780px">
					<div class="x_panel" >
					  <div class="x_title">
						<h2><i class="fa fa-bars"></i> Infos </h2>
						<ul class="nav navbar-right panel_toolbox">
						  <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
						  </li>
						  <li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>
							<ul class="dropdown-menu" role="menu">
							  <li><a href="#">Settings 1</a>
							  </li>
							  <li><a href="#">Settings 2</a>
							  </li>
							</ul>
						  </li>
						  <li><a class="close-link"><i class="fa fa-close"></i></a>
						  </li>
						</ul>
						<div class="clearfix"></div>
					  </div>
					  <div class="x_content">


						<div class="" role="tabpanel" data-example-id="togglable-tabs">
						  <ul id="myTab" class="nav nav-tabs bar_tabs" role="tablist">
							
							<li role="presentation" class="active"><a href="#tab_content2" role="tab" id="profile-tab" data-toggle="tab" aria-expanded="false">Profile</a>
							</li>
							<li role="presentation" class=""><a href="#tab_content3" role="tab" id="profile-tab2" data-toggle="tab" aria-expanded="false">Top trajets</a>
							</li>
							
						  </ul>
						  <div id="myTabContent" class="tab-content">
							<div role="tabpanel" class="tab-pane fade active in" id="tab_content1" aria-labelledby="home-tab">
							  
							  
							</div>
							
							<div role="tabpanel" class="tab-pane fade" id="tab_content2" aria-labelledby="profile-tab">
							  <form class="form-horizontal form-label-left input_mask">
                                   <div class="form-group">
								  <div class="col-md-6 col-sm-6 col-xs-12 form-group has-feedback">
									<input type="text" class="form-control has-feedback-left" id="inputSuccess2"  readonly="readonly" placeholder="<%=c.getBdnom()%>">
									<span class="fa fa-user form-control-feedback left" aria-hidden="true"></span>
								  </div>
								  </div>
                                   <div class="form-group">
								  <div class="col-md-6 col-sm-6 col-xs-12 form-group has-feedback">
									<input type="text" class="form-control has-feedback-left" id="inputSuccess3" readonly="readonly" placeholder="<%=c.getBdprenom()%>">
									<span class="fa fa-user form-control-feedback left" aria-hidden="true"></span>
								  </div>
								  </div>
                                   <div class="form-group">
								  <div class="col-md-6 col-sm-6 col-xs-12 form-group has-feedback">
									<input type="text" class="form-control has-feedback-left" id="inputSuccess4" readonly="readonly" placeholder="<%=c.getBdemail()%>">
									<span class="fa fa-envelope form-control-feedback left" aria-hidden="true"></span>
								  </div>
								  </div>
                                   
								  <div class="form-group">
								  <label class="col-md-6 col-sm-6 col-xs-12">Date de naissance <span class="required">*</span>
									</label>
								
									<div class="col-md-9 col-sm-9 col-xs-12">
									  <input type="date" class="form-control" rows="3" readonly="readonly"placeholder="11/12/1987"></input>
									</div>
								  </div>
								  <div class="form-group">
									<label class="col-md-6 col-sm-6 col-xs-12">Password</label>
									<div class="col-md-9 col-sm-9 col-xs-12">
									  <input type="password" class="form-control" readonly="readonly" value="passwordonetwo">
									</div>
									<br>
									<br>
									<br>
									<br>
                            <p style="color:red"><small>Si vous voulez modifier votre profil cliquez sur le bouton modifier profil en haut ! </small> </p>
                          </div>
							</div>
							<div role="tabpanel" class="tab-pane fade" id="tab_content3" aria-labelledby="profile-tab">
							  <h4>TRAJETS <small> (cette semaine)</small></h4>
                      <ul class="list-unstyled user_data">
                        <li>
                          <p>Alger <small> vers</small> Oran</p>
                          <div class="progress progress_sm">
                            <div class="progress-bar bg-red" role="progressbar" data-transitiongoal="70"></div>
                          </div>
                        </li>
                        <li>
                          <p>Contantine <small> vers </small> Alger</p>
                          <div class="progress progress_sm">
                            <div class="progress-bar bg-green" role="progressbar" data-transitiongoal="50"></div>
                          </div>
                        </li>
                        <li>
                          <p>Ouergla <small> vers </small> Contantine</p>
                          <div class="progress progress_sm">
                            <div class="progress-bar bg-green" role="progressbar" data-transitiongoal="30"></div>
                          </div>
                        </li>
                        <li>
                          <p>Annaba <small> vers </small> Jijel</p>
                          <div class="progress progress_sm">
                            <div class="progress-bar bg-green" role="progressbar" data-transitiongoal="55"></div>
                          </div>
                        </li>
                      </ul>
					          <div class="button">
							      
						
						          <button type="button" class="btn btn-success btn-lg" style="background-color : yellow">
				                  <a href="ToutLesTrajets.jsp"><i class="fa fa-trash-o"></i>Voir trajets</button></a>
							</div>
							</div>
							</form>
						
							
				   
           
            </div>
          </div>
        </div>
      </div>
						  </div>
						</div>

					  </div>
					</div>
				  </div>
 
        <!-- /page content -->

        <!-- footer content -->
        <footer>
          <div class="pull-right">
           <a href="https://colorlib.com">HAYYA covoiturage</a>
          </div>
          <div class="clearfix"></div>
        </footer>
        <!-- /footer content -->
      </div>
    </div>



<div class="modal fade" id="modalRegisterForm" tabindex="-1"
			role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="margin-top:300px;">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header text-center" style="background: #f05f40">
						<h4 class="modal-title w-100 font-weight-bold"
							style="color: #fff;">Message De Confirmation!</h4>
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
					</div>
					<div class="modal-body mx-3">
					<h1 class="card-title">Voulez-vous vraiement supprimer ce compte ?</h1>
					</div>

					<div class="modal-footer d-flex justify-content-center">
						<button data-dismiss="modal" aria-label="Close"
							style="color: #fff; margin-right: 16px; background: #f05f40; font-size: 17px; width: 300px; height: 40px; cursor: pointer;"
							type="submit">
							<i >Annuler</i>
						</button>
						<form action="SuppressionCompteVoy" method="post">
						<button name="sup" value=" <%=c.getId_voyageur()%>"
							style="color: #fff; margin-right: 16px; background: #f05f40; font-size: 17px; width: 300px; height: 40px; cursor: pointer;"
							type="submit">
							Confirmer 
						</button>
						</form>
					</div>
				</div>
			</div>
		</div>



<%
}
%>
    <!-- jQuery -->
    <script src="vendors/jquery/dist/jquery.min.js"></script>
    <!-- Bootstrap -->
    <script src="vendors/bootstrap/dist/js/bootstrap.min.js"></script>
    <!-- FastClick -->
    <script src="vendors/fastclick/lib/fastclick.js"></script>
    <!-- NProgress -->
    <script src="vendors/nprogress/nprogress.js"></script>
    <!-- morris.js -->
    <script src="vendors/raphael/raphael.min.js"></script>
    <script src="vendors/morris.js/morris.min.js"></script>
    <!-- bootstrap-progressbar -->
    <script src="vendors/bootstrap-progressbar/bootstrap-progressbar.min.js"></script>
    <!-- bootstrap-daterangepicker -->
    <script src="vendors/moment/min/moment.min.js"></script>
    <script src="vendors/bootstrap-daterangepicker/daterangepicker.js"></script>
    
    <!-- Custom Theme Scripts -->
    <script src="build/js/custom.min.js"></script>

  </body>
</html>
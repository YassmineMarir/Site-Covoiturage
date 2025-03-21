

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

            <div class="row">
              <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                  <div class="x_title">
                    <h2> Ajouter Trajet </h2>
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
                          <img class="img-responsive avatar-view" src="images/img.jpg" alt="Avatar" title="Change the avatar">
                        </div>
                      </div>
                      <h3>Mehamdi Ahmed</h3>

                      <ul class="list-unstyled user_data">
                        <li><i class="fa fa-map-marker user-profile-icon"></i> Rue El Istiklal,Annaba
                        </li>

                        <li>
                          <i class="fa fa-phone"></i> 05.61.99.03.71
                        </li>

                        <li class="m-top-xs">
                          <i class="fa fa-external-link user-profile-icon"></i>
                          <a href="http://www.kimlabs.com/profile/" target="_blank">Mehamdi.Ahmed@gmail.com</a>
                        </li>
                      </ul>

                      
					  <a class="btn btn-success" style="background:gray"><i class="fa fa-trash-o"></i>supprimer compte</a>
                      
                      <br />

                      <!-- start skills -->
                      
                      <!-- end of skills -->

                    </div>
                    <div class="col-md-9 col-sm-9 col-xs-12">

                      
						  
				       
                      <!-- start of user-activity-graph -->
                      
                      <!-- end of user-activity-graph -->

                      
                            <!-- start recent activity -->
                            
                            <!-- end recent activity -->

				<div class="col-md-6 col-sm-6 col-xs-12" style="height: 900px ; width: 780px">
					<div class="x_panel" >
					  <div class="x_title">
						<h2><i class="fa fa-bars"></i> Ajouter Trajet </h2> <br> <br>
						
							
							
				<form action="Ajout_trajet" method="post" class="form-horizontal form-label-left input_mask">
                                
									<div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">De :<span class="required">*</span></label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <select name="lieu_départ" class="select2_single form-control" tabindex="-1">

								<option value="vide"></option>
                           <% String [] wilay={"Adrar","Chelf","Laghouat","Oum El Bouaghi","Batna","Béjia","Biskra","Bachar","Blida","Bouira","Tmanrasset","Tbassa","Tlemcen","Tiaret","Tizi Ouzou","Alger","Djelfa","Jijel","Saida","Skika","Sidi Bel Abbas","Annaba","Guelma","Constantine","Mostaganem","M'sila","Maskar","Ouargla","Oran","Bayadh","Illizi","Bordj Bou Arridj","Boumeda","Tarf","Tindouf","Tissemsilt","El Oued","Khenchela","Souk Ahras","Tipaza","Mila","Ain Defla","Naama","Ain Témouchent","Ghardaia","Relizan"};
                            for(int i=0;i<45;i++){%>
                            <option value="<%=wilay[i]%>"><%=wilay[i]%></option><%}%>
								
								
			
                          </select>
                        </div>
                      </div>
									<br>
									<div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">A :<span class="required">*</span></label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <select name="lieu_arrivée" class="select2_single form-control" tabindex="-1">
                          
                          
                           <option value="vide"></option>
                           <% String [] wilaya={"Adrar","Chelf","Laghouat","Oum El Bouaghi","Batna","Béjia","Biskra","Bachar","Blida","Bouira","Tmanrasset","Tbassa","Tlemcen","Tiaret","Tizi Ouzou","Alger","Djelfa","Jijel","Saida","Skika","Sidi Bel Abbas","Annaba","Guelma","Constantine","Mostaganem","M'sila","Maskar","Ouargla","Oran","Bayadh","Illizi","Bordj Bou Arridj","Boumeda","Tarf","Tindouf","Tissemsilt","El Oued","Khenchela","Souk Ahras","Tipaza","Mila","Ain Defla","Naama","Ain Témouchent","Ghardaia","Relizan"};
                            for(int i=0;i<45;i++){%>
                            <option value="<%=wilaya[i]%>"><%=wilaya[i]%></option><%}%>
                          </select>
                        </div>
                      </div>
					  <br>
							
									
									<div class="form-group">
								  <label class="control-label col-md-3 col-sm-3 col-xs-12">Date Départ : <span class="required">*</span>
									</label>
								
									<div class="col-md-9 col-sm-9 col-xs-12">
									  <input name="date_départ" type="date" class="form-control" rows="3" placeholder="11/12/1987"></input>
									</div>
								  </div>
								  <br>
								  <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="first-name">Heure : <span class="required">*</span>
                        </label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input name="heure_départ" type="text" id="first-name" required="required" class="form-control col-md-7 col-xs-12">
                        </div>
                      </div>
                      <br>
				<br>
							<div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="first-name">Prix : <span class="required">*</span>
                        </label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <input name="prix"type="text" id="first-name" required="required" class="form-control col-md-7 col-xs-12">
                        </div>
                      </div>
								 
				<br>
						<div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">Places :<span class="required">*</span></label>
                        <div class="col-md-9 col-sm-9 col-xs-12">
                          <select name="place" class="select2_single form-control" tabindex="-1">

                            <option value="vide"></option>
                           <% String [] places={"1","2","3","4","5"};
                            for(int i=0;i<5;i++){%>
                            <option value="<%=places[i]%>"><%=places[i]%></option><%}%>




                           
                            
                          </select>
                        </div>
                      </div>
				
								<br>	
									<div class="buttons">
										<br>
										<br>
										<button type="submit" class="btn btn-success btn-lg" data-toggle="modal" data-target="#modalRegisterForm">
				                        <i class="fa fa-plus-circle"></i> Ajouter </button>
										<br>
										<br>
                         
                          </div>
							</div>
							</div>
							
							
							
							 
								
           
           			  </div>
						</div>

					  </div>
					</div>
				  </div>
            </div>
			
		</form>
 
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
					<h1 class="card-title">Trajet Ajouté !</h1>
					</div>

					<div class="modal-footer d-flex justify-content-center">
						<button data-dismiss="modal" aria-label="Close"
							style="color: #fff; margin-right: 16px; background: #f05f40; font-size: 17px; width: 300px; height: 40px; cursor: pointer;"
							type="submit">
							<i > OK </i>
						</button>
						
					</div>
				</div>
			</div>
		</div>
    

    <!-- jQuery -->
    <script src="../vendors/jquery/dist/jquery.min.js"></script>
    <!-- Bootstrap -->
    <script src="../vendors/bootstrap/dist/js/bootstrap.min.js"></script>
    <!-- FastClick -->
    <script src="../vendors/fastclick/lib/fastclick.js"></script>
    <!-- NProgress -->
    <script src="../vendors/nprogress/nprogress.js"></script>
    <!-- morris.js -->
    <script src="../vendors/raphael/raphael.min.js"></script>
    <script src="../vendors/morris.js/morris.min.js"></script>
    <!-- bootstrap-progressbar -->
    <script src="../vendors/bootstrap-progressbar/bootstrap-progressbar.min.js"></script>
    <!-- bootstrap-daterangepicker -->
    <script src="../vendors/moment/min/moment.min.js"></script>
    <script src="../vendors/bootstrap-daterangepicker/daterangepicker.js"></script>
    
    <!-- Custom Theme Scripts -->
    <script src="../build/js/custom.min.js"></script>

  </body>
</html>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="Dashboard">
    <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">

    <title>inscription</title>

    <!-- Bootstrap core CSS -->
    <link href="assets/css/bootstrap.css" rel="stylesheet">
    <!--external css-->
    <link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
        
    <!-- Custom styles for this template -->
    <link href="assets/css/style.css" rel="stylesheet">
    <link href="assets/css/style-responsive.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>

      <!-- **********************************************************************************************************************************************************
      MAIN CONTENT
      *********************************************************************************************************************************************************** -->

	  <div id="login-page">
	  	<div class="container">
	  	
		      <form action="Inscription" method="post" class="form-login" enctype="multipart/form-data"> <!--action="index.html"--> 
		        <h2 class="form-login-heading">inscription</h2>
		        <div class="login-wrap">
		        
		        
		        
		        

		         
		        	       
		            <input type="text" name="nom" class="form-control" placeholder="Nom" autofocus>
		             <br>
		             <input type="text" name="prenom" class="form-control" placeholder="Prenom" autofocus>
		              <br>
                      <input type="date" name="date_nais" class="form-control" placeholder="Date de naissance" autofocus>
                      <br> 
                      
                <!--      <div id="registration_gender" class="registration-gender select-register"><input type="radio" id="registration_gender_0" name="registration[gender]" required="required" value="_UE_M"><label for="registration_gender_0">
        Homme
</label>
<input type="radio" id="registration_gender_1" name="registration[gender]" required="required" value="_UE_MRS"><label for="registration_gender_1">
        Femme
</label></div>
		       <br> -->
                      
                      
                       
                       <input type="Email" name="mail" class="form-control" placeholder="Email" autofocus>
                        <br>
                        <select class="form-control" name="utilisateur">
                        <option value="vide">choisir le type d'utilisateur</option>
                        <option value="voyageur">Voyageur</option>
                        <option value="conducteur">Conducteur</option>
                        </select>
<!--                        <input type="text" name="utilisateur" class="form-control" placeholder="utilisateur" autofocus> -->
                      
                     
		            <br>
		           
		        
		            <input type="password" name="password" class="form-control" placeholder="Mot de passe">
		             <br>
		              
		              <input type="file" name="photo">
		              <br>
		            <button class="btn btn-theme btn-block" type="submit"><i class="fa fa-lock"></i>Valider</button>
		      </form>	  	
		          <div aria-hidden="true" aria-labelledby="myModalLabel" role="dialog" tabindex="-1" id="myModal" class="modal fade">
		              <div class="modal-dialog">
		                  <div class="modal-content">
	                <div class="modal-header">
		                          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		                          <h4 class="modal-title">Forgot Password ?</h4>
		                      </div>
		                      <div class="modal-body">
		                          <p>Enter your e-mail address below to reset your password.</p>
		                          <input type="text" name="email" placeholder="Email" autocomplete="off" class="form-control placeholder-no-fix">
		
		                      </div>
		                      <div class="modal-footer">
		                          <button data-dismiss="modal" class="btn btn-default" type="button">Cancel</button>
		                          <button class="btn btn-theme" type="button" name="op" value="inscrir" >Submit</button> 
		                          
		                   
		                          
		                      </div>
		                  </div>
		              </div>
		          </div>
		          <!-- modal -->
		
	  	
	  	</div>
	  </div>

    <!-- js placed at the end of the document so the pages load faster -->
    <script src="assets/js/jquery.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>

    <!--BACKSTRETCH-->
    <!-- You can use an image of whatever size. This script will stretch to fit in any screen size.-->
    <script type="text/javascript" src="assets/js/jquery.backstretch.min.js"></script>
    <script>
        $.backstretch("assets/img/login-bg.jpg", {speed: 500});
    </script>


  </body>
</html>

<%@ include file="header.jsp" %>	
 <body>
    <!-- NAVBAR
    ================================================== -->
    <div class="navbar-wrapper">
      <!-- Wrap the .navbar in .container to center it within the absolutely positioned parent. -->
      <div class="container">

        <div class="navbar navbar-inverse">
          <div class="navbar-inner">
            <!-- Responsive Navbar Part 1: Button for triggering responsive navbar (not covered in tutorial). Include responsive CSS to utilize. -->
            <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <a class="brand" href="./Carousel Template · Bootstrap_files/Carousel Template · Bootstrap.html">Luxury Rent</a>
            <!-- Responsive Navbar Part 2: Place all navbar contents you want collapsed withing .navbar-collapse.collapse. -->
            <div class="nav-collapse collapse">
              <ul class="nav">
                <li class="active"><a href="./Carousel Template · Bootstrap_files/Carousel Template · Bootstrap.html">Home</a></li>
                <li><a href="http://getbootstrap.com/2.3.2/examples/carousel.html#about">About</a></li>
                <li><a href="http://getbootstrap.com/2.3.2/examples/carousel.html#contact">Contact</a></li>
                <!-- Read about Bootstrap dropdowns at http://twbs.github.com/bootstrap/javascript.html#dropdowns -->
                <li class="dropdown">
                  <a href="./Carousel Template · Bootstrap_files/Carousel Template · Bootstrap.html" class="dropdown-toggle" data-toggle="dropdown">Dropdown <b class="caret"></b></a>
                  <ul class="dropdown-menu">
                    <li><a href="./Carousel Template · Bootstrap_files/Carousel Template · Bootstrap.html">Action</a></li>
                    <li><a href="./Carousel Template · Bootstrap_files/Carousel Template · Bootstrap.html">Another action</a></li>
                    <li><a href="./Carousel Template · Bootstrap_files/Carousel Template · Bootstrap.html">Something else here</a></li>
                    <li class="divider"></li>
                    <li class="nav-header">Nav header</li>
                    <li><a href="./Carousel Template · Bootstrap_files/Carousel Template · Bootstrap.html">Separated link</a></li>
                    <li><a href="./Carousel Template · Bootstrap_files/Carousel Template · Bootstrap.html">One more separated link</a></li>
                  </ul>
                </li>
              </ul>
            </div><!--/.nav-collapse -->
          </div><!-- /.navbar-inner -->
        </div><!-- /.navbar -->

      </div> <!-- /.container -->
    </div><!-- /.navbar-wrapper -->



    <!-- Carousel
    ================================================== -->
    <div id="myCarousel" class="carousel slide">
      <div class="carousel-inner">
        <div class="item">
          <img src="./Carousel Template · Bootstrap_files/slide-01-77.jpg" alt="">
          <div class="container">
            <div class="carousel-caption">
              <h1>Location de luxe</h1>
              <p class="lead">Pour que toutes vos envies de conduite puissent etre satisfaites, Luxury Rent a sélectionné des véhicules exceptionnels, des véhicules ayant pour points communs le plaisir de la conduite, la beauté et l’originalité des lignes.</p>
              <a class="btn btn-large btn-primary" href="./Carousel Template · Bootstrap_files/Carousel Template · Bootstrap.html">décourvir nos véhicules.</a>
            </div>
          </div>
        </div>
        <div class="item active">
          <img src="./Carousel Template · Bootstrap_files/slide-03.jpeg" alt="">
          <div class="container">
            <div class="carousel-caption">
              <h1>Vehicule avec chauffeur.</h1>
              <p class="lead">Fort de plusieurs années d'expérience, notre équipe met tout son savoir-faire à votre disposition afin de vous proposer le meilleur en matière de luxe.</p>
              <a class="btn btn-large btn-primary" href="./Carousel Template · Bootstrap_files/Carousel Template · Bootstrap.html">décourvir nos véhicules.</a>
            </div>
          </div>
        </div>
      </div>
      <a class="left carousel-control" href="http://getbootstrap.com/2.3.2/examples/carousel.html#myCarousel" data-slide="prev">‹</a>
      <a class="right carousel-control" href="http://getbootstrap.com/2.3.2/examples/carousel.html#myCarousel" data-slide="next">›</a>
    </div><!-- /.carousel -->



    <!-- Marketing messaging and featurettes
    ================================================== -->
    <!-- Wrap the rest of the page in another container to center all the content. -->

    <div class="container marketing">

      <!-- Three columns of text below the carousel -->
      <div class="row">
        <div class="span4">
          <img class="img-circle" data-src="holder.js/140x140" alt="140x140" src="Carousel Template · Bootstrap_files/1.png" style="width: 140px; height: 140px;">
          <h2>Location voiture avec Chauffeur</h2>
          <p>Installez-vous confortablement à bord de la limousine de luxe ou du véhicule haut de gamme de votre choix et, en toute sérénité, laissez-vous conduire. Ponctualité, discrétion et professionalisme seront les crédos de votre chauffeur. </p>
          <p><a class="btn" href="./Carousel Template · Bootstrap_files/Carousel Template · Bootstrap.html">View details »</a></p>
        </div><!-- /.span4 -->
        <div class="span4">
          <img class="img-circle" data-src="holder.js/140x140" alt="140x140" src="Carousel Template · Bootstrap_files/1.png" style="width: 140px; height: 140px;">
          <h2>Location voiture Mariage</h2>
          <p>Parce que votre mariage doit être le plus beau jour de votre vie, que la fête doit être la plus belle, nous pouvons mettre en place la location d'un véhicule de luxe pour votre mariage. La collection mariage s'adapte à vos envies. Ces véhicules de luxe viendront couronner votre bonheur.  </p>
          <p><a class="btn" href="./Carousel Template · Bootstrap_files/Carousel Template · Bootstrap.html">View details »</a></p>
        </div><!-- /.span4 -->
        <div class="span4">
          <img class="img-circle" data-src="holder.js/140x140" alt="140x140" src="Carousel Template · Bootstrap_files/1.png" style="width: 140px; height: 140px;">
          <h2>Location voiture Sport et Prestige</h2>
          <p>
          Laisser vous guider par le plaisir... Voici les véhicules de luxe que nous vous proposons : Ferrari, Lamborghini, Aston Martin, sont les plus connues mais bien d'autres modèles vous sont proposés selon vos goût, vos envies, vos impératifs. </p>
          <p><a class="btn" href="./Carousel Template · Bootstrap_files/Carousel Template · Bootstrap.html">View details »</a></p>
        </div><!-- /.span4 -->
      </div><!-- /.row -->


      <!-- START THE FEATURETTES -->

      <hr class="featurette-divider">

      <div class="featurette">
        <img class="featurette-image pull-right" src="./Carousel Template · Bootstrap_files/rental.jpg">
        <h2 class="featurette-heading">Location de véhicule de luxe. <span class="muted">A partir de 10€ le km.</span></h2>
        <p class="lead">LUXURY Rent met à votre disposition sa large gamme de véhicules à la location pour un jour, un week-end, une semaine ou plus. Découvrez dès maintenant notre sélection de véhicules disponibles à la location courte durée.En louant un véhicule chez LUXURY Rent, vous profiterez d'un accueil Haut de gamme et d'une mise en main personnalisée du véhicule afin qu'aucune de vos questions ne reste sans réponse. Un service et un niveau d'équipement haut de gamme pour une location de prestige.</p>
      </div>
      <hr class="featurette-divider">

      <!-- /END THE FEATURETTES -->
<%@ include file="footer.jsp" %>	
      
<!doctype html>
<html>
<head>
<meta charset="UTF-8">
<meta name="description" content="Saloscar"/>
<title>Saloscar</title>
<link href="themas.css" rel="stylesheet" type="text/css">
</head>

<body>
<header>
		<img src="images/logo-saloscar1.png" width="250"  alt=""/> 
	</header>
	<nav>
	  <ul class="menu">
		<li><a href="index.php">inicio</a></li>
		<li><a href="#somossaloscar">Somos saloscar</a></li>
        <li><a href="#equipo">Equipo</a></li>
        <li><a href="#video">video</a></li>
        <li><a href="#contacto">contacto</a></li>
	  </ul>
	</nav>
<main>
	<section class="fondo">
		<h1 class="bienvenido" id="somossaloscar">DESCRIPCIÓN DE LA APP</h1>
   	  	<article class="app">
			<p>Nuestro proyecto se basa en el desarrollo de una App de gestión para un concesionario de coches. Para la venta, alquiler, y reparación de los vehículos de los que dispone. </p>
			<p>Permite el registro de diferentes datos sobre los comerciales empleados, los clientes, los diferentes vehículos y sus reparaciones o revisiones, así como el periodo de alquiler y devolución de vehículos.</p>
			<p>Además, en cualquiera de los apartados, el comercial podrá ver qué coches ALQUILADOS deben ser devueltos en el periodo temporal más inmediato.</p>
		</article>
   	   </section>
	<section class="fondo">
	  <h1 class="bienvenido" id="equipo">EQUIPO SALOSCAR</h1>
	  <article class="equipo">
		  <figure class="grupo-equipo"><img src="images/oscar.png" width="200" height="200" alt=""/></figure>
		  <h3>Oscar Martinez Romero</h3>
	    <p>CEO, Dirección de cuentas </p>
	    <a href="curriculumOscar.pdf"><img src="images/iconmonstr-download-11-240.png" width="50"/></a>
      </article>
		<article class="equipo">
			<figure class="grupo-equipo"><img src="images/camilomascarelljorques.jpeg" width="200" height="200" alt=""/></figure>
			<h3>Camilo Mascarell Jorques</h3>
	    <p>Diseño creativo y web, Servidor</p>
		  <a href="curriculumCamilo.pdf"><img src="images/iconmonstr-download-11-240.png" width="50"/></a>
      </article>
		<article class="equipo">
			<figure class="grupo-equipo"><img src="images/salva.png" width="200" height="200" alt=""/></figure>
			<h3>Salva Juan Soria</h3>
	    <p>Desarrollar porgrama</p>
		  <a href="Curriculum.pdf"><img src="images/iconmonstr-download-11-240.png" width="50"/></a>
      </article>
  </section>
  <section class="fondo">
	  <h1 class="bienvenido" id="video">VIDEO</h1>
	  <iframe width="990" height="560" src="https://www.youtube-nocookie.com/embed/jc1qFErLRLM?cc_load_policy=1&amp;cc_lang_pref=es" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen=""></iframe>
  </section>
	<section class="fondo">
	  <h1 class="bienvenido" id="contacto">CONTACTO</h1>
		<article class="contacto">
			<form method="post" name="contactar" action="" enctype="multipart/form-data"> 
					<p class="form"><label for="nombre">Nombre <span class="required">*</span></label> <input id="nombre" name="nombre" size="35" type="text" value="" /></p>
					<p class="form"><label for="email">Correo electr&oacute;nico <span class="required">*</span></label> <input id="email" name="email" size="35" type="text" value="" /></p>
					<p class="form"><label for="sujeto">Sujeto</label> <input id="sujeto" name="sujeto" size="35" type="text" value="" /></p>
					<p class="form"><label for="mensaje">Mensaje <span class="required">*</span></label><textarea cols="50" id="mensaje" name="mensaje" rows="15"></textarea></p>
					<button class="enviar" value="enviar">Enviar</button>
			</form>
			<?php 
				$nombre = $_POST['nombre'];
				$email = $_POST['email'];
				$sujeto = $_POST['sujeto'];
				$mensaje = $_POST["mensaje"];
				$formcontent="From: $nombre \n Message: $mensaje";
				$recipient = "camilomascarelljorques@gmail.com";
				$sujeto = "Contact Form";
				$mailheader = "From: $email \r\n";
				mail($recipient, $sujeto, $formcontent, $mailheader) or die("Error!");
				
?>
		</article>
		<article class="contacto">
			<p><span>La información debe ser autorizada</span></p>
			<p>De forma diaria el autor de la web revisa de forma manual los comentarios que llegan a la web, a Facebook, a LinkedIn y a Twitter. Todos los comentarios están regulados. Los usuarios de la plataforma y moderadores deben comportarse en todo momento con respeto y honestidad. En el caso de la web no se publica ningún comentario sin la previa aprobación del moderador. En el caso de las redes sociales, se vigila que no se haga un mal uso de las mismas con comentarios destructivos o insultantes. Cuando sucede, se avisa de forma directa al emisor para que retire el comentario y si no sucede, es eliminado por parte de la moderadora.</p>
			<p><span>datos de contacto Sitio Web</span></p>
			<p>El formulario de contacto y el mail de la publicación está visibles en la página principal. Y las reglas de de la plataforma también son fácilmente accesibles desde el pie de la página principal.</p>
			<p><span>Política de Publicidad</span></p>
			<p>Los usuarios no pueden publiciar anuncios en forma de comentario ni en la plataforna web ni en las redes sociales. Si quieren publicitar algo deben atenerse a la Política de Publicidad del medio.</p>
		</article>
  </section>
	</main>
	<footer><p><img src="images/Florida_Xuquer.png" width="250"alt=""/></p>
    Cualquier persona puede desarrollar una página como esta a partir de los conocimientos adquiridos en © Saloscar 2020</footer>
</body>
</html>

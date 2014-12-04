<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ include file="header.jsp"%>
<body>
	<div class="container marketing">
		<div class="page-header">
			</br> </br> </br>
			<div class="jumbotron">
				<div class="container">
					<h1>Bienvenue sur la page d'administration!</h1>
					</p>
				</div>
			</div>
			<H2>Administration véhicules</H2>
			<div class="row">
				<h2 class="col-md-12">Ajout véhicule</h2>
			</div>
			<div class="row">
				<form:form role="form"
					action="${pageContext.request.contextPath}/administration/add"
					method="POST" commandName="voiture">

					<div class="form-group">
						<form:label path="marque">Marque</form:label>
						<form:input path="marque" class="form-control" />
					</div>
					<div class="form-group">
						<form:label path="modele">Modele</form:label>
						<form:input path="modele" class="form-control" />
					</div>
					<div class="form-group">
						<form:label path="couleur">Couleur</form:label>
						<form:input path="couleur" class="form-control" />
					</div>
					<div class="form-group">
						<form:label path="statut">Statut</form:label>
						<form:input path="statut" class="form-control" />
					</div>
					<div class="form-group">
						<form:label path="caution">Caution</form:label>
						<form:input path="caution" class="form-control" />
					</div>
					<div class="form-group">
						<form:label path="tarif">Tarif</form:label>
						<form:input path="tarif" class="form-control" />
					</div>
					<div class="form-group">
						<form:label path="kilometre">Kilometre</form:label>
						<form:input path="kilometre" class="form-control" />
					</div>
					<div class="form-group">
						<form:label path="annee">Année</form:label>
						<form:input path="annee" class="form-control" />
					</div>

					<button type="submit" class="btn btn-default">Ajouter</button>
				</form:form>
			</div>
			
</body>
<%@ include file="footer.jsp"%>
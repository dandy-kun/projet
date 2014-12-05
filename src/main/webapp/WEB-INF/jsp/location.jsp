<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ include file="headercopy.jsp"%>

<!-- Marketing messaging and featurettes
    ================================================== -->
<!-- Wrap the rest of the page in another container to center all the content. -->

<div class="container marketing">
	<div class="page-header">
		<h1>
			<%-- <c:set var="date" value="<%=new java.util.Date()%>" />
			 --%>LUXURY Car
			<%-- <fmt:formatDate value="${date}" type="both" timeStyle="long"
				dateStyle="long" /> --%> 
		</h1>
	</div>
	<!-- Three columns of text below the carousel -->
	<div class="row">
		<div class="span6">
			<p>
			<div class="table-responsive">
				<table class="table">
					<caption>
						<h2 class="text-left">CLient</h2>
					</caption>
					<thead>
						<tr>
							<th>id</th>
							<th>nom</th>
							<th>prenom</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${clients}" var="client">
							<tr>
								<td>${client.id}</td>
								<td>${client.nom}</td>
								<td>${client.prenom}</td>
							</tr>
						</c:forEach>

					</tbody>
				</table>
			</div>
		</div>
		<!-- /.span4 -->
		<div class="span6">
			<p>
			<div class="table-responsive">
				<table class="table">
					<caption>
						<h2 class="text-left">Voiture</h2>
					</caption>
					<thead>
						<tr>
							<th>Id</th>
							<th>Marque</th>
							<th>Modele</th>
							<th>Couleur</th>
							<th>Statut</th>
							<th>Caution</th>
							<th>Tarif</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${voitures}" var="voiture">
							<tr>
								<td>${voiture.id}</td>
								<td>${voiture.marque}</td>
								<td>${voiture.modele}</td>
								<td>${voiture.couleur}</td>
								<td>${voiture.statut}</td>
								<td>${voiture.caution}</td>
								<td>${voiture.tarif}€</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<hr>
	<div class="row">
		<div class="span6">
			<div class="table-responsive">
				<table class="table">
					<caption>
						<h2 class="test-left">Chauffeur</h2>
					</caption>
					<thead>
						<tr>
							<th></th>
							<th>nom</th>
							<th>prenom</th>
							<th>tarif</th>

						</tr>
					</thead>
					<tbody>
						<c:forEach items="${chauffeurs}" var="chauffeur">
							<tr>
								<td>${chauffeur.id}</td>
								<td>${chauffeur.nom}</td>
								<td>${chauffeur.prenom}</td>
								<td>${chauffeur.tarif}€</td>
							</tr>
						</c:forEach>

					</tbody>
				</table>
			</div>
		</div>
		<div class="span6">
			<div class="table-responsive">
				<table class="table">
					<caption>
						<h2 class="test-left">Location</h2>
					</caption>
					<thead>
						<tr>
							<th>Id</th>
							<th>Date location</th>
							<th>Date retour</th>
							<th>Prix</th>
							<th>Chauffeur</th>
							<th>Client</th>
							<th>Voiture</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${locations}" var="loc">
							<tr>
								<td>${loc.id}</td>
								<td>${loc.dateLocation}</td>
								<td>${loc.dateRetour}</td>
								<td>${loc.prix}€</td>
							</tr>
						</c:forEach>

					</tbody>
				</table>
			</div>
		</div>
		<!-- /.span4 -->
	</div>
</div>
<br />
<hr>
<div class="span6">
	<div class="table-responsive">
		<form:form role="form" action="${pageContext.request.contextPath}/location/add"
			method="POST" commandName="location">
			<form:label path="dateLocation">Date de location</form:label>
			<form:input path="dateLocation" class="form-control" />


			<form:label path="dateRetour">Date de Retour</form:label>
			<form:input path="dateRetour" class="form-control" />
			<form:label path="prix">Prix</form:label>
			<form:input path="prix" class="form-control" />
			<select name="idChauffeur">
				<c:forEach items="${chauffeurs}" var="chauffeur">
					<option value="${chauffeur.id}" class="form-control">${chauffeur.id}
						${chauffeur.nom }</option>
				</c:forEach>
			</select>
			<select name="idVoiture">
				<c:forEach items="${voitures}" var="voiture">
					<option value="${voiture.id}" class="form-control">${voiture.id}
						${voiture.marque }</option>
				</c:forEach>
			</select>
			<select name="idClient">
				<c:forEach items="${clients}" var="client">
					<option value="${client.id}" class="form-control">${client.id}
						${client.nom} ${client.prenom }</option>
				</c:forEach>
			</select>
				<div class="form-group">
					<form:select path="etat">Etat
							<form:option value="AVEC">AVEC</form:option>
						<form:option value="SANS">SANS</form:option>
					</form:select>
				</div>
			<button type="submit" class="btn btn-default">Ajouter</button>
		</form:form>
	</div>
</div>
<!-- /.row -->
<!-- /END THE FEATURETTES -->
<%@ include file="footer.jsp"%>
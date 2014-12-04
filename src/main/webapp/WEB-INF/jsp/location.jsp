<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="header.jsp"%>

<!-- Marketing messaging and featurettes
    ================================================== -->
<!-- Wrap the rest of the page in another container to center all the content. -->

<div class="container marketing">
	<div class="page-header">
		</br> </br> </br>
		<h1>
			LUXURY Car <small>Voici notre séléction de véhicule de
				prestige</small>
		</h1>
	</div>
	<!-- Three columns of text below the carousel -->
	<div class="row">
		<div class="span4">
			<p>
			<div class="table-responsive">
				<table class="table">
					<caption>
						<h2>Chauffeurs</h2>
					</caption>
					<thead>
						<tr>
							<th>Nom</th>
							<th>Prenom</th>
							<th>Tarif</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${chauffeurs}" var="chauffeur">
							<tr>
								<td>${chauffeur.nom}</td>
								<td>${chauffeur.prenom}</td>
								<td>${chauffeur.tarif}€</td>
							</tr>
						</c:forEach>

					</tbody>
				</table>
			</div>
			</p>
		</div>
		<!-- /.span4 -->
		<div class="span4">
			<p>
			<div class="table-responsive">
				<table class="table">
					<caption>
						<h2>Voitures</h2>
					</caption>
					<thead>
						<tr>
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
								<td>${voiture.marque}</td>
								<td>${voiture.modele}</td>
								<td>${voiture.couleur}</td>
								<td>${voiture.statut}</td>
								<td>${voiture.caution}</td>
								<td>${voiture.tarif}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			</p>
		</div>
		<!-- /.span4 -->
		<div class="span4">
			<p>
			<div class="table-responsive">
				<table class="table">
					<caption>
						<h2>voiture Sport et Prestige</h2>
					</caption>
					<thead>
						<tr>
							<th>Product</th>
							<th>Status</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>Product1</td>
							<td>Pending</td>
						</tr>
						<tr>
							<td>Product2</td>
							<td>Delivered</td>
						</tr>
						<tr>
							<td>Product3</td>
							<td>In Call to confirm</td>
						</tr>
						<tr>
							<td>Product4</td>
							<td>Declined</td>
						</tr>
					</tbody>
				</table>
			</div>
			</p>
		</div>
		<!-- /.span4 -->
	</div>
	<!-- /.row -->
	<!-- /END THE FEATURETTES -->
	<%@ include file="footer.jsp"%>
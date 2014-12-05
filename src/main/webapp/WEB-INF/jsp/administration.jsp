<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ include file="headercopy.jsp"%>

<h1 class="text-center">Portail d'administration</h1>
<div class="row">
	<div class="span4">
		<h2>Ajout véhicule</h2>
		<div class="table-responsive">
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
					<form:select path="statut">Statut
							<form:option value="LIBRE">LIBRE</form:option>
						<form:option value="LOCATION">LOCATION</form:option>
					</form:select>
				</div>
				<div class="form-group">
					<form:label path="caution">Caution</form:label>
					<form:input path="caution" class="form-control" />
				</div>
				<div class="form-group">
					<form:select path="tarif">Tarif
							<form:option value="5">5</form:option>
						<form:option value="6">6</form:option>
						<form:option value="7">7</form:option>
						<form:option value="8">8</form:option>
						<form:option value="9">9</form:option>
						<form:option value="10">10</form:option>
						<form:option value="11">11</form:option>
						<form:option value="12">12</form:option>
					</form:select>
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
	</div>
	<div class="span4">
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
							<td><a
								href="${pageContext.request.contextPath}/administration/remove/${voiture.id}"
								class="btn btn-danger btn-sm delete"> Supprimer </a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>
<br />
<!-- /.span4 -->
</div>
</body>
<%@ include file="footer.jsp"%>
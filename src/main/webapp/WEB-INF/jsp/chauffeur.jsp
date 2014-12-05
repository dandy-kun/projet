<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ include file="headercopy.jsp"%>

<h1 class="text-center">Portail d'administration</h1>
<div class="row">
	<div class="span4">
		<h2>Ajout  d'un chauffeur</h2>
		<div class="table-responsive">
			<form:form role="form"
				action="${pageContext.request.contextPath}/chauffeur/add"
				method="POST" commandName="chauffeur">
				<div class="form-group">
					<form:label path="nom">Nom</form:label>
					<form:input path="nom" class="form-control" />
				</div>
				<div class="form-group">
					<form:label path="prenom">Prénom</form:label>
					<form:input path="prenom" class="form-control" />
				</div>
				<div class="form-group">
					<form:select path="tarif">Tarif
							<form:option value="5">5</form:option>
						<form:option value="6">6</form:option>
						<form:option value="7">7</form:option>
						<form:option value="8">8</form:option>
						<form:option value="9">9</form:option>
						<form:option value="10">10</form:option>
						
					</form:select>
				</div>
				
				<button type="submit" class="btn btn-default">Ajouter</button>
			</form:form>
		</div>
	</div>
	<div class="span4">
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
							<td><a
								href="${pageContext.request.contextPath}/chauffeur/remove/${chauffeur.id}"
								class="btn btn-danger btn-sm delete"> Supprimer </a></td>
						</tr>
					</c:forEach>

				</tbody>
			</table>
		</div>
	</div>

	<!-- /.span4 -->
	</div>
	</body>
	<%@ include file="footer.jsp"%>

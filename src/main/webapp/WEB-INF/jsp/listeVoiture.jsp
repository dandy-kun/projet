<%@ include file="header.jsp" %>	
 <%@ page contentType="text/html; charset=UTF-8" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="headercopy.jsp"%>
   <div class="span12">
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
	</div>
	<hr>
      <!-- /END THE FEATURETTES -->
<%@ include file="footer.jsp" %>	
      
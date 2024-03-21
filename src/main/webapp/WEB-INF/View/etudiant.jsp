<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>ENS Annuaire</title>
<link rel="icon" type="image/x-icon" href="images/ENS3.png">
<link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
	<div class="principale d-flex flex-column justify-content-between">
		<div class="header">
			<jsp:include page="../Components/header.jsp" />
		</div>

		<div class="body container my-4">
			<div class="row justify-content-center">
				<div class="col-lg-8">
				<a class="btn btn-success" href="InsertEtudiant.html" role="button">Insérer</a>
					<table class="table caption-top my-2">
					<caption>Liste des étudiants</caption>
						<thead class="table-dark">
							<tr>
								<th scope="col">ID</th>
								<th scope="col">Cne</th>
								<th scope="col">Nom</th>
								<th scope="col">Prenom</th>
								<th scope="col">Departement</th>
								<th scope="col">Filiere</th>
								<th scope="col">Telephone</th>
							</tr>
						</thead>
						<tbody>
						<%-- <c:forEach items="${model.getTable() }" var="message">
							<tr>
								<td>${message.getId() }</td>
								<td>${message.getDesignation() }</td>
								<td>${message.getPrix() }</td>
								<td>${message.getQuantite() }</td>
							</tr>
						</c:forEach> --%>
						</tbody>
					</table>
				</div>
			</div>
		</div>

		<div class="footer text-center">
			<jsp:include page="../Components/footer.jsp" />
		</div>
	</div>
</body>
</html>
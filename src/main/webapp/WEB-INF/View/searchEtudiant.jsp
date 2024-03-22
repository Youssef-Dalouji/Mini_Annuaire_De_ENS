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
<script defer src="script/scriptsearchEtudiant.js"></script>
</head>
<body>
	<div class="principale d-flex flex-column justify-content-between">
		<div class="header">
			<jsp:include page="../Components/header.jsp" />
		</div>

		<div class="body">
			<div class="container">
				<div class="row justify-content-center">
					<div class="col-lg-8">
						<form name="search" id="etudiantForm" action="" method="post">
							<div class="input-group mt-5">
								<input type="search" value="${model.getKey() }" maxlength="30"
									id="nom" name="nom" class="form-control"
									placeholder="Chercher de Etudiant [Nom Complet]">
								<div class="input-group-append">
									<button type="submit" class="btn btn-primary"
										data-toggle="collapse" data-target="#searchCollapse"
										aria-expanded="false" aria-controls="searchCollapse">
										<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
											fill="currentColor" class="bi bi-search" viewBox="0 0 16 16">
                    					<path
												d="M11.742 10.344a6.5 6.5 0 1 0-1.397 1.398h-.001q.044.06.098.115l3.85 3.85a1 1 0 0 0 1.415-1.414l-3.85-3.85a1 1 0 0 0-.115-.1zM12 6.5a5.5 5.5 0 1 1-11 0 5.5 5.5 0 0 1 11 0" />
                  					</svg>
									</button>
								</div>
							</div>
						</form>
						<div>
							<c:if test="${not empty model.getKey()}">
								<table class="table table-dark table-hover mt-5">
									<thead>
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
									<tbody class="table-group-divider">
										<c:forEach items="${model.getListEtudiant()}" var="message">
											<tr class="text-center">
												<td>${message.getId() }</td>
												<td>${message.getCne()}</td>
												<td>${message.getNom()}</td>
												<td>${message.getPrenom()}</td>
												<td>${message.getDepartement()}</td>
												<td>${message.getFiliere()}</td>
												<td>${message.getTelephone()}</td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</c:if>
						</div>
					</div>
				</div>

				<div class="row justify-content-center mt-2">
					<div class="col-lg-8">
						<div class="collapse" id="searchCollapse">
							<div class="card card-body"></div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="footer text-center mt-5">
			<jsp:include page="../Components/footer.jsp" />
		</div>
	</div>
</body>
</html>
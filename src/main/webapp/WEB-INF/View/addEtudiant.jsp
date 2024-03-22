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
<script defer src="script/scriptaddEtudiant.js"></script>
</head>
<body>
	<div class="principale d-flex flex-column justify-content-between">
		<div class="header">
			<jsp:include page="../Components/header.jsp" />
		</div>

		<div class="body container my-4">
			<div class="row justify-content-center">
				<div class="col-lg-6">
					<c:if test="${success}">
						<div class="alert alert-success" role="alert">
							<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
								fill="currentColor" class="bi bi-check-circle-fill"
								viewBox="0 0 16 16">
  							<path
									d="M16 8A8 8 0 1 1 0 8a8 8 0 0 1 16 0m-3.97-3.03a.75.75 0 0 0-1.08.022L7.477 9.417 5.384 7.323a.75.75 0 0 0-1.06 1.06L6.97 11.03a.75.75 0 0 0 1.079-.02l3.992-4.99a.75.75 0 0 0-.01-1.05z" />
						</svg>
							Insertion réussie.
						</div>
					</c:if>
					<form id="etudiantForm" action="InsertEtudiant.html" method="post">
						<fieldset>
							<legend>Insertion étudiant</legend>
							<div class="mb-3">
								<label class="form-label">Cne</label> <input type="number"
									id="cne" value="${model.getCne() }" name="cne"
									class="form-control" placeholder="Cne">
							</div>
							<div class="mb-3">
								<label class="form-label">Nom</label> <input type="text"
									id="nom" value="${model.getNom() }" name="nom" maxlength="100"
									class="form-control" placeholder="Nom">
							</div>
							<div class="mb-3">
								<label class="form-label">Prenom</label> <input type="text"
									id="prenom" value="${model.getPrenom() }" name="prenom"
									maxlength="100" class="form-control" placeholder="Prenom">
							</div>
							<div class="mb-3">
								<label class="form-label">Departement</label> <br> <select
									id="departement"
									value="${model.getDepartement() }" name="departement"
									class="form-select form-select-lg mb-1"
									aria-label="Large select example">
									<c:forEach items="${departement}" var="message">
										<tr class="text-center">
											<option value="${message.getNom()}">${message.getNom()}</option>
										</tr>
									</c:forEach>
								</select>

							</div>
							<div class="mb-3">
								<label class="form-label">Filiere</label> <br> <select
									id="filiere" value="${model.getFiliere() }"
									name="filiere"
									class="form-select form-select-lg mb-1"
									aria-label="Large select example">
									<c:forEach items="${filiere}" var="message">
										<tr class="text-center">
											<option value="${message.getNom()}">${message.getNom()}</option>
										</tr>
									</c:forEach>
								</select>

							</div>
							<div class="mb-3">
								<label class="form-label">Telephone</label> <input type="text"
									id="telephone" value="${model.getTelephone() }"
									name="telephone" maxlength="16" class="form-control"
									placeholder="Telephone">
							</div>
							<button type="submit" class="btn btn-dark">Insérer</button>
							<button type="reset" class="btn btn-light ml-3">Cancel</button>
						</fieldset>
					</form>
				</div>
			</div>
		</div>

		<div class="footer text-center">
			<jsp:include page="../Components/footer.jsp" />
		</div>
	</div>
</body>
</html>
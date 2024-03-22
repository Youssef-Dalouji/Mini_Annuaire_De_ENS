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
				<a class="btn btn-success" href="InsertDepart.html" role="button">Insérer</a>
				<a class="btn btn-light ml-3" href="SearchDepart.html" role="button">Chercher</a>
					<table class="table caption-top my-2">
					<caption>Liste des départements</caption>
						<thead class="table-dark">
							<tr class="text-center">
								<th>ID</th>
								<th>Nom</th>
							</tr>
						</thead>
						<tbody>
						<c:forEach items="${model.getListDeparatement()}" var="message">
							<tr class="text-center">
								<td>${message.getId() }</td>
								<td>${message.getNom()}</td>
							</tr>
						</c:forEach>
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
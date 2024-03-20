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

		<div class="body">
			<div class="container">
				<div class="row justify-content-center">
					<div class="col-lg-8">
						<div class="input-group mt-5">
							<input type="search" id="form1" class="form-control"
								placeholder="Chercher d'étudiant">
							<div class="input-group-append">
								<button type="button" class="btn btn-primary"
									data-toggle="collapse" data-target="#searchCollapse"
									aria-expanded="false" aria-controls="searchCollapse">
									<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
										fill="currentColor" class="bi bi-search" viewBox="0 0 16 16">
                    					<path d="M11.742 10.344a6.5 6.5 0 1 0-1.397 1.398h-.001q.044.06.098.115l3.85 3.85a1 1 0 0 0 1.415-1.414l-3.85-3.85a1 1 0 0 0-.115-.1zM12 6.5a5.5 5.5 0 1 1-11 0 5.5 5.5 0 0 1 11 0" />
                  					</svg>
								</button>
							</div>
						</div>
						<div>
							<table class="table mt-5">
								<tbody>
									<tr>
										<th scope="row">1</th>
										<td>Mark</td>
										<td>Otto</td>
										<td>@mdo</td>
										<td>Mark</td>
										<td>Otto</td>
										<td>@mdo</td>
									</tr>
								</tbody>
							</table>
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
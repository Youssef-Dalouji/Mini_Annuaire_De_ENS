<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>ENS Annuaire</title>
<link rel="icon" type="image/x-icon" href="images/ENS3.png">
<link rel="stylesheet" href="css/bootstrap.min.css">
<script defer src="script/scriptaddFiliere.js"></script>
</head>
<body>
	<div class="principale d-flex flex-column justify-content-between">
    <div class="header">
        <jsp:include page="../Components/header.jsp" />
    </div>

    <div class="body container my-4">
        <div class="row justify-content-center">
            <div class="col-lg-6">
                <form id="filiereForm" action="viewProduct.php" method="post">
				    <fieldset>
				        <legend>Insertion filière</legend>
				        <div class="mb-3">
				            <label class="form-label">Nom</label>
				            <input type="text" id="nom" name="nom" class="form-control" placeholder="Nom">
				        </div>
				        <button type="submit" class="btn btn-dark">Insérer</button>
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
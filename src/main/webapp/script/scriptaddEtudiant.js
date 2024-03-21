const etudiantForm=document.getElementById("etudiantForm");
function validateForm() {
        var cne = document.getElementById("cne").value;
        var nom = document.getElementById("nom").value;
        var prenom = document.getElementById("prenom").value;
        var departement = document.getElementById("departement").value;
        var filiere = document.getElementById("filiere").value;
        var telephone = document.getElementById("telephone").value;

        if (cne.trim() === '' || nom.trim() === '' || prenom.trim() === ''
        || departement.trim() === '' || filiere.trim() === '' || telephone.trim() === '') {
            alert("Veuillez remplir tous les champs.");
            return false;
        }

        if (isNaN(cne)) {
            alert("Cne doivent être des nombres.");
            return false;
        }

        if (/^[a-zA-Z0-9- ]*$/.test(nom) == false || /^[a-zA-Z0-9- ]*$/.test(prenom) == false 
        || /^[a-zA-Z0-9- ]*$/.test(departement) == false || /^[a-zA-Z0-9- ]*$/.test(filiere) == false
        || /^[a-zA-Z0-9- ]*$/.test(telephone) == false) {
            alert("Les entrées ne doivent pas contenir de caractères spéciaux.");
            return false;
        }

        return true;
    }
 
 
etudiantForm.addEventListener("submit",(e)=>{
	
	if(!validateForm()){
		e.preventDefault()
	}
	
})  
    
    
    
    
    
    
    
    
    
    
    
    
const etudiantForm=document.getElementById("etudiantForm");
function validateForm() {
        var nom = document.getElementById("nom").value;

        if (nom.trim() === '') {
            alert("Veuillez remplir champ Nom.");
            return false;
        }


        if (/^[a-zA-Z0-9- ]*$/.test(nom) == false) {
            alert("Nom ne doivent pas contenir de caractères spéciaux.");
            return false;
        }

        return true;
    }
 
 
etudiantForm.addEventListener("submit",(e)=>{
	
	if(!validateForm()){
		e.preventDefault()
	}
	
})  
    

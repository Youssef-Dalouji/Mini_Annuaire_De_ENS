const departForm=document.getElementById("departForm");
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
 
 
departForm.addEventListener("submit",(e)=>{
	
	if(!validateForm()){
		e.preventDefault()
	}
	
})  
    

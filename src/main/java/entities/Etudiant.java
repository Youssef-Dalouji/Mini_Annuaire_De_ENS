package entities;

import java.io.Serializable;

public class Etudiant implements Serializable {
	
	private long id;
	private long cne;
	private String prenom;
	private String nom;
	private String filiere;
	private String departement;
	private String telephone;
	
	public Etudiant(long cne, String prenom, String nom, String filiere, String departement, String telephone) {
		super();
		this.cne = cne;
		this.prenom = prenom;
		this.nom = nom;
		this.filiere = filiere;
		this.departement = departement;
		this.telephone = telephone;
	}

	public Etudiant() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCne() {
		return cne;
	}

	public void setCne(long cne) {
		this.cne = cne;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getFiliere() {
		return filiere;
	}

	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "Etudiant [id=" + id + ", cne=" + cne + ", prenom=" + prenom + ", nom=" + nom + ", filiere=" + filiere
				+ ", departement=" + departement + ", telephone=" + telephone + "]";
	}
	
	
	
}

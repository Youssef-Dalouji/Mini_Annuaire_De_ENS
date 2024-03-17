package dao;

import java.util.List;

import entities.Departement;
import entities.Etudiant;
import entities.Filiere;

public interface AnnuaireInterface {
	
	public Etudiant addEtudiant();
	
	public List<Etudiant> getEtudiants();
	
	public Etudiant searchEtudiant();
	
	public Departement addDepartement();
	
	public List<Departement> getDepartement();
	
	public Departement searchDepartement();
	
	public Filiere addFiliere();
	
	public List<Filiere> getFilieres();
	
	public Filiere searchFiliere();
	
}

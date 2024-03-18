package dao;

import java.util.List;

import entities.*;

public interface AnnuaireInterface {
	
	public boolean addEtudiant(Etudiant e);
	
	public List<Etudiant> getEtudiants();
	
	public List<Etudiant> searchEtudiant(String key);
	
	public boolean addDepartement(Departement d);
	
	public List<Departement> getDepartement();
	
	public Departement searchDepartement(String key);
	
	public boolean addFiliere(Filiere f);
	
	public List<Filiere> getFilieres();
	
	public Filiere searchFiliere(String key);
	
}

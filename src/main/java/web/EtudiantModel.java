package web;

import java.util.List;

import entities.Etudiant;

public class EtudiantModel {

	private String key;
	private List<Etudiant> listEtudiant;
	Etudiant etudiant;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public List<Etudiant> getListEtudiant() {
		return listEtudiant;
	}
	public void setListEtudiant(List<Etudiant> listEtudiant) {
		this.listEtudiant = listEtudiant;
	}
	public Etudiant getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(Etudiant etu) {
		this.etudiant = etu;
	}
	
	
}

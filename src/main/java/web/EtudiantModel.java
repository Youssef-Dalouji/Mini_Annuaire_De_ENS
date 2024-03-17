package web;

import java.util.List;

import entities.Etudiant;

public class EtudiantModel {

	private String key;
	private List<Etudiant> listEtudiant;
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
	
	
	
}

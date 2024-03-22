package web;

import java.util.List;

import entities.Filiere;

public class FiliereModel {

	private String key;
	private List<Filiere> listFiliere;
	private Filiere filiere;
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public List<Filiere> getListFiliere() {
		return listFiliere;
	}
	public void setListFiliere(List<Filiere> listFiliere) {
		this.listFiliere = listFiliere;
	}
	public Filiere getFiliere() {
		return filiere;
	}
	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}
	
	
	
}

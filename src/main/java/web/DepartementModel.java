package web;

import java.util.List;

import entities.Departement;

public class DepartementModel {
	
	private String key;
	private List<Departement> listDeparatement;
	private Departement departement;
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public List<Departement> getListDeparatement() {
		return listDeparatement;
	}
	public void setListDeparatement(List<Departement> listDeparatement) {
		this.listDeparatement = listDeparatement;
	}
	public Departement getDepartement() {
		return departement;
	}
	public void setDepartement(Departement d) {
		this.departement = d;
	}
	
	
	
}

package web;

import java.util.List;

import entities.Departement;

public class DepartementModel {
	
	private String key;
	private List<Departement> listDeparatement;
	
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
	
	
	
}

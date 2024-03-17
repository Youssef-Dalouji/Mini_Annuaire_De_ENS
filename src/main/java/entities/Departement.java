package entities;

import java.io.Serializable;

public class Departement implements Serializable {
	
	private long id;
	private String nom;
	
	public Departement(String nom) {
		super();
		this.nom = nom;
	}
	
	public Departement() {
		super();
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	@Override
	public String toString() {
		return "Departement [id=" + id + ", nom=" + nom + "]";
	}
	
}

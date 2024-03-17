package entities;

import java.io.Serializable;

public class Filiere implements Serializable {
	
	private long id;
	private String nom;
	
	public Filiere(String nom) {
		super();
		this.nom = nom;
	}
	
	public Filiere() {
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
		return "Filiere [id=" + id + ", nom=" + nom + "]";
	}
	
	
	
}

package dao;

import java.sql.*;
import java.util.*;

import entities.Departement;
import entities.Etudiant;
import entities.Filiere;

public class AnnuaireImpl implements AnnuaireInterface {
	
	private Connection connection=SingletonConnection.getConnection();
	final private String INSERTETUDIANT	="INSERT INTO ETUDIANT(CNE,NOM,PRENOM,DEPARTEMENT,FILIERE,TELEPHONE) "
			+ "VALUES(?,?,?,?,?,?)";
	final private String SELECTETUDIANTS="SELECT * FROM ETUDIANT";
	final private String SEARCHETUDIANT="SELECT * FROM etudiant WHERE CONCAT(prenom, nom) = ? OR CONCAT(nom, prenom) = ?;";
	final private String INSERTDEPARTEMENT="INSERT INTO DEPARTEMENT(NOM) VALUES(?)";
	final private String SELECTDEPARTEMENTS="SELECT * FROM DEPARTEMENT";
	final private String SEARCHDEPARTEMENT="SELECT * FROM DEPARTEMENT WHERE NOM=?";
	final private String INSERTFILIERE="INSERT INTO FILIERE(NOM) VALUES(?)";
	final private String SELECTFILIERE="SELECT * FROM FILIERE";
	final private String SEARCHFILIERE="SELECT * FROM FILIERE WHERE NOM=?";
	
	@Override
	public boolean addEtudiant(Etudiant e) {
		try {
			PreparedStatement ps=connection.prepareStatement(INSERTETUDIANT);
			ps.setLong(1, e.getCne());
			ps.setString(2,e.getNom());
			ps.setString(3,e.getPrenom());
			ps.setString(4,e.getDepartement());
			ps.setString(5,e.getFiliere());
			ps.setString(6,e.getTelephone());
			ps.executeUpdate();
			ps.close();
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Etudiant> getEtudiants() {
		List<Etudiant> listEtudiant=new ArrayList();
		try {
			PreparedStatement ps=connection.prepareStatement(SELECTETUDIANTS);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Etudiant e=new Etudiant();
				e.setId(rs.getInt("id"));
				e.setCne(rs.getLong("cne"));
				e.setNom(rs.getString("nom"));
				e.setPrenom(rs.getString("prenom"));
				e.setDepartement(rs.getString("departement"));
				e.setFiliere(rs.getString("filiere"));
				e.setTelephone(rs.getString("telephone"));
				listEtudiant.add(e);
			}
			ps.close();
			rs.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return listEtudiant;
	}

	@Override
	public List<Etudiant> searchEtudiant(String key) {
		List<Etudiant> listEtudiant=new ArrayList();
		try {
			PreparedStatement ps=connection.prepareStatement(SEARCHETUDIANT);
			ps.setString(1, key);
			ps.setString(2, key);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Etudiant e=new Etudiant();
				e.setId(rs.getInt("id"));
				e.setCne(rs.getLong("cne"));
				e.setNom(rs.getString("nom"));
				e.setPrenom(rs.getString("prenom"));
				e.setDepartement(rs.getString("departement"));
				e.setFiliere(rs.getString("filiere"));
				e.setTelephone(rs.getString("telephone"));
				listEtudiant.add(e);
			}
			ps.close();
			rs.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return listEtudiant;
	}

	@Override
	public boolean addDepartement(Departement d) {
		try {
			PreparedStatement ps=connection.prepareStatement(INSERTDEPARTEMENT);
			ps.setString(1,d.getNom());
			ps.executeUpdate();
			ps.close();
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Departement> getDepartements() {
		List<Departement> listDepartement=new ArrayList();
		try {
			PreparedStatement ps=connection.prepareStatement(SELECTDEPARTEMENTS);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Departement d=new Departement();
				d.setId(rs.getInt("id"));
				d.setNom(rs.getString("nom"));
				listDepartement.add(d);
			}
			ps.close();
			rs.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return listDepartement;
	}

	@Override
	public Departement searchDepartement(String key) {
		Departement d=new Departement();
		try {
			PreparedStatement ps=connection.prepareStatement(SEARCHDEPARTEMENT);
			ps.setString(1, key);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				d.setId(rs.getInt("id"));
				d.setNom(rs.getString("nom"));
			}
			ps.close();
			rs.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return d;
	}

	@Override
	public boolean addFiliere(Filiere f) {
		try {
			PreparedStatement ps=connection.prepareStatement(INSERTFILIERE);
			ps.setString(1,f.getNom());
			ps.executeUpdate();
			ps.close();
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Filiere> getFilieres() {
		List<Filiere> listFiliere=new ArrayList();
		try {
			PreparedStatement ps=connection.prepareStatement(SELECTFILIERE);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Filiere f=new Filiere();
				f.setId(rs.getInt("id"));
				f.setNom(rs.getString("nom"));
				listFiliere.add(f);
			}
			ps.close();
			rs.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return listFiliere;
	}

	@Override
	public Filiere searchFiliere(String key) {
		Filiere f=new Filiere();
		try {
			PreparedStatement ps=connection.prepareStatement(SEARCHFILIERE);
			ps.setString(1, key);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				f.setId(rs.getInt("id"));
				f.setNom(rs.getString("nom"));
			}
			ps.close();
			rs.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}

}

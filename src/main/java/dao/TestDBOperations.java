package dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import entities.*;

public class TestDBOperations {
	
	AnnuaireInterface annuaire;
	
	@Before
	public void setUp() throws Exception {
		annuaire=new AnnuaireImpl();
	}

	@Test
	public void testAddEtudiant() {
		final long CNE=54658;
		final String NOM="Ibrahimi";
		final String PRENOM="Ibrahim";
		final String DEPARTEMENT="Arabic";
		final String FILIERE="Arabic Literature";
		final String TELEPHONE="9851984261";
		boolean addEtudiantState=annuaire.addEtudiant(new Etudiant(CNE,NOM,PRENOM,DEPARTEMENT,FILIERE,TELEPHONE));
		assertTrue("The condition should be true", addEtudiantState);
	}

	@Test
	public void testGetEtudiants() {
		List<Etudiant> listEtudiant=annuaire.getEtudiants();
		assertEquals("List Etudaints should be great than 0",true,listEtudiant.size()>0);
	}

	@Test
	public void testSearchEtudiant() {
		final String key="AhmadiAhmed";
		List<Etudiant> listEtudiant=annuaire.searchEtudiant(key);
		assertEquals("List Etudaints should be great than 0",true,listEtudiant.size()>0);
	}

	@Test
	public void testAddDepartement() {
		final String DEPARTEMENT="Arabic";
		boolean addDepartementState=annuaire.addDepartement(new Departement(DEPARTEMENT));
		assertTrue("The condition should be true", addDepartementState);
	}

	@Test
	public void testGetDepartements() {
		List<Departement> listDepartement=annuaire.getDepartements();
		assertEquals("List Departement should be great than 0",true,listDepartement.size()>0);
	}

	@Test
	public void testSearchDepartement() {
		final String key="Infromatique";
		Departement departement=annuaire.searchDepartement(key);
		assertNotNull("Nom object Departement should not be null", departement.getNom());
	}

	@Test
	public void testAddFiliere() {
		final String FILIERE="Arabic Literature";
		boolean addFiliereState=annuaire.addFiliere(new Filiere(FILIERE));
		assertTrue("The condition should be true", addFiliereState);
	}

	@Test
	public void testGetFilieres() {
		List<Filiere> listFiliere=annuaire.getFilieres();
		assertEquals("List Departement should be great than 0",true,listFiliere.size()>0);
	}

	@Test
	public void testSearchFiliere() {
		final String key="Ingénierie Informatique";
		Filiere filiere=annuaire.searchFiliere(key);
		assertNotNull("Nom object Filiere should not be null", filiere.getNom());
	}

}

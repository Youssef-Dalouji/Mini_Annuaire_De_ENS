package web;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.safety.Safelist;

import dao.*;
import entities.*;

public class AnnuaireEns extends HttpServlet {
	AnnuaireInterface AnnuaireImpl;
	@Override
	public void init() throws ServletException {
		AnnuaireImpl=new AnnuaireImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path=request.getServletPath();
		if (path.equals("/InsertDepart.html") && (request.getMethod().equals("GET") || request.getMethod().equals("POST"))) {
			if(request.getMethod().equals("POST")) {
				String nom=request.getParameter("nom") != null?this.filterInputsDepartementAndFiliere(request.getParameter("nom")):"";
				Departement department=new Departement();
				if(nom!=null && nom.length()>0) {
					department.setNom((nom.substring(0, 1).toUpperCase() + nom.substring(1)).trim());
					AnnuaireImpl.addDepartement(department);
				}
				request.setAttribute("success", true);
				request.setAttribute("model", department);
			}
			if(request.getMethod().equals("GET")) {
				request.setAttribute("success", false);
			}
			request.getRequestDispatcher("/WEB-INF/View/addDepartement.jsp").forward(request, response);
			return;
	    }
		if (path.equals("/Departements.html") && request.getMethod().equals("GET")) {
			DepartementModel departmentModel =new DepartementModel();
			List <Departement> departmentList =AnnuaireImpl.getDepartements();
			departmentModel.setListDeparatement(departmentList );
			request.setAttribute("model", departmentModel);
			request.getRequestDispatcher("/WEB-INF/View/departement.jsp").forward(request, response);
			return;
	    }
		if (path.equals("/SearchDepart.html") && (request.getMethod().equals("GET") || request.getMethod().equals("POST"))) {
			String nom=request.getParameter("nom") != null?this.filterInputsDepartementAndFiliere(request.getParameter("nom")):"";
			Departement departement=null;
			DepartementModel departementModel=new DepartementModel();
			if(nom!=null && nom.length()>0) {
				departement=AnnuaireImpl.searchDepartement((nom.substring(0, 1).toUpperCase() + nom.substring(1)).trim());
				departementModel.setKey(nom);
				departementModel.setDepartement(departement);
			}
			request.setAttribute("model",departementModel);
			request.getRequestDispatcher("/WEB-INF/View/searchDepartement.jsp").forward(request, response);
			return;
	    }
		if (path.equals("/InsertEtudiant.html") && (request.getMethod().equals("GET") || request.getMethod().equals("POST"))) {
			if(request.getMethod().equals("POST")) {
				long cne=request.getParameter("cne") != null?Long.parseLong(this.filterInputsDepartementAndFiliere(request.getParameter("cne"))):0l;
				String nom=request.getParameter("nom") != null?this.filterInputsDepartementAndFiliere(request.getParameter("nom")):"";
				String prenom=request.getParameter("prenom") != null?this.filterInputsDepartementAndFiliere(request.getParameter("prenom")):"";
				String departement=request.getParameter("departement") != null?this.filterInputsDepartementAndFiliere(request.getParameter("departement")):"";
				String filiere=request.getParameter("filiere") != null?this.filterInputsDepartementAndFiliere(request.getParameter("filiere")):"";
				String telephone=request.getParameter("telephone") != null?this.filterInputsDepartementAndFiliere(request.getParameter("telephone")):"";
				Etudiant etudiant = null;
				if(cne != 0l && nom!=null && nom.length()>0 && prenom!=null && prenom.length()>0
				 && departement!=null && departement.length()>0 && filiere!=null && filiere.length()>0
				 && telephone!=null && telephone.length()>0) {
					etudiant=new Etudiant(cne,(prenom.substring(0, 1).toUpperCase() + prenom.substring(1)).trim(),
					(nom.substring(0, 1).toUpperCase() + nom.substring(1)).trim(),
					(departement.substring(0, 1).toUpperCase() + departement.substring(1)).trim()
					,(filiere.substring(0, 1).toUpperCase() + filiere.substring(1)).trim(),
					telephone.trim());
					AnnuaireImpl.addEtudiant(etudiant);
				}
				request.setAttribute("success", true);
				request.setAttribute("model", etudiant);
			}
			if(request.getMethod().equals("GET")) {
				request.setAttribute("success", false);
			}
			List<Departement> listDepartement=AnnuaireImpl.getDepartements();
			List<Filiere> listFiliere=AnnuaireImpl.getFilieres();
			request.setAttribute("departement", listDepartement);
			request.setAttribute("filiere", listFiliere);
			request.getRequestDispatcher("/WEB-INF/View/addEtudiant.jsp").forward(request, response);
			return;
	    }
		if (path.equals("/Etudiants.html") && request.getMethod().equals("GET")) {
			EtudiantModel etudiantModel =new EtudiantModel();
			List <Etudiant> etudiantList =AnnuaireImpl.getEtudiants();
			etudiantModel.setListEtudiant(etudiantList);
			request.setAttribute("model", etudiantModel);
			request.getRequestDispatcher("/WEB-INF/View/etudiant.jsp").forward(request, response);
			return;
	    }
		if (path.equals("/SearchEtudiant.html") && (request.getMethod().equals("GET") || request.getMethod().equals("POST"))) {
			String nom=request.getParameter("nom") != null?this.filterInputsDepartementAndFiliere(request.getParameter("nom")):"";
			String keyNom=nom;
			List <Etudiant> etudiant;
			EtudiantModel etudiantModel=new EtudiantModel();
			if(nom!=null && nom.length()>0) {
				nom=this.formatSearchEtudiant(nom);
				etudiant=(List<Etudiant>) AnnuaireImpl.searchEtudiant(nom);
				etudiantModel.setKey(keyNom);
				etudiantModel.setListEtudiant(etudiant);
			}
			request.setAttribute("model",etudiantModel);
			request.getRequestDispatcher("/WEB-INF/View/searchEtudiant.jsp").forward(request, response);
			return;
	    }
		if (path.equals("/InsertFiliere.html") && (request.getMethod().equals("GET") || request.getMethod().equals("POST"))) {
			if(request.getMethod().equals("POST")) {
				String nom=request.getParameter("nom") != null?this.filterInputsDepartementAndFiliere(request.getParameter("nom")):"";
				Filiere filiere=new Filiere();
				if(nom!=null && nom.length()>0) {
					filiere.setNom((nom.substring(0, 1).toUpperCase() + nom.substring(1)).trim());
					AnnuaireImpl.addFiliere(filiere);
				}
				request.setAttribute("success", true);
				request.setAttribute("model", filiere);
			}
			if(request.getMethod().equals("GET")) {
				request.setAttribute("success", false);
			}
			request.getRequestDispatcher("/WEB-INF/View/addFiliere.jsp").forward(request, response);
			return;
	    }
		if (path.equals("/Filieres.html") && request.getMethod().equals("GET")) {
			FiliereModel filiereModel =new FiliereModel();
			List <Filiere> filiereList =AnnuaireImpl.getFilieres();
			filiereModel.setListFiliere(filiereList);
			request.setAttribute("model", filiereModel);
			request.getRequestDispatcher("/WEB-INF/View/filiere.jsp").forward(request, response);
			return;
	    }
		if (path.equals("/SearchFiliere.html") && (request.getMethod().equals("GET") || request.getMethod().equals("POST"))) {
			String nom=request.getParameter("nom") != null?this.filterInputsDepartementAndFiliere(request.getParameter("nom")):"";
			Filiere filiere=null;
			FiliereModel filiereModel=new FiliereModel();
			if(nom!=null && nom.length()>0) {
				filiere=AnnuaireImpl.searchFiliere((nom.substring(0, 1).toUpperCase() + nom.substring(1)).trim());
				filiereModel.setKey(nom);
				filiereModel.setFiliere(filiere);
			}
			request.setAttribute("model",filiereModel);
			request.getRequestDispatcher("/WEB-INF/View/searchFiliere.jsp").forward(request, response);
			return;
	    }
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	private String filterInputsDepartementAndFiliere(String str) {
		if(!str.isEmpty()) {
			str=Jsoup.clean(str, Safelist.none());
			return str;
		}
		return null;
	}
	
	private String formatSearchEtudiant(String str) {
		String nomPrenomString = str.trim();
		String[] nomAndPrenom;
		if (this.containsSpace(nomPrenomString)) {
			nomAndPrenom = nomPrenomString.split("\\s+");
			nomPrenomString=nomAndPrenom[0].substring(0, 1).toUpperCase() + nomAndPrenom[0].substring(1) + nomAndPrenom[1].substring(0, 1).toUpperCase() + nomAndPrenom[1].substring(1);
        }
        return nomPrenomString;
	}
	
	private boolean containsSpace(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                return true;
            }
        }
        return false;
    }

}

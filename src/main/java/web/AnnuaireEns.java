package web;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AnnuaireEns extends HttpServlet {
	@Override
	public void init() throws ServletException {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path=request.getServletPath();
		if (path.equals("/InsertDepart.html") && request.getMethod().equals("GET")) {
			request.getRequestDispatcher("/WEB-INF/View/addDepartement.jsp").forward(request, response);
			return;
	    }
		if (path.equals("/Departements.html") && request.getMethod().equals("GET")) {
			request.getRequestDispatcher("/WEB-INF/View/departement.jsp").forward(request, response);
			return;
	    }
		if (path.equals("/SearchDepart.html") && request.getMethod().equals("GET")) {
			request.getRequestDispatcher("/WEB-INF/View/searchDepartement.jsp").forward(request, response);
			return;
	    }
		if (path.equals("/InsertEtudiant.html") && request.getMethod().equals("GET")) {
			request.getRequestDispatcher("/WEB-INF/View/addEtudiant.jsp").forward(request, response);
			return;
	    }
		if (path.equals("/Etudiants.html") && request.getMethod().equals("GET")) {
			request.getRequestDispatcher("/WEB-INF/View/etudiant.jsp").forward(request, response);
			return;
	    }
		if (path.equals("/SearchEtudiant") && request.getMethod().equals("GET")) {
			request.getRequestDispatcher("/WEB-INF/View/searchEtudiant.jsp").forward(request, response);
			return;
	    }
		if (path.equals("/InsertFiliere.html") && request.getMethod().equals("GET")) {
			request.getRequestDispatcher("/WEB-INF/View/addFiliere.jsp").forward(request, response);
			return;
	    }
		if (path.equals("/Filieres.html") && request.getMethod().equals("GET")) {
			request.getRequestDispatcher("/WEB-INF/View/filiere.jsp").forward(request, response);
			return;
	    }
		if (path.equals("/SearchFiliere.html") && request.getMethod().equals("GET")) {
			request.getRequestDispatcher("/WEB-INF/View/searchFiliere.jsp").forward(request, response);
			return;
	    }
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

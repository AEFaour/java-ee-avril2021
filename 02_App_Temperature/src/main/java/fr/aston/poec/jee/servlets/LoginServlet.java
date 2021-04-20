package fr.aston.poec.jee.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.aston.poec.jee.models.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet de classe " + getClass().getSimpleName());
		
		//String login = request.getParameter("");
		request.getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(request, response);
	
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String mdp = request.getParameter("mdp");
		System.out.printf("email %s & mot de passe %s", email, mdp);
		if(email.equalsIgnoreCase("stagiaire@aston.fr") && mdp.equals("Password147")) {
			
			User user = new User(email, mdp);
			
			HttpSession session = request.getSession();
			
			session.setAttribute("user", user);
			response.sendRedirect("converter");
			
		}else {
			
			String message = "Utilisateur inconnue du Systeme";
			request.setAttribute("msgErreur", message);
			//doGet(request, response);
			response.sendRedirect("login");
			
		}
	}

}

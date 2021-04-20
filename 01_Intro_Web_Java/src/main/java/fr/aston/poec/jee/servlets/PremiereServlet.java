package fr.aston.poec.jee.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/prem")
public class PremiereServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		System.out.println("Init de classe " + getClass().getSimpleName());
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet de classe " + getClass().getSimpleName());
		
	

		/*resp.setContentType("text/html; charset=utf-8");

		PrintWriter out = resp.getWriter();

		out.println("<!doctype html");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Premiere Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Un petit bonjour de puis la servlet</h1>");
		out.println("<h2>Il est actuellement " + LocalTime.now() + "</h2>");
		out.println("</body>");
		out.println("</html>");*/
		
		String message = "Un petit bonjour depuis la servlet";
		request.setAttribute("msg", message);
		
		
		LocalTime heure = LocalTime.now();
		
		request.setAttribute("heure", heure);
		
		String prenom = request.getParameter("prenom");
		request.setAttribute("prenom", prenom);
		
		request.getRequestDispatcher("/Newp.jsp").forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost de classe " + getClass().getSimpleName());
	}

	/*
	 * @Override public void destroy() {
	 * System.out.println("Avant de la destruction de classe" +
	 * getClass().getSimpleName()); }
	 */

}

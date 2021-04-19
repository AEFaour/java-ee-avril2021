package fr.aston.poec.jee.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MaServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Init de la servlet " + getClass().getSimpleName());
	}

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet de la servlet" + getClass().getSimpleName());
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.out.println("doPost de la servlet" + getClass().getSimpleName());
				System.out.println("Alex");
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Avant destruction de la servlet"  + getClass().getSimpleName());
	}
	
	/*@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("protected -> service");
		String method = req.getMethod();
		System.out.println(method);
		
		if(method.equals("GET")) {
			
		}
	}*/
	
	
	/*@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("public -> service");
		String method = ((HttpServletRequest)req).getMethod();
		System.out.println(method);
	}*/
}

/*
 * Une servelet est une classe java qui etend HttpServlet
 * 
 * Par convention , un projet web en Java EE doit contenir un fichier web.xml
 * Le web.xml soit imperationvement se trouver dans WEB-INF
 */

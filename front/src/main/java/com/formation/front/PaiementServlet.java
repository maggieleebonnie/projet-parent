package com.formation.front;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.formation.back.Calculator;


@WebServlet("/Paie")
public class PaiementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Recuperation des donnees utilisateur
		String cpt1=request.getParameter("cpt1");
		String cpt2=request.getParameter("cpt2");
		String montant=request.getParameter("mnt");
		
		
		
		// Connexion a la base de donnees
		System.out.println("Get compte1 info from db:   "+cpt1);
		System.out.println("Get compte2 info from db:   "+cpt2);
		
		// Debit + Crdit
		System.out.println("Compte1-montant:");
		System.out.println("Compte2+montant:");
		
		
		// Mise à jour de la base de donnees
		
		System.out.println("MAJ compte1");
		System.out.println("MAJ compte2");	
		
		//Calcul addition
		
		Calculator c =new Calculator();
		System.out.println("adding 4+5 : "+c.add(4, 5));
		System.out.println("adding 4*5 : "+c.multiply(4, 5));
		
		// Redirection vers page de resultat
		if(Math.random()<0.5) {
			request.getRequestDispatcher("result.jsp").forward(request,response);
		 } else {
			request.getRequestDispatcher("bad.jsp").forward(request,response);
		 }
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

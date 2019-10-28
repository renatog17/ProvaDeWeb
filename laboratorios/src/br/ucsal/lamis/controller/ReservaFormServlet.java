package br.ucsal.lamis.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.lamis.util.Repositorio;

/**
 * Servlet implementation class ReservaFormServlet
 */
@WebServlet("/ReservaForm")
public class ReservaFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReservaFormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Repositorio repositorio = (Repositorio) request.getSession().getServletContext().getAttribute("repositorio");
		request.setAttribute("laboratorios", repositorio.getLaboratorios());
		request.setAttribute("reservas", repositorio.getReservas());
		System.out.println(repositorio.getLaboratorios().get(0).getNome());
		request.getRequestDispatcher("reservaForm.jsp").forward(request, response);
	}



}

package br.ucsal.lamis.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.lamis.model.Laboratorio;
import br.ucsal.lamis.util.Repositorio;

/**
 * Servlet implementation class LaboratorioSalvarServlet
 */
@WebServlet("/LaboratorioSalvar")
public class LaboratorioSalvarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//<input type="hidden" name="id" > 
		String sId = request.getParameter("id");

		//<input type="text" name="nome" > 
		String nome = request.getParameter("nome");
		
		//<input type="text" name="descricao" >	
		String descricao = request.getParameter("descricao");
		
		// <select name="bloco">
		String sIdBloco = request.getParameter("bloco");

		Repositorio repositorio = (Repositorio) request.getSession().getServletContext().getAttribute("repositorio");

		Laboratorio laboratorio = null;
		if(sId != null && !sId.trim().isEmpty() ) {
			laboratorio = repositorio.obterLaboratorio(Integer.parseInt(sId));
		}else {
			laboratorio = new Laboratorio();
		}
		laboratorio.setNome(nome);
		laboratorio.setDescricao(descricao);
		laboratorio.setBloco(repositorio.obterBloco(Integer.parseInt(sIdBloco)));
		repositorio.salvarLaboratorio(laboratorio);
		
		response.sendRedirect("./LaboratorioLista");
		
	}

}

package br.com.gcontato.servlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import javax.servlet.ServletException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdicionaContatoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	public AdicionaContatoServlet() {
		super();
	}
	
	@Override
	
	protected void service(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException, IOException{
		PrintWriter out = response.getWriter();
		String nome = request.getParameter("nome");
		out.println("<p> Seu Nome é: </p>" + nome);
		
		String fone = request.getParameter("fone");
		out.println("<p> Seu Telefone é: </p>" + fone);
		
		String endereco = request.getParameter("endereco");
		out.println("<p> Seu Endereço é: </p>" + endereco);
	}
	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response)
		throws ServletException, IOException{
		
	}
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response)
		throws ServletException, IOException{
		
	}

}

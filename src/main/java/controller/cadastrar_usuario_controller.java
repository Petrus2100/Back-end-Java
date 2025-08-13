package controller;

import java.io.IOException;

import dao.CadastroDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Cadastro; 

/**
 * Servlet implementation class cadastrar_usuario_controller
 */
@WebServlet("/cadastrar_usuario_controller")
public class cadastrar_usuario_controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public cadastrar_usuario_controller() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
	    request.setCharacterEncoding("UTF-8");
	    response.setContentType("text/html; charset=UTF-8");

	    String nome = request.getParameter("nome");
	    String email = request.getParameter("email");
	    String telefone = request.getParameter("telefone");
	    String senha = request.getParameter("senha");

	    if (nome == null || nome.isEmpty() || 
	        email == null || email.isEmpty() || 
	        telefone == null || telefone.isEmpty() || 
	        senha == null || senha.isEmpty()) {

	        response.getWriter().println("Por favor, preencha todos os campos obrigatórios.");
	    } else {
	        // Criar objeto com os dados
	        Cadastro cadastro = new Cadastro(nome, email, telefone, senha);

	        // Inserir no banco
	        CadastroDao dao = new CadastroDao();
	        dao.cadastrar(cadastro);

	        response.getWriter().println("Cadastro realizado com sucesso!");
	        System.out.println("Cadastro inserido no banco com sucesso!");
	    }
	}
}

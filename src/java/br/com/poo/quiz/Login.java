package br.com.poo.quiz;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Renan
 */
public class Login extends HttpServlet {

    
   

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");
                Usuario user = BancoUsuarios.getUsuarios().get(0);
                Usuario user1 = BancoUsuarios.getUsuarios().get(1);
                Usuario user2 = BancoUsuarios.getUsuarios().get(2);
                Usuario user3 = BancoUsuarios.getUsuarios().get(3);
                System.out.println(user);
		if ((usuario.equals(user.getNmUsuario()))||(usuario.equals(user1.getNmUsuario()))||(usuario.equals(user2.getNmUsuario()))||(usuario.equals(user3.getNmUsuario()))) { //usuário = admin sem senha por enquanto
			HttpSession session = request.getSession(true); // iniciando sessão
			session.setAttribute("user", usuario);
			response.sendRedirect("home.jsp");
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("telalogin.jsp");
			out.println("('Usuário e/ou senha incorretos.')");
                        rd.include(request, response);
		} 
    }
    
}
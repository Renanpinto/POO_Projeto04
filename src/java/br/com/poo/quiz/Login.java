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
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		if (usuario.equals("admin")) { //usuário = admin sem senha por enquanto
			HttpSession session = request.getSession(true); // iniciando sessão
			session.setAttribute("user", usuario);
			response.sendRedirect("quiz.jsp");
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
			out.println("<font color=red>Usuário ou senha incorretos.</font>");
			rd.include(request, response);
		} 
    }
}
package pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    LoginDAO logDao = new LoginDAO();
    ServletContext ctx;
    RequestDispatcher rd;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
		ctx=getServletContext();
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String un=request.getParameter("uname");
		String pw=request.getParameter("pass");

		
		int res= logDao.validate(un,pw);
		if(res==1) {
			rd=ctx.getRequestDispatcher("/inter.jsp");
			rd.forward(request,response);
		}
		else if(res==0){
			rd=ctx.getRequestDispatcher("/login.jsp");
			rd.include(request,response);
			out.println("<font color=red>User or password may be invalid <br>  pl try again  </font>");
		}
		}
		
		catch (Exception e)
		{

		System.out.println(e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

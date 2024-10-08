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
 * Servlet implementation class CustServlet
 */
@WebServlet("/CustServlet")
public class CustServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CustPojo cp=new CustPojo();
    CustDAO cDao=new CustDAO();
    ServletContext ctx;
    RequestDispatcher rd;
    PrintWriter out;
    String action;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustServlet() {
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
			 out=response.getWriter();
			action=request.getParameter("action");

			switch(action)
			{
			case "insert":
			insert(request,response);
			break;
			case "update":
			update(request,response);
			break;
			case "delete":
			delete(request,response);
			break;
			}
		}
		catch (Exception e)
		{

		System.out.println(e);
		}
	}
	private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		int id1=Integer.parseInt(id);
		cDao.delete(id1);
		rd=ctx.getRequestDispatcher("/viewUser.jsp");
		rd.include(request,response);
		out.println("<font >\"deleted\" </font>");
		
		out.println("<br><a href=\"regUpdate.jsp\"><input type=\"submit\" value=\"back\"/></a>" );
		 
		
	}

	protected void insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			System.out.println(action);
			//String id=request.getParameter("id");
			String fn=request.getParameter("fname");
			String ln=request.getParameter("lname");
			String ag=request.getParameter("age");
			String ge=request.getParameter("gender");
			String ci=request.getParameter("city");
			String occ=request.getParameter("occupation");
			String cno=request.getParameter("cno");
			String ano=request.getParameter("ano");
			String atp=request.getParameter("acctype");
			int ag11=Integer.parseInt(ag);
			int ano1=Integer.parseInt(ano);
			//cp.setId(id1);
			cp.setFname(fn);
			cp.setLname(ln);
			cp.setAge(ag11);
			cp.setGender(ge);
			cp.setCity(ci);
			cp.setOcc(occ);
			cp.setCno(cno);	
			cp.setAcctype(atp);
			cp.setAno(ano1);
		    int res= cDao.custinsert(cp);
		    System.out.println(res);
		    int rs=cDao.accinsert(cp);
		    if(res>=1 && rs>=1){
				out.println("inserted");
				out.println("<br><a href=\"inter.jsp\"><input type=\"submit\" value=\"back\"/></a>");

		    }
		    else {
		    	out.println("not inserted");
				out.println("<br><a href=\"inter.jsp\"><input type=\"submit\" value=\"back\"/></a>");
		    }
		
	}
	protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(action);
		String id=request.getParameter("custid");
		String fn=request.getParameter("fname");
		String ln=request.getParameter("lname");
		String ag=request.getParameter("age");
		String ge=request.getParameter("gender");
		String ci=request.getParameter("city");
		String occ=request.getParameter("occupation");
		String cno=request.getParameter("cno");
		String ano=request.getParameter("ano");
		String atp=request.getParameter("acctype");
		int ag11=Integer.parseInt(ag);
		int id1=Integer.parseInt(id);
		int ano1=Integer.parseInt(ano);
		cp.setCustID(id1);
		cp.setFname(fn);
		cp.setLname(ln);
		cp.setAge(ag11);
		cp.setGender(ge);
		cp.setCity(ci);
		cp.setOcc(occ);
		cp.setCno(cno);	
		cp.setAno(ano1);
		cp.setAcctype(atp);		
	    int res= cDao.custupdate(cp);
	    int rs=cDao.accupdate(cp);
	    if(res>=1 && rs>=1){
			rd=ctx.getRequestDispatcher("/inter.jsp");
			rd.include(request,response);
			out.println("updated");		
			
			out.println("<br><a href=\"inter.jsp\"><input type=\"submit\" value=\"back\"/></a>" );
	    }
	    else {
			rd=ctx.getRequestDispatcher("/inter.jsp");
			rd.include(request,response);
			out.println("not updated");		
			
			out.println("<br><a href=\"inter.jsp\"><input type=\"submit\" value=\"back\"/></a>" );
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

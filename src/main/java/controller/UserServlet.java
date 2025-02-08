package controller;



import dao.UserDAO;
import entity.User;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/")
public class UserServlet extends HttpServlet{
	private static final long serialVersionUID=1L;
	private UserDAO userDAO;
	
	public void init()
	{
		userDAO=new UserDAO();
	}
	
	
	public void doPost(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse)
	{
		doGet(httpServletRequest,httpServletResponse);
	}
	public void doGet(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse)
	{
		String mapp=httpServletRequest.getServletPath();
		try {
			switch(mapp)
			{
			case "/insert":
			{
				addUser(httpServletRequest,httpServletResponse);
				break;
			}
			case "/demo":
			{
				httpServletResponse.sendRedirect("demo.jsp");
				break;
			}
			
			default:
			{
				System.out.println("Default case!!");
				break;
			}
			
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}


	private void addUser(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception
	{
		String name=httpServletRequest.getParameter("name");
		String email=httpServletRequest.getParameter("email");
		String country=httpServletRequest.getParameter("country");
		User tmp=new User(name,email,country);
		userDAO.inserUser(tmp);
		httpServletResponse.sendRedirect("");
		
	}
	
	
	

}

package myServlet;


import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class Controller extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public Controller() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	protected void processRequest(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, java.io.IOException {
		// 代码（1）通过Model来实现对不同请求的分发
		String next="";
		ArticleCommand command = new ArticleCommand();
		next = command.doArticle(request, response, 
				request.getParameter("command"));
		// 代码（2） 
		dispatch(request, response, next);
	}
	
	protected void dispatch(HttpServletRequest request,
            HttpServletResponse response,String page)
           throws javax.servlet.ServletException, java.io.IOException {
		RequestDispatcher dispatcher = 
            getServletContext().getRequestDispatcher(page); 
		dispatcher.forward(request, response); 
}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		processRequest(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		processRequest(request, response);
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}
	
	public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

}

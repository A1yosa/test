package myServlet;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;
/**
Connection conn=null;
String con_user = "example1";
String con_password = "example1";
String con_dburl = "jdbc:oracle:thin:@localhost:iasdb";
String con_driver = "oracle.jdbc.driver.OracleDriver";
PreparedStatement pstmt=null;
ResultSet rsComment=null;
Vector vectorComment = new Vector();
String selectSQL= "SELECT content, time FROM article ORDER BY time DESC"
try {
	DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
	Class.forName(con_driver); 
	conn = DriverManager.getConnection(con_dburl,con_user,con_password);  
	pstmt=conn.prepareStatement(selectSQL);
	rsComment=pstmt.executeQuery();
	while(rsComment.next()) {
		CommentItem commentItem = new CommentItem();
		commentItem.setContent(rsComment.getString(1));
		commentItem.setTime(rsComment.getDate(2)); 
		vectorComment.add(commentItem);
	}
	vectorComment.trimToSize();
} catch (Exception e){  //做相应的处理 }
*/


public class ArticleCommand {
	public String doArticle(HttpServletRequest request,
	            HttpServletResponse response,String input)
	            throws javax.servlet.ServletException{
		 if (input.equals("showAllarticle")) {
				return getAllArticle (request, response);
		 }
		else if(input.equals("showOnearticle")){
				return getOneArticle(request, response);
		 }
		else if(input.equals("showOther")){
				return getOther(request, response);
		 }
		else 
			return "/error.jsp";
	    }
	
    public String getAllArticle(HttpServletRequest request,
            HttpServletResponse response)
            throws javax.servlet.ServletException{
		request.setAttribute("vectorComment ", null);
		return "/showallarticle.jsp"; 
    }
    public String getOneArticle(HttpServletRequest request,
            HttpServletResponse response)
            throws javax.servlet.ServletException {
 		request.setAttribute("vectorOne ", null);
		return "/showonearticle.jsp"; 
    }
    public String getOther(HttpServletRequest request,
            HttpServletResponse response)
            throws javax.servlet.ServletException{
		request.setAttribute("vectorOne ", null);
		return "/showother.jsp"; 
    }
}

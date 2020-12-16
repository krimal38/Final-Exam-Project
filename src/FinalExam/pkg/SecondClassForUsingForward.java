package FinalExam.pkg;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class SecondClassForUsingForward
 */

@WebServlet("/SecondClassForUsingForward")
public class SecondClassForUsingForward extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondClassForUsingForward() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		String fetchData = (String) request.getAttribute("sendData");
		
		
		String[] splitStr = fetchData.split("\\s+");
		
		Arrays.sort(splitStr);
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> newList = new ArrayList<>();
		
		for(int i =0; i<splitStr.length; i++) {
			list.add(splitStr[i]);
		}
		
		
		for(String str: list) {
			if(!newList.contains(str)) {
				newList.add(str);
			}
		}
		out.print("<center>");
		out.println("<h3>The unique string is printed in ascending order:</h3>");
		out.print("</center>");
		out.print("<center>");
		out.println("<title>Second Servlet</title>");
		out.println("<body style=\" background-color: rgba(201, 76, 76, 0.3);\">");
		out.println("<textarea id=\"text\" style=\"color:rgb(0,0,0)\" name= \"text1\" rows=\"20\" cols=\"50\" disabled> ");
		   for( int i =0;i<newList.size();i++){
			   out.print(newList.get(i) + "\n" );
			   
		   }
		   out.println("");
		   out.println("</textarea>");
		   out.print("</center>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	

}

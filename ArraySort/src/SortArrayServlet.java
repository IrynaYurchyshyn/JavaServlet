

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SortArrayServlet")
public class SortArrayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SortArrayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int[] array = new int[5]; 
		
		array[0] = Integer.parseInt(request.getParameter("a0"));
		array[1] = Integer.parseInt(request.getParameter("a1"));
		array[2] = Integer.parseInt(request.getParameter("a2"));
		array[3] = Integer.parseInt(request.getParameter("a3"));
		array[4] = Integer.parseInt(request.getParameter("a4"));

//		int[] ar = {0, 4, 5, -5, 6};
		
		Array sort = new Array(array);
		
		PrintWriter out = response.getWriter();
		
		out.println("User array: " + Arrays.toString(array));
		out.println("Sort array: " + Arrays.toString(sort.sortArray()));
		
	}
}

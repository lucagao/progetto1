

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EsempioTesto
 */
@WebServlet("/EsempioTesto")
public class EsempioTesto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EsempioTesto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");          // content type
        PrintWriter output = response.getWriter();     // get writer
        // crea una pagina HTML e la invia al client 
        output.println("<html>");
        output.println("<head>");
              output.println("<title>Primo esempio di servlet </title>");
        output.println("</head>");
        output.println("<body bgcolor=\"white\">");
        output.println("<h1>Buongiorno, questa è la prima servlet!</h1>");
        output.println("</body>");
        output.println("</html>");
	}

}
